/**
 * Class Docente
 */
public class Docente extends Persona {

  //
  // Fields
  //

  private int idtrabajador;
  private double salario;
  private String departamento;
  
  //
  // Constructors
  //
  public Docente () { };
  
  //
  // Accessor methods
  //

  public void setIdtrabajador (int newVar) {
    idtrabajador = newVar;
  }

  public int getIdtrabajador () {
    return idtrabajador;
  }

  public void setSalario (double newVar) {
    salario = newVar;
  }

  public double getSalario () {
    return salario;
  }

  public void setDepartamento (String newVar) {
    departamento = newVar;
  }

  public String getDepartamento () {
    return departamento;
  }

  //
  // Other methods
  //

  @Override
  public void mostrarOcupacion()
  {
    System.out.println("Ocupacion: Docente");
  }


   public void DatosDocente(int idtrabajador, double salario, String departamento)
  {
    this.idtrabajador = idtrabajador;
    this.salario = salario;
    this.departamento = departamento;

    mostrarOcupacion();

    System.out.println("ID Trabajador: " + this.idtrabajador);
    System.out.println("Salario: " + this.salario);
    System.out.println("Departamento: " + this.departamento);
  }


}
