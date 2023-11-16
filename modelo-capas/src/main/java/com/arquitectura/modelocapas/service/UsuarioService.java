package com.arquitectura.modelocapas.service;

// CAPA SERVICIO - LÓGICA DE NEGOCIO

import com.arquitectura.modelocapas.model.Usuario;
import com.arquitectura.modelocapas.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService{

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario addUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAllUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuarioPorCorreo(String correo){
        return usuarioRepository.findByCorreo(correo);
    }

}
