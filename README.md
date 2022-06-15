# Aplicación de contactos

Está pequeña aplicación tiene la capacidad de, realizar las operaciones básicas sobre una tabla de base de datos llamada "contactos", permitiendo generar un crud que funciones como una agenda de contactos.

## Información

Este proyecto se creó usando Spring Boot 2.7.0 y las siguientes dependencias:
- Spring Web
- Spring Data JPA
- Spring Boot DevTools
- MySQL Driver
- Thymeleaf

### Requisitos para su ejecución

- Tener instalada una versión del JDK igual o superior a la 8
- Tener instalada una versión de Maven igual o superior a la 3.8.4
- Un IDE que pueda ejecutar proyectos Spring Boot
- Una base de datos (de preferencia MySQL)


### Configuración inicial

El proyecto está configurado que al realizar su primera ejecución cree un tabla llamada "contactos" en una base de datos "contactos", usando como motor de base de datos MySQL8.

#### Cambio de motor de base de datos
Para cambiar el motor de base de datos que usa la aplicación debes modificar las dependecias en el archivo "pom.xml" escogiendo la dependencia adecuada para el motor de base de datos que uses y luego modificar las propiedades que se encuentran en el archivo "application.properties" para que se conecte correctamente.