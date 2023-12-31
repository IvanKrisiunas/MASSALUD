/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Monica
 */
public class Afiliado {
    private int idAfiliado;
    private String nombre;
    private String apellido;
    private int DNI;
    private boolean estado;
    private String domicilio;
    private int telefono;

    public Afiliado(String nombre, String apellido, int DNI, boolean estado, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estado = estado;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    public Afiliado() {
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
    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
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
    
    @Override
    public String toString() {
        if (nombre == null) {
            return "";
        } else {
            return nombre + " " + apellido + ", " + DNI + '.' + "\n";
        }
    }
    
}
