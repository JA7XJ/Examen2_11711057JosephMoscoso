/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11711057josephmoscoso;

import java.io.Serializable;

/**
 *
 * @author Joseph
 */
public class transacciones implements Serializable{
    private int numerocuenta;
    private String descripcion;
    private String fecha;
    private String hora;

    public transacciones() {
    }

    public transacciones(int numerocuenta, String descripcion, String fecha, String hora) {
        this.numerocuenta = numerocuenta;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "transacciones{" + "numerocuenta=" + numerocuenta + ", descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
}
