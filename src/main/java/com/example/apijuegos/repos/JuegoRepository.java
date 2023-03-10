package com.example.apijuegos.repos;

import com.example.apijuegos.model.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
public interface JuegoRepository extends JpaRepository<Juego,Long> {
}
