/**
 * Class EjecutaObjetos
 */
public class EjecutaObjetos {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public EjecutaObjetos () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   */
  public static void main(String[] args)
  {
    System.out.println("Avión");
    Avion miAvion = new Avion("Aeromexico", "2", "800 km/h", "200");
    System.out.println("aerolínea: " + miAvion.getAerolinea());
    System.out.println("motores: " + miAvion.getCantidad_de_motores());
    System.out.println("velocidad: " + miAvion.getVelocidad());
    System.out.println("capacidad: " + miAvion.getCapacidad());
    miAvion.acelerar();
    miAvion.elevarse();
   }
}