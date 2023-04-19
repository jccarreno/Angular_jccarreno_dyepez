package com.prueba.crud.service;
import com.prueba.crud.model.Persona;

public interface PersonaService
{
    Persona newPerson(Persona newPerson);
    Iterable<Persona> getAll();
    Persona modifyPerson(Persona persona);
    Boolean deletePerson(Long idPersona);
}
