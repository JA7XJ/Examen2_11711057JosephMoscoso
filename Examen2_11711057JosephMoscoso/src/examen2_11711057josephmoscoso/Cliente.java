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
public class Cliente extends Usuarios implements Serializable {

    private ArrayList<Cuenta> cuentas = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(int iduser, String nombre1, String nombre2, String apellido, String nacimiento, String añoAfiliacion, String contraseña) {
        super(iduser, nombre1, nombre2, apellido, nacimiento, añoAfiliacion, contraseña);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
