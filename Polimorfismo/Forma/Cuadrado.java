/**
 * Class Cuadrado
 */
public class Cuadrado {

  //
  // Fields
  //

  private double lado;
  
  //
  // Constructors
  //
  public Cuadrado () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of lado
   * @param newVar the new value of lado
   */
  public void setLado (double newVar) {
    lado = newVar;
  }

  /**
   * Get the value of lado
   * @return the value of lado
   */
  public double getLado () {
    return lado;
  }

  //
  // Other methods
  //

  /**
   */
public void dibujar()
  {
    System.out.println("dibujar cuadrado"); // Mensaje de la imagen
  }
}

