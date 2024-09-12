public class Usuario extends Persona {
    //Constructor
    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    // Se implementa metodo mostrarDatos en Usuario
    @Override
    public void mostrarDatos() {
        System.out.println("Usuario: " +getNombre() + " " + getApellido());
    }
}
