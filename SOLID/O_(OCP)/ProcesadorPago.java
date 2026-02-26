class ProcesadorPago {
    public void procesar(MetodoPago metodoPago) {
        // No le importa qué tipo de pago es, solo que sabe "procesarPago()"
        metodoPago.procesarPago();
    }
}