

/**
 * Class SistemaAlertas
 */
public class SistemaAlertas {

  //
  // Fields
  //

  
  //
  // Constructors
  //
 /**
   * @param        args
   */
public static void main(String[] args) {
    EmailNotificacion email = new EmailNotificacion("Bienvenido!", "user@mail.com");
    email.enviar();
    email.registrarLog();

System.out.println("");

    SMSNotificacion sms = new SMSNotificacion("Tu código es 1234", "+525512345678");
    sms.enviar();
    sms.registrarLog();
  }
}
