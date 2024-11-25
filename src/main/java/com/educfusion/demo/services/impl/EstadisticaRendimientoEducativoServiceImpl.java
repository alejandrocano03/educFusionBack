package com.educfusion.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educfusion.demo.models.EstadisticaRendimientoEducativo;
import com.educfusion.demo.repositories.EstadisticaRendimientoEducativoRepository;
import com.educfusion.demo.services.EstadisticaRendimientoEducativoService;

import java.util.List;

@Service
public class EstadisticaRendimientoEducativoServiceImpl implements EstadisticaRendimientoEducativoService {

    @Autowired
    private EstadisticaRendimientoEducativoRepository estadisticaRendimientoEducativoRepository;

    @Override
    public List<EstadisticaRendimientoEducativo> findAll() {
        return estadisticaRendimientoEducativoRepository.findAll();
    }

    @Override
    public EstadisticaRendimientoEducativo findById(Integer id) {
        return estadisticaRendimientoEducativoRepository.findById(id).orElse(null);
    }

    @Override
    public EstadisticaRendimientoEducativo save(EstadisticaRendimientoEducativo estadistica) {
        return estadisticaRendimientoEducativoRepository.save(estadistica);
    }

    @Override
    public void deleteById(Integer id) {
        estadisticaRendimientoEducativoRepository.deleteById(id);
    }

    @Override
    public List<EstadisticaRendimientoEducativo> filterByCentroId(Integer centroId) {
        return estadisticaRendimientoEducativoRepository.findByCentro_Id(centroId);
    }

    @Override
    public List<EstadisticaRendimientoEducativo> filterByAnoAcademico(Integer anoAcademico) {
        return estadisticaRendimientoEducativoRepository.findByAnoAcademico(anoAcademico);
    }

    @Override
    public List<EstadisticaRendimientoEducativo> filterByNivelEducativo(String nivelEducativo) {
        return estadisticaRendimientoEducativoRepository.findByNivelEducativo(nivelEducativo);
    }
}
