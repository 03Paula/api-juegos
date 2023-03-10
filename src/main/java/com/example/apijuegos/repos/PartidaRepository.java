package com.example.apijuegos.repos;

import com.example.apijuegos.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface PartidaRepository extends JpaRepository<Partida,Long>{
    List<Partida> findAllByJugador_IdOrderByPuntosDesc(Long id);


}
