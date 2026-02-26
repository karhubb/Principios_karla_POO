/**
 * Class Estudiante
 */
public class Estudiante extends Persona {

  //
  // Fields
  //

  private int matricula;
  private double promedio;
  private String licenciatura;
  
  //
  // Constructors
  //
  public Estudiante () { };
  
  //
  // Accessor methods
  //

  public void setMatricula (int newVar) {
    matricula = newVar;
  }

  public int getMatricula () {
    return matricula;
  }

  public void setPromedio (double newVar) {
    promedio = newVar;
  }

  public double getPromedio () {
    return promedio;
  }

  public void setLicenciatura (String newVar) {
    licenciatura = newVar;
  }

  public String getLicenciatura () {
    return licenciatura;
  }

  //
  // Other methods
  //


  @Override
  public void mostrarOcupacion()
  {
    System.out.println("Ocupacion: Estudiante");
  }

  public void DatosDeAlumno(int matricula, double promedio, String licenciatura)
  {
    this.matricula = matricula;
    this.promedio = promedio;
    this.licenciatura = licenciatura;

    mostrarOcupacion();

    System.out.println("Matricula: " + this.matricula);
    System.out.println("Promedio: " + this.promedio);
    System.out.println("Licenciatura: " + this.licenciatura);
  }


}
