# EstudianteUniversitario

Programación II - Unidad 1 - Ejercicio 3

## Consigna
Almacenar la información académica de un estudiante y determinar
automáticamente si aprobó según su calificación final.

## Lógica
La clase encapsula `legajo`, `nombreCompleto` y `calificacionFinal`.
El constructor delega la validación de la nota al setter
`setCalificacionFinal()`, que lanza `IllegalArgumentException` si el
valor no está entre 0 y 10 — así se garantiza que ningún objeto pueda
crearse con una nota inválida, ni siquiera desde el constructor.
`estaAprobado()` retorna directamente el resultado de la comparación
`calificacionFinal >= 6.0`, sin necesidad de un `if`.

## Ejecución
<img width="635" height="396" alt="image" src="https://github.com/user-attachments/assets/d278f018-d170-49f9-ace6-f1f5fda88893" />
