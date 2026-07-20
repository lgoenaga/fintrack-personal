package com.github.lgoenaga.fintrack.controller;

import com.github.lgoenaga.fintrack.dto.usuario.UsuarioResponse;
import com.github.lgoenaga.fintrack.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador encargado de la gestión de usuarios.
 */
@RestController
@RequestMapping("/api/v1/usuarios")
@Tag(
        name = "Usuarios",
        description = "Operaciones relacionadas con usuarios"
)
public class UsuarioController {

    private final UsuarioService usuarioService;

    /**
     * Constructor del controlador.
     *
     * @param usuarioService servicio de usuarios
     */
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    /**
     * Obtiene la información del administrador inicial.
     *
     * @return información del administrador
     */
    @GetMapping("/admin")
    @Operation(
            summary = "Consultar administrador inicial",
            description = "Obtiene la información del administrador configurado en el sistema."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Administrador encontrado correctamente"
    )
    @ApiResponse(
            responseCode = "404",
            description = "Administrador no encontrado"
    )
    public UsuarioResponse obtenerAdministrador() {
        return usuarioService.obtenerAdministrador();
    }

}