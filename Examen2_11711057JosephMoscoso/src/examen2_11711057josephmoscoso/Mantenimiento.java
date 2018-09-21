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
public class Mantenimiento extends Usuarios implements Serializable {

    private ArrayList<ATM> asignados = new ArrayList();

    public Mantenimiento() {
        super();
    }

    public Mantenimiento(int iduser, String nombre1, String nombre2, String apellido, String nacimiento, String añoAfiliacion, String contraseña) {
        super(iduser, nombre1, nombre2, apellido, nacimiento, añoAfiliacion, contraseña);
    }

    public ArrayList<ATM> getAsignados() {
        return asignados;
    }

    public void setAsignados(ArrayList<ATM> asignados) {
        this.asignados = asignados;
    }

}
