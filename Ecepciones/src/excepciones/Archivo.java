
package excepciones;

import java.io.File;


public class Archivo {
    public static void main(String[] args) {
        File archivo=new File("C:\\Users\\Usuario\\Desktop\\ejemplo.txt");
        archivo.exists();
        System.out.println(archivo.exists());// para saber si el archivo existe
        System.out.println(archivo.isDirectory());//para saber si una carpeta existe o no
        System.out.println(archivo.lastModified());//para saber la ultima fecha de modificacion
        System.out.println(archivo.getName());// para obtener el nombre del archivo
        //System.out.println(archivo.delete());//para borrar el archivo PELIGRO
        File carpeta=new File("C:\\Users\\Usuario\\Desktop");
        String [] archivos=carpeta.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }
}
