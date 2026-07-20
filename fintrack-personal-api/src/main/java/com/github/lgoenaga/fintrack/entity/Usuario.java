package com.github.lgoenaga.fintrack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;





    /**
     * Entidad que representa un usuario del sistema.
     */
    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @Builder
    @AllArgsConstructor
    @Table(name = "usuarios")
    public class Usuario {

        @Id
        private UUID id;

        @Column(nullable = false, unique = true, length = 50)
        private String username;

        @Column(nullable = false, length = 100)
        private String nombre;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false, length = 20)
        private Rol rol;

        @Column(nullable = false)
        private Boolean activo;

        @Column(name = "requiere_cambio_password", nullable = false)
        private Boolean requiereCambioPassword;

        @Column(name = "fecha_creacion", nullable = false)
        private OffsetDateTime fechaCreacion;

        @Column(name = "fecha_actualizacion", nullable = false)
        private OffsetDateTime fechaActualizacion;

    }

