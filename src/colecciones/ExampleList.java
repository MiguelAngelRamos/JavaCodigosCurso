package colecciones;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

  public static void main(String[] args) {
    
    // Las listas conservan el orden
    List<String> miLista = new ArrayList<>();
    miLista.add("Lunes");
    miLista.add("Martes");
    miLista.add("Miercoles");
    miLista.add("Jueves");
    miLista.add("Viernes");
    miLista.add("Sabado");
    miLista.add("Domingo");
    
    // for each
    for(String elemento: miLista) {
      System.out.println("Elemento: " + elemento);
     }
    
    // Java 8 hacia delante (lambdas)
    // miLista.forEach(elemento -> {
    // System.out.println("Elemento: " + elemento);
    // });
    
  }

}
