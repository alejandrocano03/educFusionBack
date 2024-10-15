package com.educfusion.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educfusion.demo.models.MapaInteractivo;
import com.educfusion.demo.repositories.MapaInteractivoRepository;
import com.educfusion.demo.services.MapaInteractivoService;

import java.util.List;

@Service
public class MapaInteractivoServiceImpl implements MapaInteractivoService {

    @Autowired
    private MapaInteractivoRepository mapaInteractivoRepository;

    @Override
    public List<MapaInteractivo> findAll() {
        return mapaInteractivoRepository.findAll();
    }

    @Override
    public MapaInteractivo findById(Integer id) {
        return mapaInteractivoRepository.findById(id).orElse(null);
    }

    @Override
    public MapaInteractivo save(MapaInteractivo mapa) {
        return mapaInteractivoRepository.save(mapa);
    }

    @Override
    public void deleteById(Integer id) {
        mapaInteractivoRepository.deleteById(id);
    }

    @Override
    public List<MapaInteractivo> findByCentroId(Integer centroId) {
        return mapaInteractivoRepository.findByCentroId(centroId);
    }
}

