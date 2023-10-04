package Principal;

public class Prestador {
    private int idPrestador;
    private String nombre;
    private String apellido;
    private int DNI;
    private boolean estado;
    private Especialidad especialidad;

    public Prestador(String nombre, String apellido, int DNI, boolean estado, Especialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estado = estado;
        this.especialidad = especialidad;
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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
