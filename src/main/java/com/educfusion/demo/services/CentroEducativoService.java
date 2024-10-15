package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.CentroEducativo;

public interface CentroEducativoService {
    List<CentroEducativo> findAll();
    CentroEducativo findById(Integer id);
    CentroEducativo save(CentroEducativo centroEducativo);
    void deleteById(Integer id);
    List<CentroEducativo> filterByTipoCentro(String tipoCentro);
    List<CentroEducativo> filterByNombreCentro(String nombreCentro);
}
