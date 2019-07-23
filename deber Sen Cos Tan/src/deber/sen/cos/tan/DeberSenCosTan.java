package deber.sen.cos.tan;

import java.util.Scanner;

public class DeberSenCosTan {

    public static double valor, grados;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige la funcion trigonometrica: ");
        System.out.println(" 1 para Seno \n 2 para Coseno \n 3 para Tangente");
        int opc = entrada.nextInt();
        switch (opc) {
            case 1:
                calcularSeno();
                break;
            case 2:
                calcularCoseno();
                break;
            case 3:
                calcularTan();
                break;
        }
    }

    public static void ingresaValor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        double grados = entrada.nextDouble();
        valor = Math.toRadians(grados);
    }

    private static void calcularSeno() {
        ingresaValor();
        double seno = Math.sin(valor);
        System.out.println("el seno es " + seno);
    }

    private static void calcularCoseno() {
        ingresaValor();
        double coseno = Math.cos(valor);
        System.out.println("el coseno es " + coseno);
    }
    private static void calcularTan(){
        ingresaValor();
        double tangente=Math.tan(valor);
        System.out.println("la tangente es "+tangente);
    }
}
