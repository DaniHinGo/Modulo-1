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

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    //Metodo get para disponible no es necesario el set ya que el control es interno

    public boolean isDisponible() {
        return disponible;
    }

    //Metodo para prestar libros
    public void prestar() {
        if (disponible) {
            disponible = false;
        } else {
            System.out.println("El libro '" + titulo +"' no está disponible para prestar.");
        }
    }

    //Metodo para devolver libros
    public void devolver() {
        if (!disponible) {
            disponible = true;
        } else {
            System.out.println("El libro '" + titulo + "' Está disponible");
        }
    }
}


























