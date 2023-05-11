package herencia;

public class Estudiante extends Persona{

  private int numeroIdentificador;
  
  public Estudiante(String nombre, String fechaDeNacimiento, int numeroIdentificador) {
    super(nombre, fechaDeNacimiento);
    this.numeroIdentificador = numeroIdentificador;
    
  }
  
  // metodos
  
  public void aprobar() {
    System.out.println("Soy " + nombre + " y aprobe el examen");
  }
  
  public void reprobar() {
    System.out.println("Soy " + nombre + " y reprobe mi examen");
  }
  
  
  @Override
  public void dormir() {
    System.out.println("Mi nombre es: " + nombre + " soy estudiante y no duermo!..");
  }
}
