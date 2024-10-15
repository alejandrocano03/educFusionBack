package com.educfusion.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educfusion.demo.models.CentroEducativo;
import com.educfusion.demo.services.CentroEducativoService;

import java.util.List;

@RestController
@RequestMapping("/centros")
public class CentroEducativoController {

    @Autowired
    private CentroEducativoService centroEducativoService;

    @GetMapping
    public ResponseEntity<List<CentroEducativo>> getAllCentros() {
        List<CentroEducativo> centros = centroEducativoService.findAll();
        return ResponseEntity.ok(centros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CentroEducativo> getCentroById(@PathVariable Integer id) {
        CentroEducativo centro = centroEducativoService.findById(id);
        return ResponseEntity.ok(centro);
    }

    @PostMapping
    public ResponseEntity<CentroEducativo> createCentro(@RequestBody CentroEducativo centro) {
        CentroEducativo savedCentro = centroEducativoService.save(centro);
        return ResponseEntity.ok(savedCentro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCentro(@PathVariable Integer id) {
        centroEducativoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/filter/nombre")
    public ResponseEntity<List<CentroEducativo>> filterByNombre(@RequestParam String nombre) {
        List<CentroEducativo> filteredCentros = centroEducativoService.filterByNombreCentro(nombre);
        return ResponseEntity.ok(filteredCentros);
    }

    @GetMapping("/filter/tipo")
    public ResponseEntity <List<CentroEducativo>> filterByTipo(@RequestParam String tipo) {
        List<CentroEducativo> filteredCentros = centroEducativoService.filterByTipoCentro(tipo);
        return ResponseEntity.ok(filteredCentros);
    }
}
