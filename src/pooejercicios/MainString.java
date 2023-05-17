package pooejercicios;

public class MainString {
  
  public static void main(String[] args) {
    
    StringBuilder nuestraCadena = new StringBuilder(); // +
    System.out.println('J' + 'a' + 'v' + 'a'); // Java
    // Java
    nuestraCadena.append('J');
    nuestraCadena.append('a');
    nuestraCadena.append('v');
    nuestraCadena.append('a');
    
    System.out.println(nuestraCadena); // Java
    
    String entrada = "A la Ronda de San Miguel en que Se rie se Va al Cuartel 123";
    // pasarlo por un función previamente
    System.out.println(transformarString(entrada));
  }
  
  
  public static String transformarString(String entrada) {
    
    // for each
    for(char caracter: entrada.toCharArray()) {
      System.out.println(caracter);
      // para saber
      System.out.println(Character.isLowerCase(caracter)); // para poder saber cuales sin minisculas
      System.out.println(Character.isUpperCase(caracter));
      // transformar
      System.out.println(Character.toLowerCase(caracter)); // para poder saber cuales sin minisculas
      System.out.println(Character.toUpperCase(caracter));
      
    }
    return "";
    
  }

}
