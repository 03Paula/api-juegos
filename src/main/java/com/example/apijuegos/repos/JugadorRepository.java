package com.example.apijuegos.repos;

import com.example.apijuegos.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
public interface JugadorRepository extends JpaRepository<Jugador, Long>{
}
