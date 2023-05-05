package soluciones;

import java.util.Scanner;

public class Taller {
  
  public static void main(String[] args) {
    
 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese la fecha del taller: ");
    // nextLine me permite obtener un string
    String fecha = sc.nextLine();
    
    System.out.println("Ingrese la hora del taller:");
    String hora = sc.nextLine();
    
    System.out.println("Ingrese lugar del taller:");
    String lugar = sc.nextLine();
    
    System.out.println("Ingrese la duración del taller (en horas):");
    int duracion = sc.nextInt();
    
    // el nextInt no consume el caracter de la nueva linea que sigue al int ingresado por el usuario
    // solo lee el numero y no el caracter siguiente cuando el usuario presiona enter para enviar una entrada
    // usamos sc.nextLine(); para el "enter"
    sc.nextLine();
    System.out.println("Ingrese el numero de participantes:");
    int numParticipantes = sc.nextInt();
    
    // matriz[fila, columna]
    String [][] matriz = new String[numParticipantes][3];
    
    // i = i + 1 
    // i++
    for(int i=0; i< numParticipantes; i++) {
      
      System.out.println("Ingrese el nombre del participante: " + (i + 1) + ":");
      // fila 0 y columna 0
      matriz[i][0] = sc.nextLine();
      
      System.out.println("Ingrese la empresa del participante: " + (i + 1) + ":");
      matriz[i][1] = sc.nextLine();
      
      System.out.println("Ingrese la calificacion del participante " + (i + 1) + ":");
      matriz[i][2] = String.valueOf(sc.nextInt());
      sc.nextLine();
      // VAMOS AL MINI BREAK DE 5 MIN
    }
    
    
  }
}
