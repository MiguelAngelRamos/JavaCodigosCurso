package herencia;

// Este nombre de clase sigue la convención CamelCase (Pascal Case, UpperCase)
public class Persona {

  // Atributos
  protected String nombre; // CamelCase (lowerCamelCase)
  private String fechaDeNacimiento;
  
  
  public Persona(String nombre, String fechaDeNacimiento) {
    this.nombre = nombre;
    this.fechaDeNacimiento = fechaDeNacimiento;
  }
  
  
  // Metodos
  
  public void dormir() {
    System.out.println("Soy " + nombre + " y estoy durmiendo..");
  }
  
  public void respirar() {
    System.out.println("Soy " + nombre + " y estoy respirando desde: " + fechaDeNacimiento);
  }
  
  public void comer() {
    System.out.println("Soy " + nombre + " y estoy comiendo");
  }
}
