package com.arquitectura.modelocapas.controller;

import com.arquitectura.modelocapas.model.Usuario;
import com.arquitectura.modelocapas.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("capas")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
        if (usuario != null)
            return new ResponseEntity<>(usuarioService.addUsuario(usuario), HttpStatus.CREATED);
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(usuarioService.findAllUsuarios());
    }

    @GetMapping("/correo")
    public ResponseEntity<Usuario> listarUsuarioPorCorreo(@RequestParam String email) {
        if (email != null)
            return ResponseEntity.ok(usuarioService.buscarUsuarioPorCorreo(email));
        return ResponseEntity.ok(null);
    }

}
