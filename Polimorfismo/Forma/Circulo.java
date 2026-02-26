/**
 * Class Circulo
 */
class Circulo extends Forma {

  //
  // Fields
  //

  private double radio;
  
  //
  // Constructors
  //
  public Circulo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of radio
   * @param newVar the new value of radio
   */
  public void setRadio (double newVar) {
    radio = newVar;
  }

  /**
   * Get the value of radio
   * @return the value of radio
   */
  public double getRadio () {
    return radio;
  }

  //
  // Other methods
  //

  /**
   */
public void dibujar()
  {
    System.out.println("dibujar circulo..."); // Mensaje de la imagen
  }
}
