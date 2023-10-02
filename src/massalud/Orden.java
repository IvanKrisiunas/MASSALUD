/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud;

import java.time.LocalDate;

/**
 *
 * @author Monica
 */
public class Orden {
    private int idOrden;
    private LocalDate fecha;
    private String formaDePago;
    private double importe;
    private Afiliado afiliado;
    private Prestador prestador;

    public Orden(int idOrden, LocalDate fecha, String formaDePago, double importe, Afiliado afiliado, Prestador prestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaDePago = formaDePago;
        this.importe = importe;
        this.afiliado = afiliado;
        this.prestador = prestador;
    }

    public Orden() {
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }
    
    
}
