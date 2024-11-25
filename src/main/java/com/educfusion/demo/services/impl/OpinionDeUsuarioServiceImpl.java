package com.educfusion.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educfusion.demo.models.OpinionDeUsuario;
import com.educfusion.demo.repositories.OpinionDeUsuarioRepository;
import com.educfusion.demo.services.OpinionDeUsuarioService;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class OpinionDeUsuarioServiceImpl implements OpinionDeUsuarioService {

    @Autowired
    private OpinionDeUsuarioRepository opinionDeUsuarioRepository;

    @Override
    public List<OpinionDeUsuario> findAll() {
        return opinionDeUsuarioRepository.findAll();
    }

    @Override
    public OpinionDeUsuario findById(Integer id) {
        return opinionDeUsuarioRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public OpinionDeUsuario save(OpinionDeUsuario opinion) {
        return opinionDeUsuarioRepository.save(opinion);
    }

    @Override
    public void deleteById(Integer id) {
        opinionDeUsuarioRepository.deleteById(id);
    }

    @Override
    public List<OpinionDeUsuario> filterByCentroId(Integer centroId) {
        return opinionDeUsuarioRepository.findByCentro_Id(centroId);
    }
}

