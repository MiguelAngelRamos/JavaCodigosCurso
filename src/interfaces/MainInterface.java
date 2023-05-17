package interfaces;

public class MainInterface {
  
  private IAlmacenamiento almacenamiento;
  
  public MainInterface(IAlmacenamiento almacenamiento) {
    this.almacenamiento = almacenamiento;
  }
  
  
  public void usarAlmacenamiento() {
    almacenamiento.guardarDatos("Mis datos");
    almacenamiento.cargarDatos();
  }
  
  public static void main(String[] args) {
    
    // IAlmacenamiento alma  =  new DiscoDuroLocal();
    MainInterface appConDiscoDuroLocal = new MainInterface(new DiscoDuroLocal());
    appConDiscoDuroLocal.usarAlmacenamiento();
    
    MainInterface appConAlmacenamientoEnLaNube = new MainInterface(new AlmacenamientoEnLaNube());
    appConAlmacenamientoEnLaNube.usarAlmacenamiento();
  }

}
