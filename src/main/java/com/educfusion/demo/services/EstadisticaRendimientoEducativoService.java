package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.EstadisticaRendimientoEducativo;

public interface EstadisticaRendimientoEducativoService {
    List<EstadisticaRendimientoEducativo> findAll();
    EstadisticaRendimientoEducativo findById(Integer id);
    EstadisticaRendimientoEducativo save(EstadisticaRendimientoEducativo estadistica);
    void deleteById(Integer id);
    List<EstadisticaRendimientoEducativo> filterByCentroId(Integer centroId);
    List<EstadisticaRendimientoEducativo> filterByAnoAcademico(Integer anoAcademico);
    List<EstadisticaRendimientoEducativo> filterByNivelEducativo(String nivelEducativo);
}