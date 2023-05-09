package poo;

public class MainPersona {

  public static void main(String[] args) {
    
    Persona persona = new Persona();
    
    // asignar un valor
    persona.setNombre("Sofia");
    System.out.println(persona.getNombre());
    
    persona.setApellido("Rodriguez");
    System.out.println(persona.getApellido());
 
  }

}
