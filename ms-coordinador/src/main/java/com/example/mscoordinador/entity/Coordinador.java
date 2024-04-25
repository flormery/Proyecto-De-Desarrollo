package com.example.mscoordinador.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Coordinador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String telefono;
    private String correo_electronico;
    private String validar_informe;
    private String fecha_inicio;
    private String fecha_finalizacion;
}
