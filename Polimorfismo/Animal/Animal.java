

/**
 * Class Animal
 */
abstract public class Animal {

  //
  // Fields
  //

  protected String nombre;
  
  //
  // Constructors
  //
  /**
   * @param        nombre
   */
public Animal(String nombre) {
    this.nombre = nombre;
  }
  


  /**
   * @return       String
   */
public String getNombre() {
    return nombre;
  }


  /**
   */
public abstract void mover();
}
