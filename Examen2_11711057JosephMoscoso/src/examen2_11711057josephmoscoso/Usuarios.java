/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11711057josephmoscoso;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class Usuarios implements Serializable{

    private int iduser;
    private String nombre1;
    private String nombre2;
    private String apellido;
    private String nacimiento;
    private String añoAfiliacion;
    private ArrayList transacciones = new ArrayList();
    private String contraseña;

    public Usuarios() {
    }

    public Usuarios(int iduser, String nombre1, String nombre2, String apellido, String nacimiento, String añoAfiliacion, String contraseña) {
        this.iduser = iduser;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.añoAfiliacion = añoAfiliacion;
        this.contraseña = contraseña;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getAñoAfiliacion() {
        return añoAfiliacion;
    }

    public void setAñoAfiliacion(String añoAfiliacion) {
        this.añoAfiliacion = añoAfiliacion;
    }

    public ArrayList getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList transacciones) {
        this.transacciones = transacciones;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "iduser=" + iduser + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", a\u00f1oAfiliacion=" + añoAfiliacion + ", transacciones=" + transacciones + ", contrase\u00f1a=" + contraseña + '}';
    }

}
