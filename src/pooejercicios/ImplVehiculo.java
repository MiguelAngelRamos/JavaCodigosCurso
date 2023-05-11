package pooejercicios;

import java.util.Scanner;

public class ImplVehiculo {
  

  public static void main(String[] args) {
    
    String marca, modelo;
    int precio, numeroVehiculos, indiceVehiculoBarato;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de Vehiculos: ");
    numeroVehiculos = sc.nextInt();
    
    Vehiculo vehiculoArray[] = new Vehiculo[numeroVehiculos];
    // [2, 2] longitud 2
    // 0, 1
    for(int i=0; i<vehiculoArray.length; i++) {
      sc.nextLine(); // \n
      System.out.println("Ingrese las caracteristicas del Vehiculo: " + (i + 1) + ":");
      System.out.println("Introduzca la Marca:");
      marca = sc.nextLine();
      System.out.println("Introduzca el Modelo: ");
      modelo = sc.nextLine();
      System.out.println("Introduzca el Precio: ");
      precio = sc.nextInt();
      
      // Asignarle a los objetos creados que estan dentro del array (vehiculoArray[])
      vehiculoArray[i] = new Vehiculo(marca, modelo, precio);
      
    } // fin For
    indiceVehiculoBarato = indiceVehiculoMasBarato(vehiculoArray); // obtengo el indice el Vehiculo mas barato
    System.out.println("El Vehiculo mas barato es: ");
    System.out.println(vehiculoArray[indiceVehiculoBarato].mostrarDatosVehiculo());
    
  } // fin main
  // vehiculo[] = vehiculoArray
  public static int indiceVehiculoMasBarato(Vehiculo vehiculo[]) {
    // logica
    int precio;
    int indice = 0;
    
    precio = vehiculo[0].obtenerPrecio();
    
    for(int i = 1; i < vehiculo.length; i++) {
      if(vehiculo[i].obtenerPrecio() < precio) {
        precio = vehiculo[i].obtenerPrecio();
        indice = i;
      }
    }
    
    return indice;
  }
  

}
