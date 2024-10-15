package com.educfusion.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educfusion.demo.models.CategoriaCentroEducativo;

@Repository
public interface CategoriaCentroEducativoRepository  extends JpaRepository<CategoriaCentroEducativo, Integer>{
}
