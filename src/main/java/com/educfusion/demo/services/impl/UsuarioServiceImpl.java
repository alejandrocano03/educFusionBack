package com.educfusion.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educfusion.demo.models.Usuario;
import com.educfusion.demo.repositories.UsuarioRepository;
import com.educfusion.demo.services.UsuarioService;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    @Override
    public Usuario update(Usuario usuario) {
        Usuario existingUsuario = findById(usuario.getId());
        
        if (existingUsuario != null) {
            existingUsuario.setUltimaFechaAcceso(usuario.getUltimaFechaAcceso());
            return usuarioRepository.save(existingUsuario);
        } else {
            throw new EntityNotFoundException("Usuario no encontrado");
        }
    }


    @Override
    public void deleteById(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario authenticate(String email, String password) {
        Usuario user = usuarioRepository.findByCorreoElectronico(email);
        if (user != null && user.getContraseñaCifrada().equals(password)) {
            return user;
        }
        return null;
    }

}
