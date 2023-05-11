package herencia;

public class MainPersona {

  public static void main(String[] args) {
    Estudiante estudiante = new Estudiante("Natalia", "15-10-2002", 1644);
    
    // metodos
    estudiante.dormir();
    estudiante.respirar();
    
    estudiante.aprobar();
  }
}
