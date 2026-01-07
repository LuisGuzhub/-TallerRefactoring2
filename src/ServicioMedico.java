public class ServicioMedico {
    private static final double COSTO_MINIMO = 0.0;
    private static final int DURACION_MINIMA = 0;

    private String nombre;
    private String descripcion;
    private double costo;
    private int duracion;

    public ServicioMedico(String nombre, String descripcion, double costo, int duracion) {
        setNombre(nombre);
        setDescripcion(descripcion);
        setCosto(costo); // Self encapsulate field: validación centralizada
        setDuracion(duracion); // Self encapsulate field
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del servicio no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        if (costo < COSTO_MINIMO) {
            throw new IllegalArgumentException("El costo no puede ser menor a " + COSTO_MINIMO);
        }
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion < DURACION_MINIMA) {
            throw new IllegalArgumentException("La duración no puede ser menor a " + DURACION_MINIMA);
        }
        this.duracion = duracion;
    }
}
