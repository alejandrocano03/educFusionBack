package com.educfusion.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educfusion.demo.models.MapaInteractivo;
import com.educfusion.demo.services.MapaInteractivoService;

import java.util.List;

@RestController
@RequestMapping("/mapas")
public class MapaInteractivoController {

    @Autowired
    private MapaInteractivoService mapaService;

    @GetMapping
    public ResponseEntity<List<MapaInteractivo>> getAllMapas() {
        List<MapaInteractivo> mapas = mapaService.findAll();
        return ResponseEntity.ok(mapas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MapaInteractivo> getMapaById(@PathVariable Integer id) {
        MapaInteractivo mapa = mapaService.findById(id);
        return ResponseEntity.ok(mapa);
    }

    @PostMapping
    public ResponseEntity<MapaInteractivo> createMapa(@RequestBody MapaInteractivo mapa) {
        MapaInteractivo savedMapa = mapaService.save(mapa);
        return ResponseEntity.ok(savedMapa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMapa(@PathVariable Integer id) {
        mapaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/filter/centro/{centroId}")
    public ResponseEntity<List<MapaInteractivo>> filterByCentroId(@PathVariable Integer centroId) {
        List<MapaInteractivo> filteredMapas = mapaService.findByCentroId(centroId);
        return ResponseEntity.ok(filteredMapas);
    }
}
