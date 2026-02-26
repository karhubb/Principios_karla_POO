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
    System.out.println("Televisión");
    Television miTelevision = new Television("rectangular", "55 pulgadas", "4K", "Samsung");
    System.out.println("forma: " + miTelevision.getForma());
    System.out.println("tamaño: " + miTelevision.getTamaño());
    System.out.println("calidad de video: " + miTelevision.getCalidad_de_video());
    System.out.println("marca: " + miTelevision.getMarca());
    miTelevision.apagada();
    miTelevision.prendida();
  }
}