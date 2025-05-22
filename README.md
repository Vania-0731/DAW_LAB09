
# DAW_LAB09 - Sistema de Gestión de Alumnos y Cursos

Este proyecto es una aplicación web desarrollada con **Spring Boot** y **Thymeleaf** que permite gestionar alumnos y cursos mediante operaciones CRUD (Crear, Leer, Actualizar, Eliminar).

## 📌 Tecnologías utilizadas

- Java 17+
- Spring Boot 3
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- Bootstrap 5

## 🚀 Instrucciones para correr el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/Vania-0731/DAW_LAB09.git
cd DAW_LAB09
```

### 2. Configurar la base de datos

Asegúrate de tener una base de datos MySQL corriendo.

Luego crea una base de datos llamada:

```sql
CREATE DATABASE daw_lab09;
```

Configura las credenciales en el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/daw_lab09
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

> Reemplaza `tu_usuario` y `tu_contraseña` con tus datos de acceso a MySQL.

### 3. Ejecutar la aplicación

Puedes correr el proyecto desde tu IDE (IntelliJ, Eclipse, etc.) o con el siguiente comando:

```bash
./mvnw spring-boot:run
```

O si usas Maven:

```bash
mvn spring-boot:run
```
#### O solo le das run 

### 4. Acceder a la aplicación

Abre tu navegador y ve a:

```
http://localhost:8086/alumno
```

Desde ahí puedes:

- Listar alumnos
- Buscar por nombre
- Crear, editar y eliminar registros

## 📷 Capturas de pantalla

![image](https://github.com/user-attachments/assets/5c8274cf-a956-4a08-bfa6-f6b4a0da11c8)

---

## 🧑‍💻 Autor

- Vania - [@Vania-0731](https://github.com/Vania-0731)
