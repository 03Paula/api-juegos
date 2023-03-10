package com.example.apijuegos.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter @Getter
public class ModJugadorDTO {

    private String nombre;

    private String avatar;

    private Long id_equipo;

    private Long puntos;

}
