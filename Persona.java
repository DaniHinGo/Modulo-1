public abstract class Persona {
    //Atributos clase abstracta persona
    private String nombre;
    private String apellido;

    //Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters para poder acceder a los atributos

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Metodo abstracto que va hacer implementado por los hijos
    public abstract void mostrarDatos();
}

