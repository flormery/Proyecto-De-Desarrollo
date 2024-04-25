package com.example.mscoordinador.service.impl;

import com.example.mscoordinador.entity.Coordinador;
import com.example.mscoordinador.repository.CoordinadorRepository;
import com.example.mscoordinador.service.CoordinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoordinadorServiceImpl implements CoordinadorService {

    @Autowired
    private CoordinadorRepository coordinadorRepository;

    @Override
    public List<Coordinador> listar() {
        return coordinadorRepository.findAll();
    }

    @Override
    public Coordinador guardar(Coordinador coordinador) {
        return coordinadorRepository.save(coordinador);
    }

    @Override
    public Coordinador buscarPorId(Integer id) {
        Optional<Coordinador> optionalCoordinador = coordinadorRepository.findById(id);
        return optionalCoordinador.orElse(null); // Devuelve null si no se encuentra el coordinador
    }

    @Override
    public Coordinador editar(Coordinador coordinador) {
        return coordinadorRepository.save(coordinador);
    }

    @Override
    public void eliminar(Integer id) {
        coordinadorRepository.deleteById(id);
    }
}
