public class Main {

  public static void main(String[] args) {

    CuentaBancaria cuenta1 = new CuentaBancaria(1000.0);

    cuenta1.depositar(500.0);

    cuenta1.retirar(1500.0);

    cuenta1.retirar(100.0);
  }
}
