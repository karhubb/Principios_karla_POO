/**
 * Class Automovil
 */
public class Automovil extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  private int numPuertas;
  
  //
  // Constructors
  //
public Automovil (String marca, int precio, int numllantas, int numAsientos, int numPuertas) {
    super(marca, precio, numllantas);
    this.numAsientos = numAsientos;
    this.numPuertas = numPuertas;
  }

  //
  // Methods
  //
public void mostrarDatos() {
    System.out.println("\n// Automovil");
    mostrarCaracteristicas();
    System.out.println("Pasajeros: " + numAsientos);
    System.out.println("Numero de puertas: " + numPuertas);
  }


  /**
   */
public void pruebaDelMotor() {
    System.out.println("Probando motor del automovil...");
    encenderMotor();
  }
}

