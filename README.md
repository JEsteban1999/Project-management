# Project Management System

Una aplicación web para el control y seguimiento del avance de proyectos de desarrollo, divididos en historias de usuario y tickets de desarrollo.

## Tabla de Contenidos

- [Descripción General](#descripción-general)
- [Características](#características)
- [Arquitectura](#arquitectura)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Requisitos Previos](#requisitos-previos)
- [Configuración del Proyecto](#configuración-del-proyecto)
- [Uso](#uso)
- [Endpoints Principales](#endpoints-principales)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

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

---

## Requisitos Previos

1. **Java 17 o superior** instalado.
2. **Maven** instalado.
3. Un servidor de base de datos como MySQL o PostgreSQL.
4. Un entorno de desarrollo, como **IntelliJ IDEA** o **Eclipse**.

---

## Configuración del Proyecto

1. **Clonar el Repositorio:**

   ```bash
   git clone https://github.com/tu-usuario/project-management-system.git
   cd project-management-system
Configurar la Base de Datos:

Crea una base de datos llamada project_management en MySQL o PostgreSQL.

Configura el archivo src/main/resources/application.properties:

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/project_management
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
Instalar Dependencias:

Ejecuta el siguiente comando para instalar las dependencias:

bash
Copiar código
mvn install
Iniciar la Aplicación:

bash
Copiar código
mvn spring-boot:run
Uso
Una vez iniciado el servidor, accede a la aplicación en:

arduino
Copiar código
http://localhost:8080
Prueba los endpoints utilizando una herramienta como Postman o cURL.

Endpoints Principales
Compañías:

GET /api/companies - Listar todas las compañías.
Tickets:

POST /api/tickets - Crear un ticket.
PUT /api/tickets/{id} - Editar un ticket.
PUT /api/tickets/{id}/cancel - Cancelar un ticket.
Contribuciones
¡Contribuciones son bienvenidas! Para contribuir:

Haz un fork del repositorio.
Crea una rama nueva con tu funcionalidad (git checkout -b feature/nueva-funcionalidad).
Realiza un commit de tus cambios (git commit -m 'Agrega nueva funcionalidad').
Haz un push a tu rama (git push origin feature/nueva-funcionalidad).
Abre un Pull Request.
Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

css
Copiar código

Este archivo proporciona una guía completa para configurar y trabajar en el proyecto. Puedes adaptarlo según tus necesidades específicas. 😊





Tú dijiste:
no se generó por completo en formato .md, creo que se me mezcla con tu propio formato de respuesta
ChatGPT Plus
ChatGPT
Tienes razón, aquí está nuevamente tu README.md, 100% en formato Markdown:

markdown
Copiar código
# Project Management System

Una aplicación web para el control y seguimiento del avance de proyectos de desarrollo, divididos en historias de usuario y tickets de desarrollo.

## Tabla de Contenidos

- [Descripción General](#descripción-general)
- [Características](#características)
- [Arquitectura](#arquitectura)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Requisitos Previos](#requisitos-previos)
- [Configuración del Proyecto](#configuración-del-proyecto)
- [Uso](#uso)
- [Endpoints Principales](#endpoints-principales)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

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

---

## Requisitos Previos

1. **Java 17 o superior** instalado.
2. **Maven** instalado.
3. Un servidor de base de datos como MySQL o PostgreSQL.
4. Un entorno de desarrollo, como **IntelliJ IDEA** o **Eclipse**.

---

## Configuración del Proyecto

1. **Clonar el Repositorio:**

   ```bash
   git clone https://github.com/tu-usuario/project-management-system.git
   cd project-management-system
Configurar la Base de Datos:

Crea una base de datos llamada project_management en MySQL o PostgreSQL.

Configura el archivo src/main/resources/application.properties:

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/project_management
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
Instalar Dependencias:

Ejecuta el siguiente comando para instalar las dependencias:

bash
Copiar código
mvn install
Iniciar la Aplicación:

bash
Copiar código
mvn spring-boot:run
Uso
Una vez iniciado el servidor, accede a la aplicación en:

arduino
Copiar código
http://localhost:8080
Prueba los endpoints utilizando una herramienta como Postman o cURL.

Endpoints Principales
Compañías:

GET /api/companies - Listar todas las compañías.
Tickets:

POST /api/tickets - Crear un ticket.
PUT /api/tickets/{id} - Editar un ticket.
PUT /api/tickets/{id}/cancel - Cancelar un ticket.
