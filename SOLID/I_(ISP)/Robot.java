// Clase Robot: solo implementa lo que realmente hace
class Robot implements Trabajable {
    @Override
    public void trabajar() {
        System.out.println("Trabajando automáticamente...");
    }
}