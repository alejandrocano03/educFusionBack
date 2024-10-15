package com.educfusion.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educfusion.demo.models.CentroEducativo;

@Repository
public interface CentroEducativoRepository extends JpaRepository<CentroEducativo, Integer> {
	List<CentroEducativo> findByTipoCentro(String tipoCentro);
    List<CentroEducativo> findByNombreContaining(String nombreCentro);
}
