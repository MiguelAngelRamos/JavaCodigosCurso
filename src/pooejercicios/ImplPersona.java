package pooejercicios;

public class ImplPersona {

  public static void main(String[] args) {
    
    Persona persona = new Persona("Luis", 18);
    // persona.imprimirInformacion(); // imprime la info de Luis
    // persona.
    System.out.println(persona);
    
    Persona personaDos = new Persona("Natalia", 20 );
    System.out.println(personaDos);
    //personaDos.bailar(persona);
    //personaDos.imprimirInformacion(); // imprime la info de Natalia
    
    Persona personaTres = new Persona("Andrea", 22);
    System.out.println(personaTres);
    personaTres.bailar(personaDos);
  }

}
