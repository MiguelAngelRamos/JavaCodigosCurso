package fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period; // calcular periodos

public class Main {

  public static void main(String[] args) {

    // String fechaNacimiento;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Ingrese su fecha nacimiento (formato dd-MM-yyyy 'dia-mes-año')");
    // System.out.println("Ingrese su fecha nacimiento (formato dd-MM-yyyy 'dia-mes-año')");
    // fechaNacimiento = sc.nextLine();
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    // LocalDate fechaInput = LocalDate.parse(fechaNacimiento, formatter);
    // System.out.println("Su fecha de nacimiento es: " + fechaInput);
    //sc.close();

    LocalDate fecha = LocalDate.of(1992, 7, 24);
    LocalDate fechaActual = LocalDate.now(); // fecha de actual de ahora
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String fechaFormateada = fecha.format(formatter);

    Period periodo = Period.between(fecha, fechaActual);
    System.out.println("Edad : " + periodo.getYears());
  }

}