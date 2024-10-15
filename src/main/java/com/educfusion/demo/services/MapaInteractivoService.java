package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.MapaInteractivo;

public interface MapaInteractivoService {
    List<MapaInteractivo> findAll();
    MapaInteractivo findById(Integer id);
    MapaInteractivo save(MapaInteractivo mapa);
    void deleteById(Integer id);
    List<MapaInteractivo> findByCentroId(Integer centroId);
}