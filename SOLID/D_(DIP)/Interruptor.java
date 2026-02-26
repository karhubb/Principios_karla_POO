// Clase de alto nivel que usa Inyección por Constructor
class Interruptor {
    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void presionar() {
        dispositivo.encender();
    }
}