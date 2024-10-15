package com.educfusion.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educfusion.demo.models.OpinionDeUsuario;

import java.util.List;

@Repository
public interface OpinionDeUsuarioRepository extends JpaRepository<OpinionDeUsuario, Integer> {
    List<OpinionDeUsuario> findByCentro_Id(Integer centroId);
}