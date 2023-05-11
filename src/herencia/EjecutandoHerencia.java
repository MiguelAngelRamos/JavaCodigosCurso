package herencia;

public class EjecutandoHerencia {

  public static void main(String[] args) {
  
    // Animal animal = new Animal();
    
    // Gato
    Gato gato = new Gato();
 
    gato.caminar();
    gato.comer();
    gato.respirar();
    // Otros animales....
    
    Perro perro = new Perro();
    perro.caminar();
    perro.comer();
    perro.respirar();
    
  }

}
