
package deberarchivos2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DeberArchivos2 {

   
    public static void main(String[] args) {
        File archivo= new File("C:\\Users\\Usuario\\Desktop\\10 metas.txt");
        try{
        FileReader lector=new FileReader(archivo);
        BufferedReader recorrer=new BufferedReader(lector);
        String saltline="";
        while((saltline=recorrer.readLine())!=null){
            System.out.println(saltline);
        }recorrer.close(); 
        }catch(Exception e){
            System.out.println("Archivo no encontrado "+e);
        }
    }
    
}
