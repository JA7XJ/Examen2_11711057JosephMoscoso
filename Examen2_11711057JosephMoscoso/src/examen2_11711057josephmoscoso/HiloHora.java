/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11711057josephmoscoso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Joseph
 */
public class HiloHora extends Thread {
    
    private boolean vive;
    private JLabel hora;
    
    public HiloHora(JLabel hora) {
        this.hora = hora;
        vive = true;
    }
    
    public boolean isVive() {
        return vive;
    }
    
    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    public JLabel getHora() {
        return hora;
    }
    
    public void setHora(JLabel hora) {
        this.hora = hora;
    }
    
    @Override
    public void run() {
        while (vive) {
            DateFormat f = new SimpleDateFormat("HH:mm:ss");
            Date d = new Date();
            hora.setText(f.format(d));
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
    
}
