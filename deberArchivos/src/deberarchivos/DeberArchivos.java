package deberarchivos;

import java.io.File;
import java.util.Scanner;

public class DeberArchivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num=0;
        try{
        num = entrada.nextInt();
        }catch (Exception e){
            System.out.println(" has dijitado una letra, porfavor ingresa un numero "+e);
        }
        if(num>0&&num<=5){
        switch (num) {
            case 1:
                File carpeta = new File("C:\\Users\\Usuario\\Desktop");
                String[] archivos = carpeta.list();
                for (int i = 0; i < archivos.length; i++) {
                    System.out.println(archivos[i]);
                }
                break;
            case 2:
                File documentos = new File("C:\\Users\\Usuario\\Documents");
                String[] archivo = documentos.list();
                for (int i = 0; i < documentos.length(); i++) {
                    System.out.println(archivo[i]);
                }
                break;
            case 3:
                File imagenes = new File("C:\\Users\\Usuario\\Pictures");
                String[] archivo1 = imagenes.list();
                for (int i = 0; i < archivo1.length; i++) {
                    System.out.println(archivo1[i]);
                }
                break;
            case 4:
                File videos = new File("C:\\Users\\Usuario\\Videos");
                String[] archivo2 = videos.list();
                for (int i = 0; i < archivo2.length; i++) {
                    System.out.println(archivo2[i]);
                }
                break;
            case 5:
                File musica = new File("C:\\Users\\Usuario\\Music");
                String[] archivo3 = musica.list();
                for (int i = 0; i < archivo3.length; i++) {
                    System.out.println(archivo3[i]);
                }
                break;
        }
        }else{
            System.out.println("caracter incorrecto, porfavor digita un numero del 1 al 5 ");
        }
    }

}
