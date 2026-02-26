public class Main {
    public static void main(String[] args) {
        ProcesadorPago procesador = new ProcesadorPago();

        // Podemos usar cualquier implementación de MetodoPago
        MetodoPago pago1 = new PagoTarjeta();
        MetodoPago pago2 = new PagoPayPal();
        MetodoPago pago3 = new PagoCripto(); // Agregado sin cambiar el procesador

        procesador.procesar(pago1);
        procesador.procesar(pago2);
        procesador.procesar(pago3);
    }
}