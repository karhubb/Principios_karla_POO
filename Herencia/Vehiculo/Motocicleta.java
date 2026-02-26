/**
 * Class Motocicleta
 */
public class Motocicleta extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  
  //
  // Constructors
  //
public Motocicleta (String marca, int precio, int numllantas, int numAsientos) {
    super(marca, precio, numllantas);
    this.numAsientos = numAsientos;
  }

  //
  // Methods
  //
public void mostrarDatos() {
    System.out.println("\n// Moto");
    mostrarCaracteristicas();
    System.out.println("Numero de asientos: " + numAsientos);
  }


  /**
   */
public void pruebaDelMotor() { // Cambiado a pruebaDelMotor para coincidir con Main
    System.out.println("Probando motor de la motocicleta...");
    encenderMotor();
  }
}



