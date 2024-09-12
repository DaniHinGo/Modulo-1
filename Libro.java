public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    //Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Esto hace que el libro este disponible una vez se crea en el sistema
    }

    //Metodos get y set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //Metodo get para disponible no es necesario el set ya que el control es interno

    public boolean isDisponible() {
        return disponible;
    }

    //Metodo para prestar libros
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo +"' no está disponible para prestar.");
        }
    }

    //Metodo para devolver libros
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' Está disponible");
        }
    }
}


























