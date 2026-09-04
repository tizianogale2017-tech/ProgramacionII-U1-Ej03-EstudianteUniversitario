package Ejercicio3_SistemaEstudiantes;

public class EstudianteUniversitario {
   private String legajo;
   private String nombreCompleto;
   private double calificacionFinal;

   public EstudianteUniversitario(String legajo, String nombreCompleto, double calificacionFinal) {
       this.legajo = legajo;
       this.nombreCompleto = nombreCompleto;
       setCalificacionFinal(calificacionFinal);
   }
   public void setCalificacionFinal(double calificacionFinal) {
       if (calificacionFinal < 0.0 || calificacionFinal > 10.0) {
           throw new IllegalArgumentException("La calificación final debe estar entre 0 y 10.");
       }
       this.calificacionFinal = calificacionFinal;
   }
    public String getLegajo() {
        return legajo;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public double getCalificacionFinal() {
        return calificacionFinal;
}
public void setLegajo(String legajo) {
    this.legajo = legajo;
}
public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
}
public boolean estaAprobado() {
    return calificacionFinal >= 6.0;
}
}
