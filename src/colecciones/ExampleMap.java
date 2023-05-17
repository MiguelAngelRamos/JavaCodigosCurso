package colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

  public static void main(String[] args) {
  
    Map<String, String> miMapa = new HashMap<>();
    miMapa.put("valor1", "Sofia");
    miMapa.put("valor2", "Camila");
    miMapa.put("valor3", "Miguel");
    
    String elemento = miMapa.get("valor3");
    System.out.println(elemento);
    
    // llaves
    imprimir(miMapa.keySet());
    // y los valores del mapa??
    imprimir(miMapa.values());
    
    // Imprimir todo el mapa
    imprimirMapaString(miMapa);
   
  }
  
  public static void imprimir(Collection<String> coleccion ) {
    coleccion.forEach(elemento -> {
      System.out.println("el elemento es: " + elemento);
    });
   }
  
  public static void imprimirMapaString(Map<String, String> mapa) {
    mapa.entrySet().forEach(entry -> {
      System.out.println("llave: " + entry.getKey() + " y su valor es: " + entry.getValue());
      // entry.getKey();
      // entry.getValue();
    });
  }

}
