
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
  // Other methodsñ
  //

  /**
   */
    public static void main(String[] args)
  {
    System.out.println("Pelota");
    Pelota miPelota = new Pelota("redonda", "blanco", "cuero", "futbol");
    System.out.println("forma: " + miPelota.getForma());
    System.out.println("color: " + miPelota.getColor());
    System.out.println("material: " + miPelota.getMaterial());
    System.out.println("tipo: " + miPelota.getTipo());
    miPelota.botar();
    miPelota.desinflar();
  }
}
