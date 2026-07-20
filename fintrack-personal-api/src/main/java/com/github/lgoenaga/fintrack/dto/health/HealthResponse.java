package com.github.lgoenaga.fintrack.dto.health;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Respuesta utilizada para validar el estado de la aplicación.
 *
 * @param status estado actual del servicio
 * @param application nombre de la aplicación
 */
@Schema(description = "Estado general de la aplicación")
public record HealthResponse(

        @Schema(description = "Estado del servicio")
        String status,

        @Schema(description = "Nombre de la aplicación")
        String application

) {
}