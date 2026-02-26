/**
 * Clase Todo: Automovil
 */
public class Automovil {
  private String modelo;
  // Composición: El Automovil "posee" el Motor.
  private final Motor motor;

  public Automovil(String modelo, String tipoMotor) {
    this.modelo = modelo;
    // El motor se instancia DENTRO del constructor.
    // Esto liga el ciclo de vida del motor al del auto.
    this.motor = new Motor(tipoMotor);
  }

  public void arrancar() {
    System.out.println("Arrancando el modelo: " + modelo);
    motor.encender();
  }
}