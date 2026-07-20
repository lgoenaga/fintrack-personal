# Technology Decisions

## Información General

Proyecto:

```text
FinTrack Personal
```

Objetivo:

Registrar las decisiones arquitectónicas y tecnológicas adoptadas durante el desarrollo del proyecto.

---

# ADR-001

## Título

Monorepo para la gestión del proyecto.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Contexto

Se requiere administrar:

- Backend
- Frontend
- Documentación
- CI/CD

Dentro de un único ecosistema de trabajo.

### Decisión

Implementar un único repositorio Git.

### Estructura

```text
ingresos-egresos
│
├── .github
├── docs
├── fintrack-personal-api
└── fintrack-personal-web
```

### Justificación

- Simplifica la administración.
- Facilita GitFlow.
- Facilita GitHub Actions.
- Centraliza la documentación.
- Adecuado para proyectos académicos.

### Consecuencias

Positivas:

- Menor complejidad operativa.
- Mejor trazabilidad.

Negativas:

- El repositorio crecerá con el tiempo.

---

# ADR-002

## Título

Estrategia GitFlow.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Contexto

Se necesita una estrategia organizada para gestionar funcionalidades y versiones.

### Decisión

Adoptar GitFlow.

### Ramas Principales

```text
main

develop
```

### Ramas Temporales

```text
feature/*

release/*

hotfix/*
```

### Ejemplos

```text
feature/sprint-00-foundation-setup

feature/us-001-admin-inicial

feature/us-002-cambio-password

release/1.0.0

hotfix/1.0.1
```

### Justificación

- Favorece la trazabilidad.
- Facilita despliegues controlados.
- Permite crecimiento ordenado.

---

# ADR-003

## Título

Arquitectura Evolutiva Vertical.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Contexto

Es necesario evitar el desarrollo paralelo de módulos incompletos.

### Decisión

Implementar una funcionalidad completa antes de comenzar la siguiente.

### Flujo

```text
Base de Datos
    ↓
Backend
    ↓
Frontend
    ↓
Pruebas
```

### Justificación

- Reduce complejidad.
- Facilita pruebas.
- Genera entregables funcionales.

### Ejemplo

```text
US-001
Administrador Inicial

Supabase
    ↓
Spring Boot
    ↓
React
```

---

# ADR-004

## Título

Backend principal.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Decisión

Utilizar Java y Spring Boot.

### Stack

```text
Java 21 LTS

Spring Boot 4.0.7

Spring Web

Spring Data JPA

Validation

Lombok

PostgreSQL Driver
```

### Justificación

- Amplio uso empresarial.
- Productividad elevada.
- Excelente integración con PostgreSQL.

---

# ADR-005

## Título

Documentación de API's.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Contexto

Se requiere documentación automática de la API REST.

### Decisión

Utilizar:

```text
SpringDoc OpenAPI

Swagger UI
```

### Dependencia

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>3.0.2</version>
</dependency>
```

### Justificación

- Integración directa con Spring Boot 4.
- Amplia adopción.
- Generación automática de documentación.

### Convención

Todos los endpoints deberán documentarse mediante:

```text
comment Codigo en Java:

@Tag

@Operation

@ApiResponse

@Schema
```

Además de:

```text
Javadoc
```

para:

- Clases
- Métodos
- DTOs
- Interfaces

---

# ADR-006

## Título

Frontend principal.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Decisión

Utilizar React.

### Stack

```text
React 19

TypeScript 5

Vite

Tailwind CSS 4

Axios

React Router DOM
```

### Justificación

- Ecosistema moderno.
- Excelente experiencia de desarrollo.
- Integración sencilla con API's REST.

---

# ADR-007

## Título

Base de Datos.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Decisión

Utilizar PostgreSQL gestionado por Supabase.

### Componentes

```text
Supabase PostgreSQL

Supabase Authentication
```

### Justificación

- Base de datos administrada.
- Autenticación integrada.
- Escalabilidad.
- Integración sencilla con aplicaciones web.

---

# ADR-008

## Título

Gestión de autenticación.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Decisión

Utilizar Supabase Auth.

### Funcionalidades

```text
Login

Recuperación de contraseña

Gestión de sesiones

JWT
```

### Restricciones

```text
No existirá registro público.
```

Los usuarios serán administrados internamente.

### Usuario Inicial

```text
admin

Contraseña temporal:
123456
```

### Requisito

```text
Cambio obligatorio de contraseña
```
`en el primer acceso.`

---

# ADR-009

## Título

Convención de documentación.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Decisión

Toda funcionalidad desarrollada deberá tener documentación asociada.

### Ubicación

```text
docs/
```

### Documentos Principales

```text
README.md

global_architecture.md

technology-decisions.md

supabase_setup.md

backend_springboot.md

frontend_react.md
```

### Historias de Usuario

```text
docs/user-stories/
```

Ejemplos:

```text
US-001-administrador-inicial.md

US-002-cambio-password.md
```

---

# ADR-010

## Título

Gestión de calidad del código.

### Estado

✅ Aprobado

### Fecha

Sprint-00

### Reglas

Backend:

```text
Javadoc obligatorio
```

para:

- Clases
- Interfaces
- Métodos públicos

Frontend:

```text
TypeScript estricto
```

sin uso de:

```text
any
```

`salvo excepciones justificadas.`

### Objetivo

Mantener:

- Legibilidad.
- Mantenibilidad.
- Escalabilidad.

---

# Estado Actual

```text
Sprint-00

Foundation Setup

EN PROGRESO
```

---

# Próximos Documentos

```text
supabase_setup.md

backend_springboot.md

frontend_react.md
```

Estos documentos deberán respetar todas las decisiones arquitectónicas definidas en este archivo.