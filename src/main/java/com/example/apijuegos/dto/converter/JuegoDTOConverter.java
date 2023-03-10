package com.example.apijuegos.dto.converter;

import com.example.apijuegos.dto.JuegoDTO;
import com.example.apijuegos.model.Juego;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JuegoDTOConverter {
    private final ModelMapper modelMapper;

    public JuegoDTO convertToDTO(Juego juego){
        return modelMapper.map(juego, JuegoDTO.class);
    }
}
