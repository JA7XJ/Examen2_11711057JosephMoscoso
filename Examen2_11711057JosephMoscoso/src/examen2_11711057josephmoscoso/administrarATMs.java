/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11711057josephmoscoso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class administrarATMs {

    private File archivo = null;
    private ArrayList<ATM> atm = new ArrayList();
    
    public administrarATMs(String path) {
        archivo = new File(path);
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public ArrayList<ATM> getAtm() {
        return atm;
    }
    
    public void setAtms(ArrayList<ATM> atm) {
        this.atm = atm;
    }

    public void setAtm(ATM a) {
        this.atm.add(a);
    }
    public void cargarArchivo() {
        try {
            atm = new ArrayList();
            ATM temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ATM) objeto.readObject()) != null) {
                        atm.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (ATM t : atm) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
}
