/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fraccion;

import java.util.Scanner;

public class Fraccion {

    public int num;
    public int den;

    public Fraccion() {
    }

    public void mostrarFraccion() {
        System.out.println("La fraccion es: " + num + "/" + den);
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Fraccion objeto1=new Fraccion();
        System.out.println("Ingrese el nuemrador");
        objeto1.setNum(entrada.nextInt());
        System.out.println("Ingrese el denomidador");
        objeto1.setDen(entrada.nextInt());
        objeto1.mostrarFraccion();
    }

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

}
