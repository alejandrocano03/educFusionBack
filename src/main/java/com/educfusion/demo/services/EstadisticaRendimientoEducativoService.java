package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.EstadisticaRendimientoEducativo;

public interface EstadisticaRendimientoEducativoService {
    List<EstadisticaRendimientoEducativo> findAll();
    EstadisticaRendimientoEducativo findById(Integer id);
    EstadisticaRendimientoEducativo save(EstadisticaRendimientoEducativo estadistica);
    void deleteById(Integer id);
    List<EstadisticaRendimientoEducativo> filterByCentroId(Integer centroId);
    List<EstadisticaRendimientoEducativo> filterByAñoAcademico(Integer añoAcademico);
    List<EstadisticaRendimientoEducativo> filterByNivelEducativo(String nivelEducativo);
}