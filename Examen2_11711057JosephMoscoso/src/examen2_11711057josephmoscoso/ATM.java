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
public class ATM implements Serializable{

    private String ubicacion;
    private int id;
    private String añoFabricacion;
    private int mantenimiento;
    private int den500;
    private int den100;

    public ATM(String ubicacion, int id, String añoFabricacion, int mantenimiento, int den500, int den100) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.añoFabricacion = añoFabricacion;
        this.mantenimiento = mantenimiento;
        this.den500 = den500;
        this.den100 = den100;
    }

    public ATM() {
    }

    public ATM(String ubicacion, int id, String añoFabricacion, int mantenimiento) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.añoFabricacion = añoFabricacion;
        this.mantenimiento = mantenimiento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public int getDen500() {
        return den500;
    }

    public void setDen500(int den500) {
        this.den500 = den500;
    }

    public int getDen100() {
        return den100;
    }

    public void setDen100(int den100) {
        this.den100 = den100;
    }

    @Override
    public String toString() {
        return ubicacion;
    }

}
