package soluciones;

import java.util.Scanner;

public class RegistrosUsuariosSalud {

  public static void main(String[] args) {
    
    // Variables
    String nombre;
    String fecha;
    String numIdentificacion;
    String tipoUsuario;
    // necesito crear es una instancia de clase Scanner
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese el nombre de usuario:");
    nombre = sc.nextLine();
    
    System.out.println("Ingrese fecha de nacimiento: (dd/mm/yyyy)");
    fecha = sc.nextLine();
    // Vamos al break principal de 10 min
    
    System.out.println("Ingrese el número de indentificación: ");
    numIdentificacion = sc.nextLine();
    
    System.out.println("Ingrese el tipo de usuario (paciente, médico, administrativo)");
    tipoUsuario = sc.nextLine();
    // Que podriamos utilizar?? switch case o if
    // equalsIgnoreCase : no tiene en cuenta las diferencias entre mayusculas y minusculas
    
    if("paciente".equalsIgnoreCase(tipoUsuario)) {
      
      System.out.println("Ingrese la dirección:");
      String direccion = sc.nextLine();
      
      System.out.println("Ingrese el teléfono");
      String telefono = sc.nextLine();
      
      System.out.println("Ingrese las alergias (separadas por comas): ");
      String alergias = sc.nextLine();
      
      //Prestamos la información de paciente   
      System.out.println("Usuario registrado: ");
      System.out.println("Nombre: " + nombre);
      System.out.println("Fecha de nacimiento: " + fecha);
      System.out.println("Número de indentificación: " + numIdentificacion);
      
      System.out.println("Dirección: " + direccion);
      System.out.println("Telefono: " + telefono);
      System.out.println("Alergias: " + alergias);
      
    } else if("administrativo".equalsIgnoreCase(tipoUsuario)) {
      // Personal administrativo: función, departamento
      System.out.println("Ingrese la función: ");
      String funcion = sc.nextLine();
      
      System.out.println("Ingrese el departamento: ");
      String departamento = sc.nextLine();
      
      System.out.println("Usuario registrado: ");
      System.out.println("Nombre: " + nombre);
      System.out.println("Fecha de nacimiento: " + fecha);
      System.out.println("Número de indentificación: " + numIdentificacion);
      
      System.out.println("Funcion: " + funcion);
      System.out.println("Departamento: " +  departamento);
    }
   
  
  }
}
