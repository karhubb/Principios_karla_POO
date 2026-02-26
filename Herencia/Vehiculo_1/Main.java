/**
 * Clase principal de prueba
 */
public class Main {

  public static void main(String[] args) {

    Taxi taxi1 = new Taxi("ABC123", "Nissan", 120, "LIC-7788");
    Autobus bus1 = new Autobus("XYZ999", "Volvo", 300, 45);

    System.out.println(" TAXI");
    taxi1.mostrarDatos();

    System.out.println(" AUTOBUS");
    bus1.mostrarDatos();
  }
}
