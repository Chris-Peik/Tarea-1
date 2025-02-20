# Proyecto Spring Boot - Hola Spring

Este es un proyecto simple de Spring Boot que expone un endpoint REST para retornar el mensaje **"¡Hola Spring!"**.

## 📌 Prerrequisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

- **Java 17 o superior** ([Descargar JDK](https://adoptium.net/))
- **Maven 3.8+** ([Descargar Maven](https://maven.apache.org/download.cgi))
- **Git** (opcional, para clonar el repositorio)

Puedes verificar las versiones instaladas con los siguientes comandos:

```sh
java -version
mvn -version
git --version
```

---

## Instalación y Ejecución en Local

### Opción 1.- Clonar el Repositorio 

Puedes clonarlo con:

```sh
git clone https://github.com/Chris-Peik/Tarea-1.git
cd Tarea-1
```
### Opción 2.- Usar la Web del Repositorio
Ingresa a https://github.com/Chris-Peik/Tarea-1.git 
 #### a) Descargar y descomprimir los archivos en una carpeta
 #### b) Usar GitHub Desktop


### 2️⃣ Construir y Ejecutar el Proyecto

Ejecuta los siguientes comandos en la terminal dentro de la carpeta del proyecto:
```sh
mvn clean package
mvn spring-boot:run
```

Si la compilación es exitosa, deberías ver algo como:

```sh
Tomcat started on port 8080
```

Esto indica que la aplicación está corriendo en [**http://localhost:8080**](http://localhost:8080).

---

## 🔥 Probar el Endpoint

Puedes probar el endpoint con **curl** o desde el navegador:

```sh
curl http://localhost:8080/api/hola
```

🔹 **Salida esperada:**

```sh
¡Hola Spring!
```

También puedes abrir en el navegador:\
[http://localhost:8081/](http://localhost:8081/)

---

## ✨ Créditos

Este proyecto fue desarrollado como una tarea práctica con **Spring Boot** y **Maven**.

