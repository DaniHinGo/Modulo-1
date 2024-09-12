public interface Gestionable {
    //Prestar un libro
    void prestarLibro(Libro libro, Usuario usuario);

    //Devolver un libro
    void devolverLibro(Libro libro, Usuario usuario);
}
