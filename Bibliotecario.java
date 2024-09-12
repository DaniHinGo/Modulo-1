public class Bibliotecario extends Persona {
    //Constructor
    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    //Metodo para prestar un libro
    public void prestar(Libro libro) {
        if (libro.isDisponible()) {
            libro.prestar();
        } else {
            System.out.println("El libro '"+ libro.getTitulo() + "' no está disponible");
        }
    }

    //Sobrecarga del metodo prestar que recibe el usuario
    public void prestar(Libro libro, Usuario usuario) {
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

    // Se implementa metodo mostrarDatos en Bibliotecario
    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + getNombre() + " " + getApellido());
    }
}
