package com.Emazon.api_emazon.persistencia;

import com.Emazon.api_emazon.dto.PersonaDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

///Solo guardar en la base de datos
@Repository
public class PersonaRepositoryImpl {
    private ArrayList<PersonaDto> baseDeDatos;

    public PersonaRepositoryImpl() {
        this.baseDeDatos = new ArrayList<>();
        this.baseDeDatos.add(new PersonaDto("Sofia", "Pedroza"));
    }

    public List<PersonaDto> obtenerPersonas(){
        return this.baseDeDatos;
    }

    public  PersonaDto crearPersona(PersonaDto persona){
        this.baseDeDatos.add(persona);
        return persona;
    }
}
