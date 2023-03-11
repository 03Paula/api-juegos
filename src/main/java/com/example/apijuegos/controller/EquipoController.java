package com.example.apijuegos.controller;

import com.example.apijuegos.errors.EquipoNotFoundException;
import com.example.apijuegos.model.Equipo;
import com.example.apijuegos.repos.EquipoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class EquipoController {

    private final EquipoRepository equipoRepository;

    /**
     * Obtenemos todos los equipos.
     *
     * @return Listado de los equipos.
     */
    @GetMapping("/equipos")
    public ResponseEntity<List<?>> getAllEquipos(){
        List<Equipo> equipos = equipoRepository.findAll();
        if (equipos.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.ok(equipos);
        }
    }


    /**
     * Obtenemos un equipo por su Id.
     *
     * @param id Identificación del equipo.
     * @return Equipo | Error 404.
     */
    @GetMapping("/equipo/{id}")
    public Equipo getEquipoById(@PathVariable Long id) {
        return equipoRepository.findById(id)
                .orElseThrow(() -> new EquipoNotFoundException(id));
    }


    /**
     * Eliminamos un equipo por du Id.
     *
     * @param id Identificador del equipo
     * @return Código 204.
     */
    @DeleteMapping("/equipo/{id}")
    public ResponseEntity<Void> deleteEquipoById(@PathVariable Long id) {
        Equipo equipo = equipoRepository.findById(id).orElseThrow(() -> new EquipoNotFoundException(id));
        equipoRepository.delete(equipo);

        return ResponseEntity.noContent().build();
    }


    /**
     * Creamos un nuevo equipo.
     *
     * @param nuevoequipo Datos del nuevo equipo.
     * @return equipo nuevo.
     */
    @PostMapping("/equipo")
    public ResponseEntity<?> newEquipo(@RequestBody Equipo nuevoequipo){
        return ResponseEntity.status(HttpStatus.CREATED).body(equipoRepository.save(nuevoequipo));
    }


    /**
     * Modificamos un equipo.
     *
     * @param mod .
     * @param id Identificador del equipo.
     * @return Equipo actualizado | Código 404 si no existe.
     */
    @PutMapping("/equipo/{id}")
    public  Equipo updateEquipo(@RequestBody Equipo mod , @PathVariable Long id){
        return equipoRepository.findById(id).map(e -> {
            e.setNombre_equipo(mod.getNombre_equipo());
            e.setPuntos(mod.getPuntos());
            e.setLogo(mod.getLogo());
            e.setLast_mod(LocalDateTime.now());
            return equipoRepository.save(e);

        }).orElseThrow(() -> new EquipoNotFoundException(id));
    }

}
