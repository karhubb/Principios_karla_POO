public class Main {
    public static void main(String[] args) {

        Usuario nuevoUsuario = new Usuario("Juan Perez", "juan@example.com");

        UsuarioRepository repositorio = new UsuarioRepository();
        EmailService servicioEmail = new EmailService();

        repositorio.guardar(nuevoUsuario);
        servicioEmail.enviarBienvenida(nuevoUsuario);
    }
}