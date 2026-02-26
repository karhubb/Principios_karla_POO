

/**
 * Class Notificacion
 */
abstract public class Notificacion {


  //
  // Fields
  //

  protected String mensaje;
  protected String destinatario;
  
  //
  // Constructors
  //
  /**
   * @param        mensaje
   * @param        destinatario
   */
public Notificacion(String mensaje, String destinatario) {
    this.mensaje = mensaje;
    this.destinatario = destinatario;
  }


  /**
   */
public void registrarLog() {
    System.out.println("Log: Notificación creada para " + destinatario);
  }
}