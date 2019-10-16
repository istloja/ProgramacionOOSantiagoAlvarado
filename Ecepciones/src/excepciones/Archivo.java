
package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;


public class Archivo {
    public static void main(String[] args) {
       File archivo=new File("C:\\Users\\Usuario\\Desktop\\prueba.txt");
//        archivo.exists();
//        System.out.println(archivo.exists());// para saber si el archivo existe
//        System.out.println(archivo.isDirectory());//para saber si una carpeta existe o no
//        System.out.println(archivo.lastModified());//para saber la ultima fecha de modificacion
//        System.out.println(archivo.getName());// para obtener el nombre del archivo
//        //System.out.println(archivo.delete());//para borrar el archivo PELIGRO
//        File carpeta=new File("C:\\Users\\Usuario\\Desktop");
//        String [] archivos=carpeta.list();
//        for (int i = 0; i < archivos.length; i++) {
//            System.out.println(archivos[i]);
//        }
        try{
        FileReader lector=new FileReader(archivo);//pasar el archivo a un objeto visible
        BufferedReader re= new BufferedReader(lector);//recorrer el archivo
        String linea="";
        while((linea=re.readLine())!= null){//leer linea por linea el archivo
            System.out.println(linea);
        }
        re.close();//para cerrra el archivo
        }catch(Exception e){
            System.out.println("ocurrio un error"+e);
        }
    }
}
