/**
 * Class Autobus
 */
public class Autobus extends Vehiculo {

  //
  // Fields
  //
  private int numeroPlazas;

  //
  // Constructors
  //
  public Autobus() { }

  public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
    super(matricula, modelo, potenciaCV);
    this.numeroPlazas = numeroPlazas;
  }

  //
  // Accessor methods
  //
  public int getNumeroPlazas() {
    return numeroPlazas;
  }

  public void setNumeroPlazas(int numeroPlazas) {
    this.numeroPlazas = numeroPlazas;
  }

  //
  // Other methods
  //
  @Override
  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Numero de plazas: " + numeroPlazas);
  }

}
