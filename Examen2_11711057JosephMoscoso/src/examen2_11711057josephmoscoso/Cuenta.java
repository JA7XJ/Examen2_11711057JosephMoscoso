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
public class Cuenta implements Serializable {

    private int numeroCuenta;
    private double Saldo;
    private int idPropietario;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double Saldo, int idPropietario) {
        this.numeroCuenta = numeroCuenta;
        this.Saldo = Saldo;
        this.idPropietario = idPropietario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", Saldo=" + Saldo + ", idPropietario=" + idPropietario + '}';
    }

}
