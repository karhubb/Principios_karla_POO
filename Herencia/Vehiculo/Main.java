/**
 * Class Main
 */
public class Main {
public static void main(String[] args) { // Firma estándar de Java
    // Automovil
    Automovil v1 = new Automovil("volvo 550", 120, 4, 5, 4);
    v1.mostrarDatos();
    v1.pruebaDelMotor();

// Moto
    Motocicleta m1 = new Motocicleta("Italika", 120, 2, 2);
    m1.mostrarDatos();
    m1.pruebaDelMotor();

// Autobús
    Autobus b1 = new Autobus("Mercedez", 300, 8, 42, 2, 2);
    b1.mostrarDatos();
    b1.pruebaDelMotor();

Autobus b2 = new Autobus("Mercedez smart", 250, 6, 25, 1, 1);
    b2.mostrarDatos();
    b2.pruebaDelMotor();
  }
}


