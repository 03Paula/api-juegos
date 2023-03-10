package com.example.apijuegos.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_jugador")
    @JsonBackReference
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name="id_juego")
    @JsonBackReference
    private Juego juego;

    @Enumerated(EnumType.STRING)
    @Column(name="dificultad")
    private Dificultad dificultad;

    private  Long intentos;
    private Long puntos;
    private String palabra;
    private LocalDateTime fecha_hora;

}
