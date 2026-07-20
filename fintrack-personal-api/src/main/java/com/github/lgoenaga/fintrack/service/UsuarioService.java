package com.github.lgoenaga.fintrack.service;

import com.github.lgoenaga.fintrack.dto.usuario.UsuarioResponse;
import com.github.lgoenaga.fintrack.entity.Usuario;
import com.github.lgoenaga.fintrack.exception.UsuarioNotFoundException;
import com.github.lgoenaga.fintrack.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

/**
 * Servicio encargado de la gestión de usuarios.
 */
@Service
public class UsuarioService {

    private static final String ADMIN_USERNAME = "admin";

    private final UsuarioRepository usuarioRepository;

    /**
     * Constructor del servicio.
     *
     * @param usuarioRepository repositorio de usuarios
     */
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    /**
     * Obtiene la información del administrador inicial.
     *
     * @return información del administrador
     */
    public UsuarioResponse obtenerAdministrador() {

        Usuario usuario = usuarioRepository
                .findByUsername(ADMIN_USERNAME)
                .orElseThrow(() ->
                        new UsuarioNotFoundException(ADMIN_USERNAME)
                );

        return new UsuarioResponse(
                usuario.getId(),
                usuario.getUsername(),
                usuario.getNombre(),
                usuario.getRol().name(),
                usuario.getActivo(),
                usuario.getRequiereCambioPassword()
        );
    }

}