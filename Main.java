public class Main {
    public static void main(String[] args) {
        //Crear instancias de Usuario y Bibliotecario
        Usuario usuario1 = new Usuario("Lucca", "Hincapié");
        Usuario usuario2 = new Usuario("Amparo", "González");
        Bibliotecario bibliotecario1 = new Bibliotecario("Yessika", "Uribe");

        //Crear un libro
        Libro libro1 = new Libro("Cien años de soledad", "Grabriel García Márquez", "456765");
        Libro libro2 = new Libro("La gárgola", "Andrew Davidson", "456732");
        Libro libro3 = new Libro("La biblia de los caídos", "Fernando Trujillo Sanz", "890756");
        Libro libro4 = new Libro("El juego de Ender", "Orson Scott Card", "678432");
        Libro libro5 = new Libro("El psicoanalista", "John Katzenbach", "234987566");


        //Mostrar estado del libro
        System.out.println("Disponibilidad inicial: " + libro1.isDisponible());

        //Prestar el libro
        bibliotecario1.prestarLibro(libro1, usuario1);
        bibliotecario1.prestarLibro(libro2, usuario1);
        bibliotecario1.prestarLibro(libro4, usuario1);
        bibliotecario1.prestarLibro(libro5, usuario1);

        //Prestar libro para el desarrollo del punto 2
        libro3.prestar();

        //Intentar prestarlo nuevamente desarrollo punto 2
        libro3.prestar();

        //Devolver el libro desarrollo punto 2
        libro3.devolver();

        //Intentar devolverlo nuevamente desarrollo punto 2
        libro3.devolver();

        // Devolver punto (Desarrollo punto 4)
        bibliotecario1.devolverLibro(libro1, usuario1);

        //Mostrar datos
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        bibliotecario1.mostrarDatos();
    }
}