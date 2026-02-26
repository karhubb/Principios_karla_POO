/**
 * Class Vehiculo
 */
public class Vehiculo {

  //
  // Fields
  //

  protected int precio;
  protected String marca;
  protected int numllantas;
  
  //
  // Constructors
  //

  public Vehiculo (String marca, int precio, int numllantas) {
    this.marca = marca;
    this.precio = precio;
    this.numllantas = numllantas;
  }

  //
  // Methods
  //
public void mostrarCaracteristicas() {
    System.out.println("Marca: " + marca);
    System.out.println("Precio: $" + precio);
    System.out.println("Numero de llantas: " + numllantas);
  }

public void encenderMotor() {
    System.out.println("El vehiculo ha encendido.");
  }
}

