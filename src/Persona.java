public class Persona {
    private String nombre;
    private int edad;
    private Genero genero;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    public Persona(String nombre, int edad, Genero genero, String direccion, String telefono, String correoElectronico) {
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        setDireccion(direccion);
        setTelefono(telefono);
        setCorreoElectronico(correoElectronico);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public Genero getGenero() { return genero; }
    public void setGenero(Genero genero) {
        if (genero == null) {
            throw new IllegalArgumentException("El género no puede ser null");
        }
        this.genero = genero;
    }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
}