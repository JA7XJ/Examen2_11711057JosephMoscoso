/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11711057josephmoscoso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class administrarLog {

    private ArrayList<Log> l = new ArrayList();
    private File archivo = null;

    public administrarLog(String path) {
        archivo = new File(path);
    }

    public ArrayList<Log> getL() {
        return l;
    }

    public void setL(ArrayList<Log> l) {
        this.l = l;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Log t : l) {
                bw.write(t.getU() + ";");
                bw.write(t.getDescripcion() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getHora() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        l = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String u;
                    String n, c, s;
                    u = sc.next();
                    c = sc.next();
                    n = sc.next();
                    s = sc.next();
                    l.add(new Log(u, c, n, s));
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
}
