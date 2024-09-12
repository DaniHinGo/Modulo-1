public class Main {
    public static void main(String[] args) {
        //Crear instancias de Usuario y Bibliotecarop
        Usuario usuario1 = new Usuario("Lucca", "Hincapié");
        Bibliotecario bibliotecario1 = new Bibliotecario("Yessika", "Uribe");

        //Mostrar datos
        usuario1.mostrarDatos();
        bibliotecario1.mostrarDatos();

        //Crear un libro
        Libro libro1 = new Libro("Cien años de soledad", "Grabriel García Márquez", "456765");

        //Mostrar estado del libro
        System.out.println("Disponibilidad inicial: " + libro1.isDisponible());

        //Prestar el libro
        libro1.prestar();

        //Intentar prestarlo nuevamente
        libro1.prestar();

        //Devolver el libro
        libro1.devolver();

        //Intentar devolverlo nuevamente
        libro1.devolver();
    }
}
