package com.example.mscoordinador.service;

import com.example.mscoordinador.entity.Coordinador;

import java.util.List;
import java.util.Optional;

public interface CoordinadorService {
    public List<Coordinador> listar();
    public Coordinador guardar(Coordinador categoria);
    public Coordinador buscarPorId(Integer id);
    public Coordinador editar(Coordinador categoria);
    public void eliminar(Integer id);
}
