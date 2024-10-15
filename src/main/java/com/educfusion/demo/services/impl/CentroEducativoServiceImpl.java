package com.educfusion.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educfusion.demo.models.CentroEducativo;
import com.educfusion.demo.repositories.CentroEducativoRepository;
import com.educfusion.demo.services.CentroEducativoService;

import java.util.List;

@Service
public class CentroEducativoServiceImpl implements CentroEducativoService {

    @Autowired
    private CentroEducativoRepository centroEducativoRepository;

    @Override
    public List<CentroEducativo> findAll() {
        return centroEducativoRepository.findAll();
    }

    @Override
    public CentroEducativo findById(Integer id) {
        return centroEducativoRepository.findById(id).orElse(null);
    }

    @Override
    public CentroEducativo save(CentroEducativo centroEducativo) {
        return centroEducativoRepository.save(centroEducativo);
    }

    @Override
    public void deleteById(Integer id) {
        centroEducativoRepository.deleteById(id);
    }

    @Override
    public List<CentroEducativo> filterByTipoCentro(String tipoCentro) {
        return centroEducativoRepository.findByTipoCentro(tipoCentro);
    }

    @Override
    public List<CentroEducativo> filterByNombreCentro(String nombreCentro) {
        return centroEducativoRepository.findByNombreContaining(nombreCentro);
    }
}