package com.educfusion.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educfusion.demo.models.ResultadoAcademico;

import java.util.List;

@Repository
public interface ResultadoAcademicoRepository extends JpaRepository<ResultadoAcademico, Integer> {
    List<ResultadoAcademico> findByCentroId(Integer centroId);
    List<ResultadoAcademico> findByAnoAcademico(Integer anoAcademico);
    List<ResultadoAcademico> findByNivelEducativo(String nivelEducativo);
}

