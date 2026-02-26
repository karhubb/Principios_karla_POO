public class Main {

  public static void main(String[] args)
  {

    Docente d1 = new Docente();
    d1.MostrarDatos("Laura", 40, "F");
    d1.DatosDocente(1001, 15000, "Sistemas");

    System.out.println();

    Estudiante e1 = new Estudiante();
    e1.MostrarDatos("Carlos", 20, "M");
    e1.DatosDeAlumno(2023, 9.5, "Ingenieria");

  }

}
