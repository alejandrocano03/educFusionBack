package com.educfusion.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educfusion.demo.models.EstadisticaRendimientoEducativo;

@Repository
public interface EstadisticaRendimientoEducativoRepository extends JpaRepository<EstadisticaRendimientoEducativo, Integer> {
    List<EstadisticaRendimientoEducativo> findByCentro_Id(Integer centroId);
    List<EstadisticaRendimientoEducativo> findByAñoAcademico(Integer añoAcademico);
    List<EstadisticaRendimientoEducativo> findByNivelEducativo(String nivelEducativo);
}
