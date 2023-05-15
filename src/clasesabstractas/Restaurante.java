package clasesabstractas;

public abstract class Restaurante {

  String nombre;
  String ubicacion;
  
  public Restaurante(String nombre, String ubicacion) {
    this.nombre = nombre;
    this.ubicacion = ubicacion;
  }
  
  abstract void obtenerMenu();
  abstract double calcularCostoPedido(int cantidad, double precioUnitario);
}
