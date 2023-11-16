package com.arquitectura.modelocapas.repository;

// CAPA ACCESO A DATOS - REPOSITORY

import com.arquitectura.modelocapas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Definición de la capa repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Definición de los métodos de acceso a datos, consutas y query methods
    List<Usuario> findByCorreo(String correo);

}
