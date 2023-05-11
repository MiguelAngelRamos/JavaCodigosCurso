package pooejercicios;

public class Vehiculo {
  // propieades de vehiculo
  private String marca;
  private String modelo;
  private int precio;
  
  public Vehiculo(String marca, String modelo, int precio) {
  
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    
  }
  
  public int obtenerPrecio() {
    return precio;
  }
  
  public String mostrarDatosVehiculo() {
    return "Marca:  " + marca + " Modelo: " + modelo + "Precio: " +  precio;
  }
  
}
