package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleSet {

  public static void main(String[] args) {
    
    // no respeta el orden
    Set<String> miSet = new HashSet<>();
    miSet.add("Enero");
    miSet.add("Febrero");
    miSet.add("Marzo");
    miSet.add("Abril");
    miSet.add("Mayo");
    miSet.add("Mayo");
    
    
    if(miSet.contains("Febrero")) {
      System.out.println("Efectivamente existe Febrero!!");
    } else {
      System.out.println("No existe ese mes dentro de la coleccion miSet");
    }
 
    // imprimir(miSet);
    List<String> miLista = new ArrayList<>();
    miLista.add("Lunes");
    miLista.add("Martes");
    miLista.add("Miercoles");
    miLista.add("Jueves");
    miLista.add("Viernes");
    miLista.add("Sabado");
    miLista.add("Domingo");
    miLista.add("Domingo");
   
    System.out.println(miLista.get(1));
    // imprimir(miLista);
    
  } // fin del main 
  
  public static void imprimir(Collection<String> coleccion ) {
   coleccion.forEach(elemento -> {
     System.out.println("el elemento es: " + elemento);
   });
  }

}
