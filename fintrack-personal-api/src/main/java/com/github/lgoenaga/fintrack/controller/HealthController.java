package com.github.lgoenaga.fintrack.controller;

import com.github.lgoenaga.fintrack.dto.health.HealthResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador encargado de exponer endpoints de validación
 * del estado de la aplicación.
 */
@RestController
@RequestMapping("/api/v1/health")
@Tag(
        name = "Health",
        description = "Endpoints para verificación del estado de la aplicación"
)
public class HealthController {

    @Value("${spring.application.name}")
    private String applicationName;

    /**
     * Obtiene el estado actual de la aplicación.
     *
     * @return información del estado de la API
     */
    @GetMapping
    @Operation(
            summary = "Consultar estado de la aplicación",
            description = "Permite validar que la API se encuentra disponible."
    )
    public HealthResponse getHealth() {

        return new HealthResponse(
                "UP",
                applicationName
        );
    }
}