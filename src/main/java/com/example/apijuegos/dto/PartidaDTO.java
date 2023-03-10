package com.example.apijuegos.dto;

import com.example.apijuegos.model.Dificultad;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class PartidaDTO {
    private Long id;
    private LocalDateTime fecha_hora;
    private Long jugadorId;
    private Long juegoId;
    private String palabra;
    private String dificultad;
    private Long intentos;
    private Long puntos;
    private String juegoNombre;


}
