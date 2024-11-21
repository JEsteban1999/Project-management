# Project Management System

Una aplicación web para el control y seguimiento del avance de proyectos de desarrollo, divididos en historias de usuario y tickets de desarrollo.

## Tabla de Contenidos

- [Descripción General](#descripción-general)
- [Características](#características)
- [Arquitectura](#arquitectura)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)

---

## Descripción General

El sistema permite a los usuarios crear y gestionar proyectos de desarrollo, organizados en historias de usuario y tickets de desarrollo. Cada ticket puede tener un estado y estar asociado a una historia de usuario dentro de un proyecto específico.

El objetivo principal es simplificar la gestión de proyectos y su progreso mediante una interfaz amigable y funcional.

---

## Características

- **Gestión de Usuarios:**
  - Registro de usuarios y asociación a una compañía existente.
  - Inicio de sesión seguro mediante autenticación.

- **Gestión de Proyectos:**
  - Visualización de proyectos y sus historias de usuario.
  - Creación de nuevas historias de usuario con su primer ticket.

- **Gestión de Tickets:**
  - Creación, edición, cancelación y actualización de tickets.
  - Historial de tickets con estados diferenciados:
    - **Activo**
    - **En Proceso**
    - **Finalizado**
    - **Cancelado**

- **Datos Iniciales:**
  - Precreación de compañías, proyectos y algunas historias de usuario para pruebas.

---

## Arquitectura

El proyecto sigue una arquitectura en capas:

- **Capa de Controlador:** Maneja las solicitudes HTTP y expone endpoints RESTful.
- **Capa de Servicio:** Contiene la lógica de negocio.
- **Capa de Repositorio:** Maneja el acceso y la persistencia de datos en la base de datos.

---

## Tecnologías Utilizadas

- **Backend:**
  - Java 17
  - Spring Boot
  - Spring Data JPA
  - Spring Security (con JWT para autenticación)

- **Base de Datos:**
  - MySQL o PostgreSQL

- **Frontend:**
  - Angular o React (no incluido en este repositorio)

- **Herramientas Adicionales:**
  - Maven para la gestión de dependencias
  - Hibernate para el ORM
  - Lombok para simplificar el código (opcional)
