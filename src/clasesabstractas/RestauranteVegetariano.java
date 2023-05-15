package clasesabstractas;

public class RestauranteVegetariano extends Restaurante {

  public RestauranteVegetariano(String nombre, String ubicacion) {
    super(nombre, ubicacion);

  }

  @Override
  void obtenerMenu() {
    System.out.println("Ensalada de Quinoa, Ensalada Cesar, Pasta calabaza...");  
  }

  @Override
  double calcularCostoPedido(int cantidad, double precioUnitario) {
    
    if(cantidad > 10) {
      return 100.0;
    } else {
      return cantidad * precioUnitario;
    }
  }

}
