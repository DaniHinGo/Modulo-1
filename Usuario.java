public class Usuario extends Persona {
    private int librosPrestados; //Contador de libros prestados

    //Constructor
    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        this.librosPrestados = 0; //Para indicar que el usuario aún no presta libros
    }

    //Metodo para obtener el número de libros prestados
    public int getLibrosPrestados() {
        return librosPrestados;
    }

    //Metodo para incrementar los libros prestados
    public void incrementarLibrosPrestados() {
        librosPrestados++;
    }

    //Metodo para disminuir el número de libros prestados
    public  void disminuirLibrosPrestados() {
        if (librosPrestados > 0) {
            librosPrestados--;
        }
    }

    // Se implementa metodo mostrarDatos en Usuario
    @Override
    public void mostrarDatos() {
        System.out.println("Usuario: " +getNombre() + " " + getApellido() + ", Libros prestados: " + librosPrestados);
    }
}