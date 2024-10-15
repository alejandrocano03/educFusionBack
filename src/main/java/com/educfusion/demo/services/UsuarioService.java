package com.educfusion.demo.services;

import java.util.List;

import com.educfusion.demo.models.Usuario;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Integer id);
    Usuario save(Usuario usuario);
    Usuario update(Usuario usuario);
    void deleteById(Integer id);
    Usuario authenticate(String correo, String contraseña);
}

