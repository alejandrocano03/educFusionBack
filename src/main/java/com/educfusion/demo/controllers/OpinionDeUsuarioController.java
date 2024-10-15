package com.educfusion.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educfusion.demo.models.OpinionDeUsuario;
import com.educfusion.demo.services.OpinionDeUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/opiniones")
public class OpinionDeUsuarioController {

    @Autowired
    private OpinionDeUsuarioService opinionService;

    @GetMapping
    public ResponseEntity<List<OpinionDeUsuario>> getAllOpiniones() {
        List<OpinionDeUsuario> opiniones = opinionService.findAll();
        return ResponseEntity.ok(opiniones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OpinionDeUsuario> getOpinionById(@PathVariable Integer id) {
        OpinionDeUsuario opinion = opinionService.findById(id);
        return ResponseEntity.ok(opinion);
    }

    @PostMapping
    public ResponseEntity<OpinionDeUsuario> createOpinion(@RequestBody OpinionDeUsuario opinion) {
        OpinionDeUsuario savedOpinion = opinionService.save(opinion);
        return ResponseEntity.ok(savedOpinion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOpinion(@PathVariable Integer id) {
        opinionService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/filter/centro/{centroId}")
    public ResponseEntity<List<OpinionDeUsuario>> filterByCentroId(@PathVariable Integer centroId) {
        List<OpinionDeUsuario> filteredOpiniones = opinionService.filterByCentroId(centroId);
        return ResponseEntity.ok(filteredOpiniones);
    }
}
