package interfaces;

public class AlmacenamientoEnLaNube implements IAlmacenamiento {

  @Override
  public void guardarDatos(String datos) {
    System.out.println("Guardando datos en la nube: " + datos);  
  }

  @Override
  public String cargarDatos() {
    String datos = "Datos desde la nube";
    System.out.println("Cargando..." + datos);
    return datos;
  }

}
