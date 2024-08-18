package com.Emazon.api_emazon.mapper;

import com.Emazon.api_emazon.dto.PersonaDto;
import com.Emazon.api_emazon.persistencia.entity.PersonaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDto personaDtoToPersonaEntity(PersonaEntity personaEntity);

    PersonaEntity personaEntityToPersonaDto(PersonaDto personaDto);
}
