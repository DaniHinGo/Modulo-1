public class Bibliotecario extends Persona {
    //Constructor
    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    // Se implementa metodo mostrarDatos en Bibliotecario
    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + getNombre() + " " + getApellido());
    }
}
