package interfaces;

public class ImplMain {

  public static void main(String[] args) {
    
    DiscoDuroLocal discoLocal = new DiscoDuroLocal();
    AlmacenamientoEnLaNube nube1 = new AlmacenamientoEnLaNube();
    
    discoLocal.guardarDatos("Documentos Varios");
    discoLocal.cargarDatos();
    
    nube1.guardarDatos("Datos Importantes");
    nube1.cargarDatos();

  }

}
