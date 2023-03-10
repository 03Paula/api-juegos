package com.example.apijuegos.controller;

import com.example.apijuegos.dto.CreateJugadorDTO;
import com.example.apijuegos.dto.JugadorDTO;
import com.example.apijuegos.dto.ModJugadorDTO;
import com.example.apijuegos.dto.converter.JugadorDTOConverter;
import com.example.apijuegos.errors.JugadorNotFoundException;
import com.example.apijuegos.model.Equipo;
import com.example.apijuegos.model.Jugador;
import com.example.apijuegos.repos.EquipoRepository;
import com.example.apijuegos.repos.JugadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class JugadorController {
    private final JugadorRepository jugadorRepository;
    private final EquipoRepository equipoRepository;
    private final JugadorDTOConverter jugadorDTOConverter;

    /**
     * Se obtienen todos los jugadores.
     *
     * @return lista de los jugadores.
     */
    @GetMapping("/jugadores")
    public ResponseEntity<List<?>> getAlljugadores() {
        List<Jugador> jugadores = jugadorRepository.findAll();
        if(jugadores.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        else{
            List<JugadorDTO> dtoList =
                    jugadores.stream().map(jugadorDTOConverter::convertToDTO).collect(Collectors.toList());
            return ResponseEntity.ok(dtoList);
        }
    }

    /**
     * Obtenemos un jugador con su Id.
     *
     * @param id Identidicación del jugador.
     * @return Jugador | Error 404
     */
    @GetMapping("/jugador/{id}")
    public Jugador getJugadorbyId(@PathVariable Long id){
        return jugadorRepository.findById(id)
                .orElseThrow(() -> new JugadorNotFoundException(id));
    }


    /**
     * Eliminamos un jugador por su id.
     *
     * @param id Identidicación del jugador.
     * @return Código 204.
     */
    @DeleteMapping("/jugador/{id}")
    public ResponseEntity<Void> deleteJugadorById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findById(id).orElseThrow(() -> new JugadorNotFoundException(id));
        jugadorRepository.delete(jugador);

        return ResponseEntity.noContent().build();
    }

    /**
     * Creamos un nuevo jugador.
     *
     * @param nuevojug Datos del jugador nuevo.
     * @return jugador nuevo.
     */
    @PostMapping("/jugadores")
    public ResponseEntity<?> newJugador(@RequestBody CreateJugadorDTO nuevojug){
        Jugador njugador = new Jugador();
        Equipo equipo = null;
        njugador.setNombre(nuevojug.getNombre());
        njugador.setAvatar(nuevojug.getAvatar());
        if(nuevojug.getId_equipo() != null){
            equipo = equipoRepository.findById(nuevojug.getId_equipo()).orElse(null);
        }
        njugador.setEquipo(equipo);
        njugador.setPuntos(nuevojug.getPuntos());
        njugador.setLast_mod(LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.CREATED).body(jugadorRepository.save(njugador));

    }

    /**
     * Actualizamos un jugador.
     *
     * @param newJugador .
     * @param id Identificador del jugador.
     * @return Jugador actualizado | Código 404 si no lo encuentra.
     */
    @PutMapping("/jugador/{id}")
    public Jugador updateJugador(@RequestBody ModJugadorDTO newJugador, @PathVariable Long id){
        Equipo equipo = null;
        if (newJugador.getId_equipo() != null){
            equipo = equipoRepository.findById(newJugador.getId_equipo()).orElse(null);
        }

        final Equipo nEquipo = equipo;
        return jugadorRepository.findById(id).map(jug -> {
            jug.setNombre(newJugador.getNombre());
            jug.setAvatar(newJugador.getAvatar());
            jug.setEquipo(nEquipo);
            jug.setPuntos(newJugador.getPuntos());
            jug.setLast_mod(LocalDateTime.now());
            return jugadorRepository.save(jug);
        }).orElseThrow(() -> new JugadorNotFoundException(id));
    }
}