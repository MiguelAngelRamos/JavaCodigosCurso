package clasesabstractas;

public class Pizzeria extends Restaurante {

  public Pizzeria(String nombre, String ubicacion) {
    super(nombre, ubicacion);
    // TODO Auto-generated constructor stub
  }

  @Override
  void obtenerMenu() {
    System.out.println("Pizza Española, Pizza Pepperoni, Pizza de Vegetales");
    
  }

  @Override
  double calcularCostoPedido(int cantidad, double precioUnitario) {
    if(cantidad > 5) {
      return cantidad * (precioUnitario * 0.9);
    } else {
      return cantidad * precioUnitario;
    }
  }

}
