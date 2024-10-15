package com.educfusion.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educfusion.demo.models.Informe;

import java.util.List;

@Repository
public interface InformeRepository extends JpaRepository<Informe, Integer> {
    List<Informe> findByCentro_Id(Integer centroId);
    List<Informe> findByTipoInforme(String tipoInforme);
}
