/**
 * Class Vehiculo
 */
public class Vehiculo {

  //
  // Fields
  //
  private String matricula;
  private String modelo;
  private int potenciaCV;

  //
  // Constructors
  //
  public Vehiculo() { }  

  public Vehiculo(String matricula, String modelo, int potenciaCV) {
    this.matricula = matricula;
    this.modelo = modelo;
    this.potenciaCV = potenciaCV;
  }

  //
  // Accessor methods
  //
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getPotenciaCV() {
    return potenciaCV;
  }

  public void setPotenciaCV(int potenciaCV) {
    this.potenciaCV = potenciaCV;
  }

  //
  // Other methods
  //

  /**
   * Método agregado para mostrar información
   */
  public void mostrarDatos() {
    System.out.println("Matricula: " + matricula);
    System.out.println("Modelo: " + modelo);
    System.out.println("Potencia: " + potenciaCV + " CV");
  }

}
