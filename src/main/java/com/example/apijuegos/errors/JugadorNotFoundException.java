package com.example.apijuegos.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class JugadorNotFoundException extends RuntimeException {
    private static final  long serialVersionUID = 43876691117760211L;

    public JugadorNotFoundException (Long id){
        super("No se ha podido encontrar al jugador cuya ID es : " + id);
    }
}
