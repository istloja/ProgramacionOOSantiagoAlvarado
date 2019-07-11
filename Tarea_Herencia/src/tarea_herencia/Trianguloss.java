/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_herencia;

/**
 *
 * @author Usuario
 */
public class Trianguloss extends DosDimencioness{
    String estilo;
    double area(){
        return base*altura/2; //Error! no se puede acceder
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
