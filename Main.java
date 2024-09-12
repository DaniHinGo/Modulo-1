public class Main {
    public static void main(String[] args) {
        //Crear instancias de Usuario y Bibliotecarop
        Usuario usuario1 = new Usuario("Lucca", "Hincapié");
        Bibliotecario bibliotecario1 = new Bibliotecario("Yessika", "Uribe");

        //Mostrar datos
        usuario1.mostrarDatos();
        bibliotecario1.mostrarDatos();
    }
}
