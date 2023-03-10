package com.example.apijuegos.dto;

import com.example.apijuegos.model.Dificultad;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JuegoDTO {
    private Long id;
    private Dificultad dificultad;
    private String nombre;
    private String instrucciones;
    private Integer intentos_max;
}
