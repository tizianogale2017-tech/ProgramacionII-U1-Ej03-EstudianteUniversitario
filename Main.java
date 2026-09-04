package Ejercicio3_SistemaEstudiantes;

public class Main {
    public static void main(String[] args) {
        EstudianteUniversitario estudiante1 = new EstudianteUniversitario("12345", "Juan Pérez", 8.5);
        System.out.println("Legajo: " + estudiante1.getLegajo());
        System.out.println("Nombre: " + estudiante1.getNombreCompleto());
        System.out.println("Calificación Final: " + estudiante1.getCalificacionFinal());
        System.out.println("¿Está aprobado? " + (estudiante1.estaAprobado() ? "Sí" : "No"));

        EstudianteUniversitario estudiante2 = new EstudianteUniversitario("67890", "María Gómez", 5.0);
        System.out.println("\nLegajo: " + estudiante2.getLegajo());
        System.out.println("Nombre: " + estudiante2.getNombreCompleto());
        System.out.println("Calificación Final: " + estudiante2.getCalificacionFinal());
        System.out.println("¿Está aprobado? " + (estudiante2.estaAprobado() ? "Sí" : "No"));
    }   }

