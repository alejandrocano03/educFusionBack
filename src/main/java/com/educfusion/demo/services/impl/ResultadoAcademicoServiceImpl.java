package com.educfusion.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educfusion.demo.models.ResultadoAcademico;
import com.educfusion.demo.repositories.ResultadoAcademicoRepository;
import com.educfusion.demo.services.ResultadoAcademicoService;

import java.util.List;

@Service
public class ResultadoAcademicoServiceImpl implements ResultadoAcademicoService {

    @Autowired
    private ResultadoAcademicoRepository resultadoAcademicoRepository;

    @Override
    public List<ResultadoAcademico> findAll() {
        return resultadoAcademicoRepository.findAll();
    }

    @Override
    public ResultadoAcademico findById(Integer id) {
        return resultadoAcademicoRepository.findById(id).orElse(null);
    }

    @Override
    public ResultadoAcademico save(ResultadoAcademico resultadoAcademico) {
        return resultadoAcademicoRepository.save(resultadoAcademico);
    }

    @Override
    public void deleteById(Integer id) {
        resultadoAcademicoRepository.deleteById(id);
    }

    @Override
    public List<ResultadoAcademico> findByCentroId(Integer centroId) {
        return resultadoAcademicoRepository.findByCentroId(centroId);
    }

    @Override
    public List<ResultadoAcademico> findByAñoAcademico(Integer añoAcademico) {
        return resultadoAcademicoRepository.findByAñoAcademico(añoAcademico);
    }

    @Override
    public List<ResultadoAcademico> findByNivelEducativo(String nivelEducativo) {
        return resultadoAcademicoRepository.findByNivelEducativo(nivelEducativo);
    }
}
