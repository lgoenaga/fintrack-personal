# FinTrack Personal

## 1. Información General

### Nombre del Proyecto

**FinTrack Personal**

### Tipo de Proyecto

Aplicación Web Full Stack para la gestión de finanzas personales.

### Estado Actual

```text
Sprint-00
Foundation Setup
```

### Estrategia de Desarrollo

```text
Arquitectura Evolutiva Vertical
```

Cada funcionalidad debe ser desarrollada completamente a través de todas las capas:

```text
Base de Datos
    ↓
Backend
    ↓
Frontend
    ↓
Pruebas
```

Antes de comenzar la siguiente funcionalidad.

---

# 2. Objetivos del Sistema

## Objetivo General

Permitir la administración eficiente de las finanzas personales mediante el control de ingresos, egresos, cuentas, presupuestos e indicadores financieros.

---

## Objetivos Específicos

### Control Financiero

- Registrar ingresos.
- Registrar egresos.
- Clasificar movimientos.
- Gestionar cuentas financieras.

---

### Seguimiento Financiero

- Calcular balances.
- Consolidar movimientos.
- Monitorear gastos por categoría.
- Analizar tendencias.

---

### Automatización

- Gestionar autenticación.
- Aplicar validaciones de negocio.
- Generar indicadores automáticamente.

---

### Evolución Futura

- Reportes avanzados.
- Analítica predictiva.
- Proyecciones financieras.
- Alertas inteligentes.

---

# 3. Arquitectura General

## Arquitectura Lógica

```text
┌──────────────────────┐
│ React + TypeScript   │
│ FinTrack Web         │
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

## Arquitectura Física

```text
GitHub Repository
│
├── fintrack-personal-api
│
├── fintrack-personal-web
│
├── docs
│
└── .github
```

---

# 4. Stack Tecnológico

## Backend

### Plataforma

```text
Java 21 LTS
```

### Framework

```text
Spring Boot 4.0.7
```

### Dependencias Principales

```text
Spring Web

Spring Data JPA

PostgreSQL Driver

Validation

Lombok

Spring Configuration Processor

Spring Boot DevTools

Docker Compose Support
```

### Documentación API

```text
SpringDoc OpenAPI

Swagger UI
```

### Gestión de Dependencias

```text
Maven
```

---

## Frontend

### Framework

```text
React 19
```

### Lenguaje

```text
TypeScript 5
```

### Build Tool

```text
Vite
```

### UI

```text
Tailwind CSS 4
```

### Librerías

```text
React Router DOM

Axios

React Hook Form

Supabase Client
```

---

## Base de Datos

### Motor

```text
PostgreSQL
```

### Plataforma

```text
Supabase
```

---

## Control de Versiones

```text
Git

GitHub

GitFlow
```

---

# 5. Modelo de Datos Conceptual

## Usuario

Representa los usuarios autorizados para utilizar el sistema.

Responsabilidades:

- Acceso al sistema.
- Gestión del perfil.
- Cambio de contraseña.
- Control de permisos.

---

## Cuenta

Representa una fuente de fondos.

Ejemplos:

```text
Cuenta Bancaria

Efectivo

Nequi

BBVA

Tarjeta Crédito
```

---

## Categoría

Clasifica las transacciones.

### Ingreso

```text
Salario

Freelance

Ventas

Otros
```

### Egreso

```text
Mercado

Transporte

Salud

Educación

Servicios

Ocio

Otros
```

---

## Transacción

Entidad principal del sistema.

Representa:

```text
Ingreso

Egreso
```

Cada transacción estará asociada a:

```text
Usuario
Cuenta
Categoría
```

---

## Presupuesto

Permite definir límites de gasto por categoría.

Ejemplo:

```text
Alimentación
$500.000
Mensual
```

---

# 6. Flujo General de Datos

## Escritura

```text
Usuario
    ↓
Pantalla React
    ↓
Axios
    ↓
REST API
    ↓
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL
```

---

## Lectura

```text
PostgreSQL
    ↓
Repository
    ↓
Service
    ↓
Controller
    ↓
Frontend
    ↓
Usuario
```

---

# 7. Módulos del Sistema

## Autenticación

Funcionalidades:

- Login.
- Logout.
- Recuperación de contraseña.
- Cambio obligatorio de contraseña.

---

## Categorías

Funcionalidades:

- Crear categoría.
- Editar categoría.
- Activar.
- Desactivar.

---

## Cuentas

Funcionalidades:

- Crear cuenta.
- Editar cuenta.
- Consultar saldo.

---

## Transacciones

Funcionalidades:

- Registrar ingreso.
- Registrar egreso.
- Consultar historial.
- Editar movimientos.

---

## Dashboard

Funcionalidades:

- KPIs financieros.
- Balance actual.
- Resumen mensual.

---

## Reportes

Funcionalidades:

- Reportes por período.
- Comparativos históricos.
- Exportaciones futuras.

---

# 8. Diseño del Dashboard

## Indicadores Principales

### Ingresos Totales

```text
Σ ingresos
```

---

### Egresos Totales

```text
Σ egresos
```

---

### Balance

```text
Ingresos - Egresos
```

---

### Ahorro

Capacidad neta de ahorro.

---

## Componentes Visuales

### KPI Cards

```text
Ingresos

Egresos

Balance

Ahorro
```

---

### Movimientos Recientes

Tabla con últimas transacciones.

---

### Distribución por Categorías

Gráfico tipo:

```text
Pie

Donut
```

---

### Tendencia Mensual

Gráfico tipo:

```text
Line Chart
```

---

# 9. Roadmap Inicial

## Sprint-00

### Foundation Setup

Objetivos:

- GitFlow.
- Supabase.
- Spring Boot.
- React.
- Tailwind.
- OpenAPI.
- Variables de entorno.
- Conectividad inicial.

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

# 10. Principios Arquitectónicos

## Separación de Responsabilidades

Cada capa tendrá una responsabilidad única.

---

## Trazabilidad

Todo requerimiento debe poder rastrearse desde:

```text
User Story
    ↓
Backend
    ↓
Frontend
    ↓
Base de Datos
```

---

## Evolución Incremental

No se desarrollarán funcionalidades futuras antes de completar la actual.

---

## Documentación Obligatoria

Todo componente nuevo deberá quedar documentado en:

```text
docs/
```

Antes de pasar a producción.

---

# 🔄 CONEXIÓN DEL FLUJO

## [Origen]

Documento rector del proyecto.

