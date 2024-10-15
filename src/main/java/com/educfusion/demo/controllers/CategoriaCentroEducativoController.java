package com.educfusion.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educfusion.demo.models.CategoriaCentroEducativo;
import com.educfusion.demo.services.CategoriaCentroEducativoService;

@RestController
@RequestMapping("/categorias")
public class CategoriaCentroEducativoController {

    @Autowired
    private CategoriaCentroEducativoService categoriaService;

    @GetMapping
    public ResponseEntity<List<CategoriaCentroEducativo>> getAllCategorias() {
        List<CategoriaCentroEducativo> categorias = categoriaService.findAll();
        return ResponseEntity.ok(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaCentroEducativo> getCategoriaById(@PathVariable Integer id) {
        CategoriaCentroEducativo categoria = categoriaService.findById(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping
    public ResponseEntity<CategoriaCentroEducativo> createCategoria(@RequestBody CategoriaCentroEducativo categoria) {
        CategoriaCentroEducativo savedCategoria = categoriaService.save(categoria);
        return ResponseEntity.ok(savedCategoria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Integer id) {
        categoriaService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
