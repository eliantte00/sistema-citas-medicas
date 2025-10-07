# Clinical Appointment System

## Descripción
Este programa simula un **sistema de administración de citas médicas** para un consultorio clínico.  
Permite registrar doctores, pacientes, crear y administrar citas, y restringir el acceso solo a administradores autorizados.  
Toda la información se guarda en archivos **CSV** dentro de la carpeta `/db`.

##Instalación y configuración

### Requisitos previos
- **Java JDK 11 o superior** instalado.  
- **IntelliJ IDEA** o cualquier IDE compatible con Java.  
- **Git** instalado y configurado.  
- **Cuenta en GitHub** con un repositorio creado.

### Pasos de instalación
Clona el repositorio.

Abre el proyecto en IntelliJ IDEA.

Compila el proyecto con JDK 11+.

Ejecuta el archivo principal:
Main.java

El programa generará automáticamente los archivos necesarios en la carpeta /db.

Uso del programa

Al iniciar el programa, verás un menú con las siguientes opciones:

Dar de alta doctores
Permite registrar nuevos doctores con su ID, nombre y especialidad.

Dar de alta pacientes
Permite registrar nuevos pacientes con su ID y nombre completo.

Crear una cita
Permite agendar una cita asignando un doctor y un paciente, junto con fecha, hora y motivo.

Listar citas
Muestra todas las citas registradas en el sistema.

Editar o eliminar citas
Permite modificar o borrar citas existentes.

Salir
Finaliza el programa.

Todos los datos se guardan automáticamente en formato CSV.
