package interfaces;

public class MainInterface {
  
  private IAlmacenamiento almacenamiento;
  
  public MainInterface(IAlmacenamiento almacenamiento) {
    this.almacenamiento = almacenamiento;
  }
  
  // metodo el que cumple con el polimorfismo
  public void usarAlmacenamiento() {
    almacenamiento.guardarDatos("Mis datos");
    almacenamiento.cargarDatos();
  }
  
  public static void main(String[] args) {
    
    // IAlmacenamiento myInstancia =  new DiscoDuroLocal();
    // IAlmacenamiento myInstancia = new DiscoDuroLocal();
    // myInstancia = new AlmacenamientoEnLaNube();
   
    
    MainInterface appConDiscoDuroLocal = new MainInterface(new DiscoDuroLocal());
    appConDiscoDuroLocal.usarAlmacenamiento();
    
    MainInterface appConAlmacenamientoEnLaNube = new MainInterface(new AlmacenamientoEnLaNube());
    appConAlmacenamientoEnLaNube.usarAlmacenamiento();
  }

}
