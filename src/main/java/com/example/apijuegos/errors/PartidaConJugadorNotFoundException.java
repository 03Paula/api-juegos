package com.example.apijuegos.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PartidaConJugadorNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 43874481117560211L;

    public PartidaConJugadorNotFoundException(Long id){
        super("No se ha podido encontrar la partida con el jugador cuya ID es : " + id);
    }
}
