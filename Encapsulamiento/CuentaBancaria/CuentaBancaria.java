/**
 * Class CuentaBancaria
 */
public class CuentaBancaria {

  //
  // Fields
  //
  private double saldo;

  //
  // Constructors
  //
  public CuentaBancaria() { }

  public CuentaBancaria(double saldoInicial) {
    this.saldo = saldoInicial;
    System.out.println("Saldo inicial = " + saldo);
  }

  //
  // Accessor methods
  //
  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double newVar) {
    saldo = newVar;
  }

  //
  // Other methods
  //

  public void depositar(double cantidad) {
    System.out.println("deposito = " + cantidad);
    saldo += cantidad;
  }

  public void retirar(double cantidad) {
    System.out.println("retirando " + cantidad);

    if (cantidad <= saldo) {
      saldo -= cantidad;
      System.out.println("retiro = " + cantidad);
      System.out.println("Saldo actual: " + saldo);
    } else {
      System.out.println("Fondo insuficiente ...");
    }
  }

}
