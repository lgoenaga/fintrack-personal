# Frontend React

## Información General

Proyecto:

```text
fintrack-personal-web
```

Sprint:

```text
Sprint-00
Foundation Setup
```

Objetivo:

Configurar la aplicación web que consumirá las APIs REST de FinTrack Personal.

---

# Stack Tecnológico

## Framework

```text
React 19
```

---

## Lenguaje

```text
TypeScript 5
```

---

## Build Tool

```text
Vite
```

---

## Estilos

```text
Tailwind CSS 4
```

---

## Navegación

```text
React Router DOM
```

---

## Cliente HTTP

```text
Axios
```

---

## Autenticación

```text
Supabase Client
```

---

# Creación del Proyecto

## Comando Utilizado

```bash
npm create vite@latest fintrack-personal-web -- --template react-ts
```

---

# Instalación de Dependencias

## Dependencias Base

```bash
npm install
```

---

## React Router

```bash
npm install react-router-dom
```

---

## Axios

```bash
npm install axios
```

---

## Supabase

```bash
npm install @supabase/supabase-js
```

---

## Manejo de Formularios

```bash
npm install react-hook-form
```

---

## Notificaciones

```bash
npm install react-hot-toast
```

---

# Tailwind CSS

## Instalación

```bash
npm install tailwindcss @tailwindcss/vite
```

---

## Configuración Vite

Archivo:

```text
vite.config.ts
```

---

Agregar:

```ts
import tailwindcss from "@tailwindcss/vite";
```

`y registrar el plugin.`

---

## Configuración CSS

Archivo:

```text
src/index.css
```

---

Contenido:

```text
comment
  Tailwind CSS v4.0.0
  Docs: https://tailwindcss.com/docs/installation
  License: MIT

@import "tailwindcss";
```

---

# Variables de Entorno

Archivo:

```text
.env
```

---

Contenido:

```env
VITE_API_URL=http://localhost:8080/api/v1

VITE_SUPABASE_URL=

VITE_SUPABASE_PUBLISHABLE_KEY=
```

---

## Archivo de Referencia

```text
.env.example
```

---

Contenido:

```env
VITE_API_URL=

VITE_SUPABASE_URL=

VITE_SUPABASE_PUBLISHABLE_KEY=
```

---

# Estructura Inicial

Ubicación:

```text
src/
```

---

## Organización

```text
src
│
├── assets
│
├── components
│   ├── common
│   ├── layouts
│   └── ui
│
├── context
│
├── hooks
│
├── lib
│
├── pages
│   ├── auth
│   ├── dashboard
│   ├── profile
│   ├── categories
│   ├── accounts
│   └── transactions
│
├── routes
│
├── services
│
├── types
│
├── utils
│
├── App.tsx
│
├── main.tsx
│
└── index.css
```

---

# Responsabilidad de Carpetas

## assets

Recursos estáticos.

Ejemplos:

```text
Imágenes

Iconos

Logos
```

---

## components

Componentes reutilizables.

---

## context

Estados globales de React.

---

## hooks

Hooks personalizados.

---

## lib

Configuraciones y clientes externos.

Ejemplos:

```text
Axios

Supabase
```

---

## pages

Pantallas completas de la aplicación.

---

## routes

Definición de navegación.

---

## services

Comunicación con el backend.

---

## types

Interfaces y tipos TypeScript.

---

## utils

Funciones auxiliares.

---

# Cliente Axios

Ubicación:

```text
src/services/api.ts
```

---

Responsabilidad:

```text
Centralizar todas las llamadas HTTP al backend.
```

---

Configuración:

```ts
baseURL:
VITE_API_URL
```

---

# Cliente Supabase

Ubicación:

```text
src/lib/supabase.ts
```

---

Responsabilidad:

```text
Autenticación.

Recuperación de contraseña.

Gestión de sesiones.
```

---

Configuración:

```text
VITE_SUPABASE_URL

VITE_SUPABASE_PUBLISHABLE_KEY
```

---

# Navegación

Ubicación:

```text
src/routes
```

---

Se utilizará:

```text
React Router DOM
```

---

Rutas Iniciales

```text
/

/login

/cambiar-password

/dashboard
```

---

# Convención de Componentes

## Componentes

Nombre:

```text
PascalCase
```

Ejemplo:

```text
LoginForm.tsx

DashboardCard.tsx

Navbar.tsx
```

---

## Hooks

Nombre:

```text
use*
```

Ejemplo:

```text
useAuth.ts

useProfile.ts
```

---

## Servicios

Nombre:

```text
camelCase
```

Ejemplo:

```text
authService.ts

userService.ts

categoryService.ts
```

---

# Convención TypeScript

## Interfaces

Ejemplo:

```ts
interface Usuario {
  id: string;
  username: string;
}
```

---

## Restricción

Evitar:

```ts
any
```

`salvo casos excepcionales.`

---

# Página Inicial Temporal

Durante Sprint-00 se utilizará:

```text
HomePage
```

Ubicación:

```text
src/pages/HomePage.tsx
```

---

## Contenido

```text
FinTrack Personal
```

---

# Integración Inicial

Durante Sprint-00 se validará:

```http
GET /api/v1/health
```

---

Respuesta:

```json
{
  "status": "UP",
  "application": "fintrack-personal-api"
}
```

---

Objetivo:

```text
Verificar conectividad entre:

Frontend
↓
Backend
↓
Supabase
```

---

# Sprint-00 Alcance

Configurar:

```text
✅ React

✅ TypeScript

✅ Vite

✅ Tailwind CSS

✅ React Router

✅ Axios

✅ Supabase Client

✅ Variables de entorno
```

---

# Fuera de Alcance

No se desarrollará todavía:

```text
Login

Categorías

Cuentas

Transacciones

Dashboard
```

Estas funcionalidades serán implementadas en las siguientes historias de usuario.

---

# 🔄 CONEXIÓN DEL FLUJO

## [Origen]

Backend:

```text
fintrack-personal-api
```

Endpoint:

```http
GET /api/v1/health
```

---

## [Destino]

US-001

```text
Administrador Inicial
```

Consumirá:

```http
GET /api/v1/usuarios/admin
```

`para mostrar la información del administrador en la interfaz web.`

---

# Estado Actual

```text
Sprint-00

Foundation Setup

EN PROGRESO
```