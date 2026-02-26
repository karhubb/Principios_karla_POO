/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  protected String nombre;
  protected int edad;
  protected String sexo;
  
  //
  // Constructors
  //
  public Persona () { };
  
  //
  // Accessor methods
  //

  public void setNombre (String newVar) {
    nombre = newVar;
  }

  public String getNombre () {
    return nombre;
  }

  public void setEdad (int newVar) {
    edad = newVar;
  }

  public int getEdad () {
    return edad;
  }

  public void setSexo (String newVar) {
    sexo = newVar;
  }

  public String getSexo () {
    return sexo;
  }

  //
  // Other methods
  //

  public void MostrarDatos(String nombre, int edad, String sexo)
  {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;

    System.out.println("Nombre: " + this.nombre);
    System.out.println("Edad: " + this.edad);
    System.out.println("Sexo: " + this.sexo);
  }

  // Metodo que será sobrescrito por las clases hijas
  public void mostrarOcupacion()
  {
    System.out.println("Ocupacion: Persona");
  }
}