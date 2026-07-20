# Backend Spring Boot

## Información General

Proyecto:

```text
fintrack-personal-api
```

Sprint:

```text
Sprint-00
Foundation Setup
```

Objetivo:

Configurar la API REST que servirá como backend principal de FinTrack Personal.

---

# Stack Tecnológico

## Plataforma

```text
Java 21 LTS
```

---

## Framework

```text
Spring Boot 4.0.7
```

---

## Build Tool

```text
Maven
```

---

## Persistencia

```text
Spring Data JPA
```

---

## Base de Datos

```text
PostgreSQL

Supabase PostgreSQL
```

---

## Documentación API

```text
SpringDoc OpenAPI

Swagger UI
```

---

# Estructura del Proyecto

```text
fintrack-personal-api
│
├── .mvn
│
├── src
│
├── compose.yaml
│
├── pom.xml
│
├── mvnw
│
├── mvnw.cmd
│
└── README.md
```

---

# Dependencias Instaladas

## Spring Web

Responsabilidad:

```text
Exposición de APIs REST.
```

---

## Spring Data JPA

Responsabilidad:

```text
Persistencia y acceso a datos.
```

---

## PostgreSQL Driver

Responsabilidad:

```text
Conectividad PostgreSQL.
```

---

## Validation

Responsabilidad:

```text
Validaciones de entrada.
```

---

## Lombok

Responsabilidad:

```text
Reducción de código repetitivo.
```

---

## Spring Configuration Processor

Responsabilidad:

```text
Soporte para Configuration Properties.
```

---

## Spring Boot DevTools

Responsabilidad:

```text
Recarga automática en desarrollo.
```

---

## Docker Compose Support

Responsabilidad:

```text
Soporte para contenedores locales.
```

---

## SpringDoc OpenAPI

Responsabilidad:

```text
Documentación automática de APIs.
```

---

# Dependencia OpenAPI

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>3.0.2</version>
</dependency>
```

---

# Estructura de Paquetes

Ubicación:

```text
src/main/java
```

---

## Organización

```text
com.github.lgoenaga.fintrack
│
├── config
│
├── controller
│
├── dto
│
├── entity
│
├── exception
│
├── mapper
│
├── repository
│
├── security
│
├── service
│
├── util
│
└── FintrackPersonalApiApplication
```

---

# Responsabilidades

## config

Configuraciones generales.

Ejemplos:

```text
Swagger

Supabase

Beans
```

---

## controller

Exposición de API's REST.

---

## dto

Objetos de transferencia.

---

## entity

Entidades JPA.

---

## repository

Acceso a datos.

---

## service

Lógica de negocio.

---

## security

Seguridad y autenticación.

---

## exception

Manejo centralizado de errores.

---

## util

Clases auxiliares.

---

# Configuración por Entornos

## Profiles

Se utilizarán:

```text
local

dev

prod
```

---

# application.yml

Ubicación:

```text
src/main/resources/application.yml
```

---

## Configuración Base

```yaml
spring:
  application:
    name: fintrack-personal-api

  datasource:
    url: ${DB_URL}
    username: ${DB_USERNAME}
    password: ${DB_PASSWORD}

  jpa:
    hibernate:
      ddl-auto: none

    show-sql: true

    properties:
      hibernate:
        format_sql: true
```

---

# Variables de Entorno

Archivo:

```text
.env
```

---

## PostgreSQL

```env
DB_URL=

DB_USERNAME=

DB_PASSWORD=
```

---

## Supabase

```env
SUPABASE_URL=

SUPABASE_PUBLISHABLE_KEY=

SUPABASE_SECRET_KEY=
```

---

# OpenAPI

## Swagger UI

URL:

```text
http://localhost:8080/swagger-ui.html
```

---

## OpenAPI JSON

```text
http://localhost:8080/v3/api-docs
```

---

# Convención de Código

## Javadoc Obligatorio

Todas las clases deberán documentarse.

Ejemplo:

```java
/**
 * Servicio encargado de administrar usuarios.
 */
```

---

## Métodos Públicos

Todos los métodos públicos deberán documentarse.

Ejemplo:

```java
/**
 * Obtiene un usuario por identificador.
 *
 * @param id identificador del usuario
 * @return usuario encontrado
 */
```

---

# DTOs

Todos los DTOs deberán incluir anotaciones OpenAPI.

Ejemplo:

```text
comment Codigo en Java:

@Schema(description = "Usuario del sistema")
```

---

# Convención OpenAPI

## Controladores

Todos los controladores deberán incluir:

```text
@Tag
```

---

## Operaciones

Todas las operaciones deberán incluir:

```text
@Operation
```

---

## Respuestas

Todas las respuestas deberán incluir:

```text
@ApiResponse
```

---

## DTOs

Todos los DTOs deberán incluir:

```text
@Schema
```

---

# Endpoint Inicial

Durante Sprint-00 se implementará:

```http
GET /api/v1/health
```

---

## Respuesta Esperada

```json
{
  "status": "UP",
  "application": "fintrack-personal-api"
}
```

---

# Sprint-00 Alcance

Configurar:

```text
✅ Spring Boot

✅ Maven

✅ OpenAPI

✅ Swagger

✅ PostgreSQL

✅ Supabase

✅ Profiles

✅ Variables de entorno
```

---

# Fuera de Alcance

No se desarrollará todavía:

```text
Usuarios

Categorías

Cuentas

Transacciones

Dashboard
```

Estas funcionalidades se implementarán en las próximas User Stories.

---

# 🔄 CONEXIÓN DEL FLUJO
## [Origen]

Supabase

```text
auth.users

public.usuarios
```

Definidos en:

```text
supabase_setup.md
```

---

## [Destino]

Frontend React.

Documento:

```text
frontend_react.md
```

Consumirá inicialmente:

```http
GET /api/v1/health
```

`para validar la conectividad entre todas las capas del sistema.`
