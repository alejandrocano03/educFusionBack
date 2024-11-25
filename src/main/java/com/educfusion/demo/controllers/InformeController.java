package com.educfusion.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.educfusion.demo.models.Informe;
import com.educfusion.demo.services.InformeService;

import java.util.List;

@RestController
@RequestMapping("/informes")
public class InformeController {

    @Autowired
    private InformeService informeService;
    
    @GetMapping
    public ResponseEntity<List<Informe>> getAllInformes() {
        List<Informe> informes = informeService.findAll(); 
        return ResponseEntity.ok(informes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Informe> getInformeById(@PathVariable Integer id) {
        Informe informe = informeService.findById(id);
        return ResponseEntity.ok(informe);
    }

    @PostMapping
    public ResponseEntity<Informe> crearInforme(@RequestBody Informe informe) {
        informeService.save(informe);
        return ResponseEntity.ok(informe);
    }




    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInforme(@PathVariable Integer id) {
        informeService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/filter/centro/{centroId}")
    public ResponseEntity<List<Informe>> filterByCentroId(@PathVariable Integer centroId) {
        List<Informe> filteredInformes = informeService.filterByCentroId(centroId);
        return ResponseEntity.ok(filteredInformes);
    }

    @GetMapping("/filter/tipo")
    public ResponseEntity<List<Informe>> filterByTipo(@RequestParam String tipo) {
        List<Informe> filteredInformes = informeService.filterByTipoInforme(tipo);
        return ResponseEntity.ok(filteredInformes);
    }
}
