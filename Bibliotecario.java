public class Bibliotecario extends Persona implements Gestionable {

    //Constructor
    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    //Sobrecarga del metodo prestar que recibe el usuario
    @Override
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (usuario.getLibrosPrestados() >= 3) {
            System.out.println("El usuario " + usuario.getNombre() + " ya tiene el máximo de 3 libros prestados.");
        } else if (libro.isDisponible()) {
            libro.prestar();
            usuario.incrementarLibrosPrestados(); // Aumenta el número de libros prestados
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + usuario.getNombre());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible");
        }
    }

    @Override
    public void devolverLibro(Libro libro, Usuario usuario) {
        if (!libro.isDisponible()){
            libro.devolver();
            usuario.disminuirLibrosPrestados(); //Disminuye el número de libros prestados
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto por " + usuario.getNombre());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está disponible");
        }
    }

    // Se implementa metodo mostrarDatos en Bibliotecario
    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + getNombre() + " " + getApellido());
    }
}
