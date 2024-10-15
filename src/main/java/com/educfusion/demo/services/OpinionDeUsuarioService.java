package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.OpinionDeUsuario;

public interface OpinionDeUsuarioService {
    List<OpinionDeUsuario> findAll();
    OpinionDeUsuario findById(Integer id);
    OpinionDeUsuario save(OpinionDeUsuario opinion);
    void deleteById(Integer id);
    List<OpinionDeUsuario> filterByCentroId(Integer centroId);
}