# Clinical Appointment System

## Descripción

Este programa simula un **sistema de administración de citas médicas** para un consultorio clínico.

Permite registrar doctores, pacientes, crear y administrar citas, y restringir el acceso solo a administradores autorizados.

Toda la información se guarda en archivos **CSV** dentro de la carpeta `/db`.

## Instalación y configuración

### Requisitos previos

- **Java JDK 11 o superior** instalado.
- **IntelliJ IDEA** o cualquier IDE compatible con Java.
- **Git** instalado y configurado.
- **Cuenta en GitHub** con un repositorio creado.

### Pasos de instalación

1. Clona el repositorio desde GitHub.
2. Abre el proyecto en IntelliJ IDEA o tu IDE preferido.
3. Compila el proyecto utilizando JDK 11 o superior.
4. Ejecuta la clase principal `Main.java`.
5. El sistema generará automáticamente los archivos de base de datos en la carpeta `/db`.

### Uso del programa

Al iniciar el sistema, se presentará un menú con las siguientes opciones:

- **Dar de alta doctores**: Registra nuevos médicos en el sistema incluyendo ID, nombre completo y especialidad.
- **Dar de alta pacientes**: Registra nuevos pacientes con su identificador único y datos personales.
- **Crear una cita**: Agenda nuevas citas médicas asignando doctor, paciente, fecha, hora y motivo de la consulta.
- **Listar citas**: Visualiza todas las citas programadas en el sistema.
- **Editar o eliminar citas**: Modifica los detalles o cancela citas existentes.
- **Salir**: Finaliza la ejecución del programa.

**Nota:** Toda la información se almacena automáticamente en archivos CSV dentro del directorio de base de datos.
