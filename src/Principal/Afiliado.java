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
    private boolean activo;
    private String domicilio;
    private int telefono;

  

    public Afiliado(String nombre, String apellido, int DNI, boolean activo, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.activo = activo;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Afiliado{" + "\n" + "idAfiliado=" + idAfiliado + "\n" +  ", nombre=" + nombre + "\n" + ", apellido=" + apellido + "\n" + 
                ", DNI=" + DNI + "\n" + ", activo=" + activo + "\n" + ", domicilio=" + domicilio + "\n" + ", telefono=" + telefono + '}' +"\n" + "-------------------";
    }
    
    
}
