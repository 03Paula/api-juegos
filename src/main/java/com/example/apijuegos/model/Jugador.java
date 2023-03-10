package com.example.apijuegos.model;

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
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String avatar;

    @ManyToOne
    @JoinColumn(name="id_equipo")
    private Equipo equipo = null;

    private Long puntos;

    private LocalDateTime last_mod;

}
