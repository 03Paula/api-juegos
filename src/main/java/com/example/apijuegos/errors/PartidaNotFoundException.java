package com.example.apijuegos.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PartidaNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 43874491117560211L;

    public PartidaNotFoundException(Long id){
        super("No se ha podido encontrar la partida cuya ID es: " + id);
    }
}
