# FinTrack Personal

Aplicación web para la gestión de finanzas personales desarrollada bajo una arquitectura Full-Stack moderna utilizando:

- Spring Boot 4
- Java 21 LTS
- React 19
- Vite
- TypeScript
- Tailwind CSS 4
- Supabase PostgreSQL
- OpenAPI / Swagger

---

# Objetivo

FinTrack Personal permite:

- Controlar ingresos y egresos.
- Gestionar categorías financieras.
- Administrar cuentas personales.
- Visualizar balances y métricas financieras.
- Generar reportes e indicadores.
- Evolucionar hacia funcionalidades de analítica predictiva.

---

# Arquitectura General

```text
┌──────────────────────┐
│  React + TypeScript  │
│  FinTrack Web        │
└──────────┬───────────┘
           │ HTTP/JSON
           ▼
┌──────────────────────┐
│ Spring Boot API      │
│ FinTrack REST API    │
└──────────┬───────────┘
           │ JPA
           ▼
┌──────────────────────┐
│ PostgreSQL           │
│ Supabase             │
└──────────────────────┘
```

---

# Tecnologías

## Backend

- Java 21 LTS
- Spring Boot 4.0.7
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Spring Validation
- Lombok
- Spring Configuration Processor
- OpenAPI / Swagger
- Maven

## Frontend

- React 19
- TypeScript 5
- Vite
- Tailwind CSS 4
- React Router DOM
- Axios

## Base de Datos

- PostgreSQL
- Supabase

## Control de Versiones

- Git
- GitHub
- GitFlow

---

# Estructura del Repositorio

```text
ingresos-egresos
│
├── .github/
│
├── docs/
│
├── fintrack-personal-api/
│
└── fintrack-personal-web/
```

---

# Proyecto API

```text
fintrack-personal-api
```

Backend REST desarrollado con Spring Boot.

Responsabilidades:

- Lógica de negocio.
- Persistencia.
- Seguridad.
- Exposición de API's.
- Documentación OpenAPI.

---

# Proyecto Web

```text
fintrack-personal-web
```

Frontend desarrollado con React.

Responsabilidades:

- Interfaz de usuario.
- Navegación.
- Consumo de API's.
- Gestión de sesiones.
- Visualización de información financiera.

---

# Documentación

Toda la documentación técnica se encuentra en:

```text
docs/
```

Documentos principales:

```text
README.md

global_architecture.md

technology-decisions.md

supabase_setup.md

backend_springboot.md

frontend_react.md
```

---

# Estrategia de Desarrollo

El proyecto seguirá una estrategia de:

```text
Arquitectura Evolutiva Vertical
```

Cada funcionalidad debe desarrollarse completamente en:

```text
Base de Datos
    ↓
Backend
    ↓
Frontend
    ↓
Pruebas
```

Antes de iniciar la siguiente.

---

# GitFlow

## Rama Principal

```text
main
```

Contiene versiones estables.

---

## Rama de Desarrollo

```text
develop
```

Integra funcionalidades terminadas.

---

## Ramas de Funcionalidad

```text
feature/*
```

Ejemplos:

```text
feature/sprint-00-foundation-setup

feature/us-001-admin-inicial

feature/us-002-cambio-password
```

---

## Ramas de Release

```text
release/*
```

Ejemplo:

```text
release/1.0.0
```

---

## Ramas Hotfix

```text
hotfix/*
```

Ejemplo:

```text
hotfix/1.0.1
```

---

# Roadmap

## Sprint-00

Foundation Setup

Objetivos:

- Configuración GitFlow.
- Configuración Supabase.
- Configuración Spring Boot.
- Configuración React.
- Configuración OpenAPI.
- Configuración Tailwind.
- Configuración Axios.
- Configuración Variables de Entorno.

---

## Sprint-01

### US-001

Administrador Inicial

### US-002

Cambio Obligatorio de Contraseña

---

## Sprint-02

### US-003

Login

### US-004

Recuperación de Contraseña

---

## Sprint-03

### US-005

Gestión de Categorías

---

## Sprint-04

### US-006

Gestión de Cuentas

---

## Sprint-05

### US-007

Gestión de Transacciones

---

## Sprint-06

### US-008

Dashboard Financiero

---

# Convención de Commits

Formato:

```text
tipo: descripción
```

Ejemplos:

```text
docs: create project documentation

feat: add administrator endpoint

fix: correct validation error

refactor: improve service implementation

test: add unit tests

chore: update dependencies
```

---

# Estado Actual

```text
Sprint-00

Foundation Setup

EN PROGRESO
```

---

# Autor

Luis Alberto Goenaga Peláez

Proyecto académico y de aprendizaje para la construcción de una plataforma moderna de gestión financiera personal.