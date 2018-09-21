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
public class Log implements Serializable {

    private String u;
    private String descripcion;
    private String fecha;
    private String hora;

    public Log() {
    }

    public Log(String u, String descripcion, String fecha, String hora) {
        this.u = u;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
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
        return "" + "" + u + ";" + descripcion + ";" + fecha + ";" + hora;
    }

}
