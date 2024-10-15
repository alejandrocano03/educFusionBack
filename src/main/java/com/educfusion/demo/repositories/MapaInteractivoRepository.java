package com.educfusion.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educfusion.demo.models.MapaInteractivo;

@Repository
public interface MapaInteractivoRepository extends JpaRepository<MapaInteractivo, Integer>{
    List<MapaInteractivo> findByCentroId(Integer centroId);  
}
