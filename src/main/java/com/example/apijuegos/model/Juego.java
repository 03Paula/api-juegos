package com.example.apijuegos.model;

import com.example.apijuegos.model.Dificultad;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;

import java.util.Set;


@Data
@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String instrucciones;

    @Enumerated(EnumType.STRING)
    @Column(name="dificultad", nullable = false)
    private Dificultad dificultad;

    private Long intentos_max;

    @JsonManagedReference
    @OneToMany(mappedBy = "juego", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Partida> partidas;

}
