package com.example.apijuegos.dto.converter;

import com.example.apijuegos.model.Partida;
import com.example.apijuegos.dto.PartidaDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PartidaDTOConverter {
    private final ModelMapper modelMapper;

    public PartidaDTO convertToDTO (Partida partida){
        return modelMapper.map(partida, PartidaDTO.class);
    }

}
