package com.example.mscoordinador.controller;

import com.example.mscoordinador.entity.Coordinador;
import com.example.mscoordinador.service.CoordinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coordinador")
public class CoordinadorController {

    @Autowired
    private CoordinadorService coordinadorService;

    @GetMapping
    public ResponseEntity<List<Coordinador>> listar() {
        return ResponseEntity.ok(coordinadorService.listar());
    }

    @PostMapping
    public ResponseEntity<Coordinador> guardar(@RequestBody Coordinador coordinador) {
        return ResponseEntity.ok(coordinadorService.guardar(coordinador));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coordinador> buscarPorId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(coordinadorService.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Coordinador> editar(@PathVariable(required = true) Integer id, @RequestBody Coordinador coordinador) {
        coordinador.setId(id);
        return ResponseEntity.ok(coordinadorService.editar(coordinador));
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable(required = true) Integer id) {
        coordinadorService.eliminar(id);
        return "Eliminación completa";
    }
}
