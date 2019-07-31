/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichero;

/**
 *
 * @author Usuario
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Fichero {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\Usuario\\Desktop\\bimestre 1.txt");
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader re = new BufferedReader(lector);
            String linea = "";
            int valor = lector.read();
            while (valor != -1) { //leer por linea el archivo
                if (valor != 32) {
                    System.out.print((char) valor);
                }
                valor = lector.read();
            }
            re.close();//para cerrar el archivo
        } catch (Exception e) {
            System.out.println("ocurrio el error" + e);
        }
    }
}
