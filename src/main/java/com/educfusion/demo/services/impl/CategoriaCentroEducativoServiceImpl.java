package com.educfusion.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educfusion.demo.models.CategoriaCentroEducativo;
import com.educfusion.demo.repositories.CategoriaCentroEducativoRepository;
import com.educfusion.demo.services.CategoriaCentroEducativoService;

import java.util.List;

@Service
public class CategoriaCentroEducativoServiceImpl implements CategoriaCentroEducativoService {

    @Autowired
    private CategoriaCentroEducativoRepository categoriaCentroEducativoRepository;

    @Override
    public List<CategoriaCentroEducativo> findAll() {
        return categoriaCentroEducativoRepository.findAll();
    }

    @Override
    public CategoriaCentroEducativo findById(Integer id) {
        return categoriaCentroEducativoRepository.findById(id).orElse(null);
    }

    @Override
    public CategoriaCentroEducativo save(CategoriaCentroEducativo categoria) {
        return categoriaCentroEducativoRepository.save(categoria);
    }

    @Override
    public void deleteById(Integer id) {
        categoriaCentroEducativoRepository.deleteById(id);
    }
}

