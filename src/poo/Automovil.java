package poo;

public class Automovil {
  
  // Atributos
  private String marca;
  private String color;
  private int numRuedas;
  private int numPuertas;
  private double precio;
  
  // Constructor
 
  public Automovil(String marca, String color, int numRuedas, int numPuertas, double precio) {
  
    this.marca = marca;
    this.color = color;
    this.numRuedas = numRuedas;
    this.numPuertas = numPuertas;
    this.precio = precio;
    
  }
  
  // métodos de la clase Automovil
  // arrancar
  public void arrancar() {
    System.out.println("El automóvil esta arracando...");
  }
  // acelerar
  public void acelerar() {
    System.out.println("El automóvil esta acelerando...");
  }
  // frenar
  public void frenar() {
    System.out.println("El automóvil esta frenando...");
  }
  

}
