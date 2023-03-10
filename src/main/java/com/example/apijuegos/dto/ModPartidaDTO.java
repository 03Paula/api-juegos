package com.example.apijuegos.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ModPartidaDTO {
    private LocalDateTime fecha_hora;
    private Long intentos;
    private String dificultad;
    private Long puntos;
    private Long id_juego;
    private Long id_jugador;

    private String palabra;
}
