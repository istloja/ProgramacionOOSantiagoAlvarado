package excepciones;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("ingresar un numero");
        int num1 = 0;
        try {
            num1 = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Se ha generado una excepcion" + e);
        }
//        finally{
//            System.out.println("ingrese el numero correcto");
//            num1 = entrada1.nextInt();
//        }
        System.out.println("el numero ingresado es: " + num1);
        int resultado = 0;
        try {
            resultado = num1 / 0;
        } catch (Exception e) {
            System.out.println("No se puede dividir para 0");
        }
        System.out.println("el resultado es:" + resultado);
    }

}
