package com.example.apijuegos.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PalabraNotFoundException extends RuntimeException{
    private static final  long serialVersionUID = 43838693337760211L;

    public PalabraNotFoundException(String cadena){
        super("No hay palabras que contengan la cadena: " + cadena);
    }

}
