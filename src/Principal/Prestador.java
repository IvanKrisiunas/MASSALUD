package Principal;

public class Prestador {
    private int idPrestador;
    private String nombre;
    private String apellido;
    private int DNI;
    private boolean estado;
    private int idEspecialidad;
    private int telefono;
    private String domicilio;

    public Prestador(String nombre, String apellido, int DNI, boolean estado, int idEspecialidad, int telefono, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estado = estado;
        this.idEspecialidad = idEspecialidad;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Prestador() {
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Override
    public String toString() {
        return "Prestador{" + "\n" + "idPrestador=" + idPrestador + "\n" + ", nombre=" + nombre + "\n" + ","
                + " apellido=" + apellido + "\n" + ", DNI=" + DNI + "\n" + ", estado=" + estado + "\n" + ", idEspecialidad=" + idEspecialidad + "\n" + ", telefono=" + telefono + "\n" + ", domicilio=" + domicilio + '}' + "\n" ;
    }
    
}
