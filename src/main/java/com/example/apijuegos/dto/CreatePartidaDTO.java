package com.example.apijuegos.dto;

import com.example.apijuegos.model.Dificultad;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter @Getter
public class CreatePartidaDTO {
    private Long id_juego;
    private Long id_jugador;
    private String palabra;
    private Long intentos;
    private String dificultad;
    private Long puntos;
    private LocalDateTime fecha_hora;

}
