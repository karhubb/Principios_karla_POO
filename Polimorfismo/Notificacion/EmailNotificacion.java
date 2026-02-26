

/**
 * Class EmailNotificacion
 */
public class EmailNotificacion extends Notificacion implements Envia {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  /**
   * @param        _mensaje
   * @param        destinatario
   */
public EmailNotificacion(String _mensaje, String destinatario) {
    super(_mensaje, destinatario);
  }


  /**
   */
public void enviar() {
    System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
  }
}