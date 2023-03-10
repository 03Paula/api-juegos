package com.example.apijuegos.errors;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class JuegoNotFoundException extends RuntimeException {
    private static final  long serialVersionUID = 43838691117760211L;

    public JuegoNotFoundException (Long id){
        super("No se ha podido encontrar el juego cuya ID es: " + id);
    }
}
