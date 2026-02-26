public class UsuarioRepository {
    public void guardar(Usuario usuario) {

        System.out.println("Guardando usuario " + usuario.getNombre() + " en la BD...");
    }
}