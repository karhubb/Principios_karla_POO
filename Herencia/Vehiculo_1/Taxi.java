/**
 * Class Taxi
 */
public class Taxi extends Vehiculo {

  //
  // Fields
  //
  private String numeroLicencia;

  //
  // Constructors
  //
  public Taxi() { }

  public Taxi(String matricula, String modelo, int potenciaCV, String numeroLicencia) {
    super(matricula, modelo, potenciaCV);
    this.numeroLicencia = numeroLicencia;
  }

  //
  // Accessor methods
  //
  public String getNumeroLicencia() {
    return numeroLicencia;
  }

  public void setNumeroLicencia(String numeroLicencia) {
    this.numeroLicencia = numeroLicencia;
  }

  //
  // Other methods
  //
  @Override
  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Numero de licencia: " + numeroLicencia);
  }
}
