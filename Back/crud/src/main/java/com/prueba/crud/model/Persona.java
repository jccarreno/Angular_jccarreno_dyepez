package com.prueba.crud.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Persona
{
    @Id
    private Long numDocumento;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String correoElectronico;
}
