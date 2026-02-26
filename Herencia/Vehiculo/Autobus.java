

  /**
   * Class Autobus
   */
  public class Autobus extends Vehiculo {

    //
    // Fields
    //

    private int numAsientos;
    private int numPuertas;
    private int ejes;
    
    //
    // Constructors
    //
public Autobus (String marca, int precio, int numllantas, int numAsientos, int numPuertas, int ejes) {
    super(marca, precio, numllantas);
    this.numAsientos = numAsientos;
    this.numPuertas = numPuertas;
    this.ejes = ejes;
  }
    
    //
    // Methods
    //
public void mostrarDatos() {
    System.out.println("\n// Autobus");
    mostrarCaracteristicas();
    System.out.println("Numero de asientos: " + numAsientos);
    System.out.println("Numero de puertas: " + numPuertas);
  }


    /**
     */
 public void pruebaDelMotor() {
    System.out.println("Realizando prueba de motor del autobus...");
    encenderMotor();
  }
}
