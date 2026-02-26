

/**
 * Class Gato
 */
public class Gato extends Animal implements Sonido {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  /**
   * @param        nombre
   */
public Gato(String nombre) {
    super(nombre);
  }

  /**
   */
public void mover() {
    System.out.println("El gato salta.");
  }


  /**
   */
public void hacerSonido() {
    System.out.println("Miau");
}
}
