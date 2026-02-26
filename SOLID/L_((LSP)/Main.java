public class Main{
    public static void main(String[] args) {
        // Ambas clases cumplen su contrato y pueden usarse indistintamente como 'Figura'
        Figura f1 = new Rectangulo(5, 10);
        Figura f2 = new Cuadrado(5);

        System.out.println("Área Rectángulo: " + f1.getArea()); // Salida: 50
        System.out.println("Área Cuadrado: " + f2.getArea());   // Salida: 25
    }
}