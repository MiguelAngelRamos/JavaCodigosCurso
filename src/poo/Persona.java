package poo;

public class Persona {
  
  // Persona es clase fuertemente encapsulada
  // beans
  private String nombre;
  private String apellido;
  private int edad;
  private double peso; 
  private double altura;
  private String genero;
  
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getApellido() {
    return apellido;
  }
  
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  
  public int getEdad() {
    return edad;
  }
  
  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  public double getPeso() {
    return peso;
  }
  
  public void setPeso(double peso) {
    this.peso = peso;
  }
  
  public double getAltura() {
    return altura;
  }
  
  public void setAltura(double altura) {
    this.altura = altura;
  }
  
  public String getGenero() {
    return genero;
  }
  
  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  
}
