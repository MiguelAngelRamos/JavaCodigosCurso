package pooejercicios;

public class Persona {
  
  private String nombre;
  private int edad;
 
  
  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  
  public void bailar(Persona persona) {
    System.out.println(nombre + " esta bailando con: " + persona.nombre);
  }
  
//  public void imprimirInformacion() {
//    System.out.println("Nombre: " + nombre);
//    System.out.println("Edad: " +  edad);
//  }

  @Override
  public String toString() {
    return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
  }
  
  
}
