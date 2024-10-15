package com.educfusion.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educfusion.demo.models.ResultadoAcademico;
import com.educfusion.demo.services.ResultadoAcademicoService;

import java.util.List;

@RestController
@RequestMapping("/resultados")
public class ResultadoAcademicoController {

    @Autowired
    private ResultadoAcademicoService resultadoAcademicoService;

    @GetMapping
    public ResponseEntity<List<ResultadoAcademico>> getAllResultados() {
        List<ResultadoAcademico> resultados = resultadoAcademicoService.findAll();
        return ResponseEntity.ok(resultados);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResultadoAcademico> getResultadoById(@PathVariable Integer id) {
        ResultadoAcademico resultado = resultadoAcademicoService.findById(id);
        return ResponseEntity.ok(resultado);
    }

    @PostMapping
    public ResponseEntity<ResultadoAcademico> createResultado(@RequestBody ResultadoAcademico resultadoAcademico) {
        ResultadoAcademico savedResultado = resultadoAcademicoService.save(resultadoAcademico);
        return ResponseEntity.ok(savedResultado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResultado(@PathVariable Integer id) {
        resultadoAcademicoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/filter/centro/{centroId}")
    public ResponseEntity<List<ResultadoAcademico>> filterByCentroId(@PathVariable Integer centroId) {
        List<ResultadoAcademico> filteredResultados = resultadoAcademicoService.findByCentroId(centroId);
        return ResponseEntity.ok(filteredResultados);
    }

    @GetMapping("/filter/año/{añoAcademico}")
    public ResponseEntity<List<ResultadoAcademico>> filterByAñoAcademico(@PathVariable Integer añoAcademico) {
        List<ResultadoAcademico> filteredResultados = resultadoAcademicoService.findByAñoAcademico(añoAcademico);
        return ResponseEntity.ok(filteredResultados);
    }

    @GetMapping("/filter/nivel/{nivelEducativo}")
    public ResponseEntity<List<ResultadoAcademico>> filterByNivelEducativo(@PathVariable String nivelEducativo) {
        List<ResultadoAcademico> filteredResultados = resultadoAcademicoService.findByNivelEducativo(nivelEducativo);
        return ResponseEntity.ok(filteredResultados);
    }
}
