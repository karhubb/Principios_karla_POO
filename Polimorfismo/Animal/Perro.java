

/**
 * Class Perro
 */
public class Perro extends Animal implements Sonido {
  //
  // Fields
  //

  
  //
  // Constructors
  //
  /**
   * @param        nombre
   */
public Perro(String nombre) {
    super(nombre);
  }


  /**
   */
public void mover() {
    System.out.println("El perro corre.");
  }


  /**
   */
public void hacerSonido() {
    System.out.println("Guau Guau");
  }
}
