package com.github.lgoenaga.fintrack.dto.usuario;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

/**
 * Información del usuario administrador.
 */
@Schema(description = "Información de un usuario")
public record UsuarioResponse(

        @Schema(
                description = "Identificador único del usuario",
                example = "0e8b4f65-d958-4f17-a0bc-147bfc5a2fdd"
        )
        UUID id,

        @Schema(
                description = "Nombre de usuario",
                example = "admin"
        )
        String username,

        @Schema(
                description = "Nombre completo",
                example = "Administrador"
        )
        String nombre,

        @Schema(
                description = "Rol del usuario",
                example = "ADMIN"
        )
        String rol,

        @Schema(
                description = "Indica si el usuario está activo",
                example = "true"
        )
        Boolean activo,

        @Schema(
                description = "Indica si debe cambiar la contraseña",
                example = "true"
        )
        Boolean requiereCambioPassword

) {
}