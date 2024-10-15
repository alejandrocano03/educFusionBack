package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.CategoriaCentroEducativo;

public interface CategoriaCentroEducativoService {
    List<CategoriaCentroEducativo> findAll();
    CategoriaCentroEducativo findById(Integer id);
    CategoriaCentroEducativo save(CategoriaCentroEducativo categoria);
    void deleteById(Integer id);
}
