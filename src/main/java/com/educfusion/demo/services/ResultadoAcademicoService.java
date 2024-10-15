package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.ResultadoAcademico;

public interface ResultadoAcademicoService {
    List<ResultadoAcademico> findAll();
    ResultadoAcademico findById(Integer id);
    ResultadoAcademico save(ResultadoAcademico resultadoAcademico);
    void deleteById(Integer id);
    List<ResultadoAcademico> findByCentroId(Integer centroId);
    List<ResultadoAcademico> findByAñoAcademico(Integer añoAcademico);
    List<ResultadoAcademico> findByNivelEducativo(String nivelEducativo);
}
