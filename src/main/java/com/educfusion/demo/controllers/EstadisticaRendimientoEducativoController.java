package com.educfusion.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educfusion.demo.models.EstadisticaRendimientoEducativo;
import com.educfusion.demo.services.EstadisticaRendimientoEducativoService;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class EstadisticaRendimientoEducativoController {

    @Autowired
    private EstadisticaRendimientoEducativoService estadisticaService;

    @GetMapping
    public ResponseEntity<List<EstadisticaRendimientoEducativo>> getAllEstadisticas() {
        List<EstadisticaRendimientoEducativo> estadisticas = estadisticaService.findAll();
        return ResponseEntity.ok(estadisticas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadisticaRendimientoEducativo> getEstadisticaById(@PathVariable Integer id) {
        EstadisticaRendimientoEducativo estadistica = estadisticaService.findById(id);
        return ResponseEntity.ok(estadistica);
    }

    @PostMapping
    public ResponseEntity<EstadisticaRendimientoEducativo> createEstadistica(@RequestBody EstadisticaRendimientoEducativo estadistica) {
        EstadisticaRendimientoEducativo savedEstadistica = estadisticaService.save(estadistica);
        return ResponseEntity.ok(savedEstadistica);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstadistica(@PathVariable Integer id) {
        estadisticaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/filter/centro/{centroId}")
    public ResponseEntity<List<EstadisticaRendimientoEducativo>> filterByCentroId(@PathVariable Integer centroId) {
        List<EstadisticaRendimientoEducativo> filteredEstadisticas = estadisticaService.filterByCentroId(centroId);
        return ResponseEntity.ok(filteredEstadisticas);
    }

    @GetMapping("/filter/año")
    public ResponseEntity<List<EstadisticaRendimientoEducativo>> filterByAño(@RequestParam Integer ano) {
        List<EstadisticaRendimientoEducativo> filteredEstadisticas = estadisticaService.filterByAnoAcademico(ano);
        return ResponseEntity.ok(filteredEstadisticas);
    }

    @GetMapping("/filter/nivel")
    public ResponseEntity<List<EstadisticaRendimientoEducativo>> filterByNivel(@RequestParam String nivel) {
        List<EstadisticaRendimientoEducativo> filteredEstadisticas = estadisticaService.filterByNivelEducativo(nivel);
        return ResponseEntity.ok(filteredEstadisticas);
    }
}
