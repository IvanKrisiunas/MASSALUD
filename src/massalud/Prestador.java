/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud;

/**
 *
 * @author Monica
 */
public class Prestador {
    private int idPrestador;
    private String nombre;
    private String apellido;
    private int DNI;
    private boolean activo;
    private Especialidad especialidad;

    public Prestador(int idPrestador, String nombre, String apellido, int DNI, boolean activo, Especialidad especialidad) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.activo = activo;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
