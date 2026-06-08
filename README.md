# Programacion3-AndyPaulino-Entregable1-Andy01210-Programacion3-AndyPaulino-Tarea3

#Tarea: Manejo de Excepciones en Java

##Estudiante
Andy Paulino

##Matrícula
1000-6051

## Materia
Programación 3

##Objetivo de la Práctica
Desarrollar una aplicación en Java que permita registrar usuarios, validando la información ingresada y aplicando técnicas robustas de manejo de errores. El propósito de esta tarea es reforzar los conceptos del capítulo de Excepciones:
- Bloques `try`, `catch` y múltiples `catch`.
- Bloque `finally`.
- Palabras reservadas `throw` y `throws`.
- Creación de Excepciones personalizadas.
- Uso del método `getMessage()`.
- Manejo de `InputMismatchException` (Bonus aplicado).

##Descripción
Una empresa necesita un sistema interactivo de consola para registrar usuarios en su plataforma. El programa solicita información personal (Nombre, Edad, Correo electrónico y Salario mensual) y debe garantizar, antes de cualquier registro, que todos los datos cumplen con reglas de negocio estrictas.

##Validaciones y Reglas de Negocio
El sistema incluye un método central de validación que se encarga de auditar los siguientes campos:

* **Nombre:** No puede estar vacío y debe tener al menos 3 caracteres (ej. "Al" es inválido).
* **Edad:** Debe estar en el rango de 18 a 100 años (ej. 15 es inválido).
* **Correo Electrónico:** Debe contener obligatoriamente los caracteres `@` y `.` (ej. "juan@correo" es inválido).
* **Salario:** Debe ser estrictamente mayor que 0 (ej. -5000 es inválido).

##Requisitos Técnicos Aplicados
**Excepciones Personalizadas Creadas:**
    * `NombreInvalidoException`
    * `EdadInvalidaException`
    * `CorreoInvalidoException`
    * `SalarioInvalidoException`
* **Gestión de Errores Nativos:** Control de `InputMismatchException` para evitar que el programa falle si el usuario ingresa texto donde se esperan números.
* **Flujo Controlado:** Uso de `finally` para indicar siempre el cierre del proceso de validación.

##Estructura del Proyecto

De acuerdo con la organización del repositorio, los archivos se distribuyen de la siguiente manera:

```text
NombreRepositorio
│
├── evidencias/
│   ├── Caso1.png
│   ├── Caso2.png
|   ├── Caso3.png
|   ├── Caso4.png
│   └── CasoBonus.png
│
├── src/
│   ├── CorreoValidator.java
│   ├── EdadValidator.java
│   ├── Empleado.java
│   ├── EmpleadoValidator.java
│   ├── ListaEmpleado.java
│   ├── Main.java
|   ├── SalarioValidator.java
│   └── UsuarioService.java
│
├── .gitignore
└── README.md
