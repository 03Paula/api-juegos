package com.example.apijuegos.dto.converter;

import com.example.apijuegos.model.Jugador;
import com.example.apijuegos.dto.JugadorDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class JugadorDTOConverter {
    private final ModelMapper modelMapper;

    public JugadorDTO convertToDTO (Jugador jugador){
        return modelMapper.map(jugador, JugadorDTO.class);
    }
}
