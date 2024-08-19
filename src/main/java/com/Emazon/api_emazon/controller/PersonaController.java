package com.Emazon.api_emazon.controller;


import com.Emazon.api_emazon.dto.PersonaDto;
import com.Emazon.api_emazon.mapper.PersonaMapper;
import com.Emazon.api_emazon.persistencia.PersonaRepositoryImpl;
import com.Emazon.api_emazon.persistencia.entity.PersonaEntity;
import com.Emazon.api_emazon.persistencia.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Su responsabilidad es recibir peticiones, prueba
@RestController
@RequestMapping("/personas")
@RequiredArgsConstructor
public class PersonaController {


    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;
//    private final PersonaRepositoryImpl personaRepository;


//    public PersonaController(PersonaRepositoryImpl pRepository) {
//        this.personaRepository = pRepository;
//    }

//    private ArrayList<PersonaDto> baseDeDatos;
//
//    public PersonaController() {
//        this.baseDeDatos = new ArrayList<>();
//        this.baseDeDatos.add(new PersonaDto("Sofia", "Pedroza"));
//    }

//    @GetMapping("/{nombre}")
//    private PersonaDto obtenerHola(@PathVariable String nombre,
//                                   @RequestParam(required = false) String apellido){
//        return new PersonaDto(nombre, apellido);
//    }

//    @GetMapping()
//    private List<PersonaDto> obtenerPersona(){
//        return personaRepository
//                .findAll()
//                .stream()
//                .map(personaEntity -> new PersonaDto(personaEntity.getNombre(), personaEntity.getApellido()))
//                .collect(Collectors.toList());
//    }

    @GetMapping()
    private List<PersonaDto> obtenerPersona(){
        return personaRepository
                .findAll()
                .stream()
                .map(personaEntity -> personaMapper.personaDtoToPersonaEntity(personaEntity))
                .collect(Collectors.toList());
    }

    @GetMapping("/nombre")
    private List<PersonaDto> obtenerPersonaNombre(){
        return personaRepository
                .findAll()
                .stream()
                .map(personaEntity -> personaMapper.personaDtoToPersonaEntity(personaEntity))
                .collect(Collectors.toList());
    }

    @PostMapping
    private PersonaDto crearPersona(@RequestBody PersonaDto persona){
        //personaRepository.crearPersona(persona);
//        this.personaRepository.save(
//                new PersonaEntity(null, persona.getNombre(), persona.getApellido())
//        );
        this.personaRepository.save(
                personaMapper.personaEntityToPersonaDto(persona)
        );
        return persona;
    }

}
