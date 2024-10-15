package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.Informe;

public interface InformeService {
    List<Informe> findAll();
    Informe findById(Integer id);
    Informe save(Informe informe);
    void deleteById(Integer id);
    List<Informe> filterByCentroId(Integer centroId);
    List<Informe> filterByTipoInforme(String tipoInforme);
}

