/**
 * Class Avion
 */
public class Avion {

  //
  // Fields
  //

  public String aerolinea;
  public String capacidad;
  protected String velocidad;
  private String cantidad_de_motores;
  
  //
  // Constructors
  //
  public Avion () { };
  
  public Avion(String aerolinea1, String cantidaddemotores1, String velocidad1, String capacidad1)
  {
    this.aerolinea = aerolinea1;
    this.cantidad_de_motores = cantidaddemotores1;
    this.velocidad = velocidad1;
    this.capacidad = capacidad1;
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of aerolinea
   * @param newVar the new value of aerolinea
   */
  public void setAerolinea (String newVar) {
    aerolinea = newVar;
  }

  /**
   * Get the value of aerolinea
   * @return the value of aerolinea
   */
  public String getAerolinea () {
    return aerolinea;
  }

  /**
   * Set the value of capacidad
   * @param newVar the new value of capacidad
   */
  public void setCapacidad (String newVar) {
    capacidad = newVar;
  }

  /**
   * Get the value of capacidad
   * @return the value of capacidad
   */
  public String getCapacidad () {
    return capacidad;
  }

  /**
   * Set the value of velocidad
   * @param newVar the new value of velocidad
   */
  public void setVelocidad (String newVar) {
    velocidad = newVar;
  }

  /**
   * Get the value of velocidad
   * @return the value of velocidad
   */
  public String getVelocidad () {
    return velocidad;
  }

  /**
   * Set the value of cantidad_de_motores
   * @param newVar the new value of cantidad_de_motores
   */
  public void setCantidad_de_motores (String newVar) {
    cantidad_de_motores = newVar;
  }

  /**
   * Get the value of cantidad_de_motores
   * @return the value of cantidad_de_motores
   */
  public String getCantidad_de_motores () {
    return cantidad_de_motores;
  }

  //
  // Other methods
  //

  /**
   */
  public void acelerar()
  {
    System.out.println("Acelerando");
  }


  /**
   */
  public void elevarse()
  {
    System.out.println("Elevándose");
  }


  /**
   * @param        modelo1
   */
  public void setModelo(String modelo1)
  {
  }


  /**
   * @return       String
   */
  public String getModelo()
  {
    return "";
  }
}