/**
 * Class Main
 */
public class Main {
  
  //
  // Constructors
  //
  public Main () { };

  /**
   * @param        args
   */
  public static void main(String[] args) 
  {
    Circulo myCirculo = new Circulo();
    myCirculo.dibujar();

    Cuadrado myCuadrado = new Cuadrado();
    myCuadrado.dibujar();
  }
}