package com.example.apijuegos.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EquipoNotFoundException extends RuntimeException {
    private static final  long serialVersionUID = 43876691117760211L;

    public EquipoNotFoundException (Long id){
        super("No se ha podido encontrar al equipo cuya ID es : " + id);
    }
}
