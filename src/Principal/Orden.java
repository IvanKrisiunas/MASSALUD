package Principal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Orden {

    private int idOrden;
    private LocalDate fecha;
    private String formaDePago;
    private double importe;
    private int DNIAfiliado;
    private int DNIPrestador;

    public Orden(LocalDate fecha, String formaDePago, double importe, int DNIAfiliado, int DNIPrestador) {
        this.fecha = fecha;
        this.formaDePago = formaDePago;
        this.importe = importe;
        this.DNIAfiliado = DNIAfiliado;
        this.DNIPrestador = DNIPrestador;
    }
    public Orden(int idOrden, LocalDate fecha, String formaDePago, double importe, int DNIAfiliado, int DNIPrestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaDePago = formaDePago;
        this.importe = importe;
        this.DNIAfiliado = DNIAfiliado;
        this.DNIPrestador = DNIPrestador;
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

    public int getDNIafiliado() {
        return DNIAfiliado;
    }

    public void setDNIafiliado(int DNIAfiliado) {
        this.DNIAfiliado = DNIAfiliado;
    }

    public int getDNIprestador() {
        return DNIPrestador;
    }

    public void setDNIprestador(int DNIPrestador) {
        this.DNIPrestador = DNIPrestador;
    }

    public Date fechaLocal(LocalDate fecha) {
        LocalDate localDate = fecha;
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
        Instant instant = zonedDateTime.toInstant();
        Date date = Date.from(instant);
        return date;
    }

    public LocalDate fechaLocalDate(Date fecha) {
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Instant instant = fecha.toInstant();
        LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
        return localDate;
    }

    @Override
    public String toString() {
        return "Orden: fecha= " + fecha + ", formaDePago=" + formaDePago + ", importe=" + importe + ", DNIAfiliado=" + DNIAfiliado + ", DNIPrestador=" + DNIPrestador + '}' + "\n";
    }

}
