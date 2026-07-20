# Supabase Setup

## Información General

Proyecto:

```text
FinTrack Personal
```

Sprint:

```text
Sprint-00
Foundation Setup
```

Objetivo:

Configurar Supabase como proveedor de:

- PostgreSQL
- Authentication
- Gestión de usuarios
- Seguridad mediante RLS

---

# Arquitectura

```text
React
    ↓
Spring Boot
    ↓
Supabase PostgreSQL
```

La autenticación será administrada por:

```text
Supabase Auth
```

---

# Prerrequisitos

Antes de continuar se requiere:

- Cuenta en Supabase.
- Proyecto Git creado.
- Backend Spring Boot creado.
- Frontend React creado.

---

# Paso 1 - Crear Proyecto

Ingresar a:

```text
https://supabase.com
```

---

## Crear Organización

Crear una organización.

Ejemplo:

```text
FinTrack Personal
```

---

## Crear Proyecto

Seleccionar:

```text
New Project
```

Configurar:

```text
Project Name:
fintrack-personal

Database Password:
********

Region:
South America (São Paulo)
```

Guardar la contraseña.

---

# Paso 2 - Obtener Credenciales

Ir a:

```text
Project Settings
    ↓
API Keys
```

Copiar:

```text
Project URL

Publishable Key

Secret Key
```

---

## Guardar Información

Ejemplo:

```env
SUPABASE_URL=

SUPABASE_PUBLISHABLE_KEY=

SUPABASE_SECRET_KEY=
```

Estas variables serán utilizadas posteriormente por:

```text
Backend
Frontend
```

---

# Paso 3 - Configurar Authentication

Ir a:

```text
Authentication
    ↓
Providers
```

---

## Email Provider

Habilitar:

```text
Email
```

---

## Configuración

Modificar:

```text
Allow New Users to Sign Up
```

Valor:

```text
OFF
```

---

## Justificación

En FinTrack Personal:

```text
No existe registro público.
```

Los usuarios serán administrados internamente.

---

# Paso 4 - Crear Usuario Administrador Inicial

Ir a:

```text
Authentication
    ↓
Users
```

Seleccionar:

```text
Create User
```

---

## Datos

```text
Email:
admin@fintrack.local

Password:
123456
```

---

## Opciones

Activar:

```text
Auto Confirm User
```

---

## Resultado

Supabase creará un registro en:

```text
auth.users
```

---

# Paso 5 - Obtener UUID del Usuario

Ir a:

```text
SQL Editor
```

Ejecutar:

```text

comment Codigo en SQL:

SELECT
    id,
    email
FROM auth.users;
```

---

## Resultado Esperado

```text
UUID
admin@fintrack.local
```

Copiar el UUID.

Será utilizado en la tabla:

```text
usuarios
```

---

# Paso 6 - Crear Esquema de Usuario

Crear tabla:

```text

comment Codigo en SQL:

CREATE TABLE public.usuarios (
    id UUID PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    rol VARCHAR(20) NOT NULL DEFAULT 'ADMIN',
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    requiere_cambio_password BOOLEAN NOT NULL DEFAULT TRUE,

    fecha_creacion TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    fecha_actualizacion TIMESTAMPTZ NOT NULL DEFAULT NOW()
);
```

---

# Paso 7 - Crear Índices

```text

comment Codigo en SQL:

CREATE INDEX idx_usuarios_username
ON public.usuarios(username);
```

---

# Paso 8 - Registrar Administrador Inicial

Reemplazar:

```text
UUID_ADMIN
```

`por el valor obtenido desde:`

```text
auth.users
```

---

```text

comment Codigo en SQL:

INSERT INTO public.usuarios(
    id,
    username,
    nombre,
    rol,
    activo,
    requiere_cambio_password
)
VALUES(
    'UUID_ADMIN',
    'admin',
    'Administrador',
    'ADMIN',
    TRUE,
    TRUE
);
```

---

# Paso 9 - Habilitar Row Level Security

```text
comment Codigo en SQL:

ALTER TABLE public.usuarios
ENABLE ROW LEVEL SECURITY;
```

---

# Paso 10 - Política SELECT

Permite que el usuario consulte únicamente su propio perfil.

```text
comment Codigo en SQL:

CREATE POLICY usuarios_select_propios
ON public.usuarios
FOR SELECT
USING (
    auth.uid() = id
);
```

---

# Paso 11 - Política UPDATE

Permite actualizar únicamente su propio perfil.

```text
comment Codigo en SQL:

CREATE POLICY usuarios_update_propios
ON public.usuarios
FOR UPDATE
USING (
    auth.uid() = id
);
```

---

# Paso 12 - Trigger Auditoría

## Función

```text
comment Codigo en SQL:

CREATE OR REPLACE FUNCTION actualizar_fecha_actualizacion()
RETURNS TRIGGER
LANGUAGE PL/pgSQL
AS $$
BEGIN
    NEW.fecha_actualizacion = NOW();
    RETURN NEW;
END;
$$;
```

---

## Trigger

```text
comment Codigo en SQL:

CREATE TRIGGER trg_usuarios_actualizacion
BEFORE UPDATE
ON public.usuarios
FOR EACH ROW
EXECUTE FUNCTION actualizar_fecha_actualizacion();
```

---

# Verificación Final

Ejecutar:

```text
comment Codigo en SQL:

SELECT *
FROM public.usuarios;
```

Resultado esperado:

```text
1 Usuario

admin

ADMIN

requiere_cambio_password = true
```

---

# Estructura Actual de Base de Datos

```text
auth.users

public.usuarios
```

No se crearán todavía:

```text
categorias

cuentas

transacciones

presupuestos
```

Estas estructuras serán implementadas en futuras User Stories.

---

# Variables de Entorno

## Backend

```env
DB_URL=

DB_USERNAME=

DB_PASSWORD=

SUPABASE_URL=

SUPABASE_SECRET_KEY=
```

---

## Frontend

```env
VITE_SUPABASE_URL=

VITE_SUPABASE_PUBLISHABLE_KEY=
```

---

# Sprint-00 Alcance

Configurado:

```text
✅ Proyecto Supabase

✅ Authentication

✅ PostgreSQL

✅ Usuario Administrador

✅ Tabla usuarios

✅ RLS

✅ Auditoría
```

Pendiente:

```text
⏳ Categorías

⏳ Cuentas

⏳ Transacciones

⏳ Dashboard
```

---

# 🔄 CONEXIÓN DEL FLUJO

## [Origen]

Supabase Authentication

```text
auth.users
```

↓

```text
public.usuarios
```

---

## [Destino]

Backend:

```text
UsuarioRepository

UsuarioService

UsuarioController
```

La US-001 utilizará esta tabla para:

- Consultar perfil administrador.
- Validar usuario activo.
- Obligar cambio inicial de contraseña.