Sistema de Gestión de Empleados
Descripción
Este es un sistema de gestión de empleados desarrollado con Spring Boot. Permite realizar operaciones relacionadas con la administración de empleados como consulta y cálculo de salarios.

Tecnologías Utilizadas
Java 17, Spring Boot 3, Maven, Lombok, JUnit y Mockito (para pruebas unitarias), Spring Security

Instalación y Ejecución
Clonar el repositorio: git clone https://github.com/dapontece/employee-management.git
Navegar al directorio del proyecto: cd employee-management
Compilar y ejecutar la aplicación: mvn clean install && mvn spring-boot:run
Acceder a la API en: http://localhost:8080/

Endpoints Principales
Gestión de Empleados
GET api/employees/all: Obtiene la lista de empleados. GET api/employees/{id}: Obtiene un empleado por ID.

Seguridad
El sistema implementa Spring Security

Pruebas
Para ejecutar las pruebas unitarias: mvn test

Autor
Desarrollado por Santiago Cárdenas Ramírez.
