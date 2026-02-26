/**
 * Clase Principal
 */
public class Main {
  public static void main(String[] args) {
    // Al crear el auto, internamente se crea su motor.
    Automovil miAuto = new Automovil("Sedan 2024", "V8");
    
    // Llamamos al método que inicia la cadena de acciones
    miAuto.arrancar();
    
    /* Si hiciéramos miAuto = null, el objeto Motor también 
       quedaría libre para el Garbage Collector.
    */
  }
}