package com.educfusion.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educfusion.demo.models.Informe;
import com.educfusion.demo.repositories.InformeRepository;
import com.educfusion.demo.services.InformeService;

import java.util.List;

@Service
public class InformeServiceImpl implements InformeService {

    @Autowired
    private InformeRepository informeRepository;

    @Override
    public List<Informe> findAll() {
        return informeRepository.findAll();
    }

    @Override
    public Informe findById(Integer id) {
        return informeRepository.findById(id).orElse(null);
    }

    @Override
    public Informe save(Informe informe) {
        return informeRepository.save(informe);
    }

    @Override
    public void deleteById(Integer id) {
        informeRepository.deleteById(id);
    }

    @Override
    public List<Informe> filterByCentroId(Integer centroId) {
        return informeRepository.findByCentro_Id(centroId);
    }

    @Override
    public List<Informe> filterByTipoInforme(String tipoInforme) {
        return informeRepository.findByTipoInforme(tipoInforme);
    }
}

