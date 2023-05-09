package poo;

public class EjecutarAutomovil {

  public static void main(String[] args) {
    
    // Automovil auto = new Automovil("Hyundai", "Azul", 4, 4, 1000);
    
    Automovil auto = new Automovil();
    // Automovil auto = new Automovil("Hyundai");
    auto.arrancar();
    auto.acelerar();
    auto.frenar();
  
  }
}
