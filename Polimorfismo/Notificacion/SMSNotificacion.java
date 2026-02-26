

/**
 * Class SMSNotificacion
 */
public class SMSNotificacion extends Notificacion implements Envia {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  /**
   * @param        mensaje
   * @param        destinatario
   */
public SMSNotificacion(String mensaje, String destinatario) {
    super(mensaje, destinatario);
  }


  /**
   */
public void enviar() {
    System.out.println("Enviando SMS al número " + destinatario + " [Costo: $0.10]");
  }
}