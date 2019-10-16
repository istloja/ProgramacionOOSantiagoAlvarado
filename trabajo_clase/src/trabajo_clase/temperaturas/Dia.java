/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_clase.temperaturas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Dia {
    
    private int numSemana;
    private String nomDia;
    private int numMes;
    private String nomMes;
    private int año;

    public Dia(int numSemana, String nomDia, int numMes, String nomMes, int año) {
        this.numSemana = numSemana;
        this.nomDia = nomDia;
        this.numMes = numMes;
        this.nomMes = nomMes;
        this.año = año;
    }

    public Dia() {
    }
    
    public static void main(String[] args) {
        Dia dia= new Dia(0, "", 0, "", 0);
        List <Object> lista=new ArrayList<Object>();
       
        lista.add(dia);
        lista.add(dia);
        lista.add(dia);
       System.out.println(" valores del dia"+dia.getClass()); 
       
    }
}
