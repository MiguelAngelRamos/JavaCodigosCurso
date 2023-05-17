package interfaces;

public class DiscoDuroLocal implements IAlmacenamiento {

  @Override
  public void guardarDatos(String datos) {
    System.out.println("Guardando datos en el disco duro local: " + datos);
    
  }

  @Override
  public String cargarDatos() {
    String datos = "Datos desde el disco duro local";
    System.out.println("Cargando..." + datos);
    return datos;
  }

}
