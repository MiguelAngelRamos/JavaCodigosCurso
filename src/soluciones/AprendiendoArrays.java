package soluciones;

import java.util.Scanner;

public class AprendiendoArrays {

  public static void main(String[] args) {
    
    // es una instancia de la clase Scanner "sc", con "sc" pueda acceder a los metodos de clase "Scanner"
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Proporcione la longitud del Array");
    // nextLine() para la cadena de caracteres
    int longitud = sc.nextInt();
    
    int [] numeros = new int[longitud];
    // int numeros []
    
    System.out.println("Ingrese los numeros: ");
    // i++ => i = i + 1;
    for(int i=0; i < longitud; i++) {
      numeros[i] = sc.nextInt();
    }
    
    // imprimir el array con los numeros ingresados
    imprimirArray(numeros);
    
    // PROGREMOS EL MENU!
    int opcion;
    int suma;
    int [] maxMin; // es guardar el valor maximo [0] y valor minimo [1]
    do {
      System.out.println("Seleccione una opción: ");
      System.out.println("1. Sumar");
      System.out.println("2. Encontrar el máximo");
      System.out.println("3. Encontrar el minimo");
      System.out.println("4. Salir");
      opcion = sc.nextInt();
      
      // switch case
      
      switch(opcion) {
      
        case 1:
          suma = calcularSuma(numeros);
          System.out.println("La suma de los numeros es: " + suma);
          break;
        case 2:
          maxMin = encontrarMaxMin(numeros);
          System.out.println("El valor máximo del array es: " + maxMin[0]);
          break;
        case 3:
          maxMin = encontrarMaxMin(numeros);
          System.out.println("El valor minimo del array es: " + maxMin[1]);
          break;
        case 4: 
          System.out.println("Hasta pronto!");
          break;
        default:
          System.out.println("Opción no valida, porfavor intentelo de nuevo");
          
        }
      
      
    } while(opcion !=4);
    
  } // fin main
  
  // método imprimirArray
  public static void imprimirArray(int [] array) {
    // todo el codigo necesario para poder imprimir el array
    System.out.println("Los elementos del array son: ");
    for(int i=0; i< array.length; i++) {
      System.out.println(array[i] + " ");
    }
      
  }
  
  public static int calcularSuma(int [] array) {
    int suma = 0;
    // array [1,2]
    // array[0] = 1;
    // array[1] = 2;
    for(int i=0; i< array.length; i++) {
      // suma += array[i];
      suma = suma + array[i];
      // 0 = 0 + array[0] => 0 = 0 + 1 => 1
      // 1 = 1 + array[1] => 1 = 1 + 2 => 3
    }
    return suma;
    // vamos al break de 5 min
  }
  //  0, 1, 2, 3, 4
  // [1, 2, 4, 6, 10]
  public static int[] encontrarMaxMin(int [] array) {
    
    int max = array[0]; // 1 es maximo
    int min = array[0]; // 1 es minimo
    
    for(int i = 1; i < array.length; i++) {
      
      if(array[i] > max) {
          max = array[i]; // encontre el valor maximo
      }
      
      if(array[i] < min) {
         min = array[i]; // encontre el minimo
      }
    }
    
    return new int[] {max, min}; // 0 => 1, 1 => 2
  }
  
  
  
} // fin de la clase AprendiendoArray
