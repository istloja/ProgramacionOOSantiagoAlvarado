
package Fecha;

import java.util.Scanner;


public class Fecha {
   private int dia;
   private int mes;
   private int año;
   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Fecha objeto=new Fecha();
        System.out.println("ingrese una fecha");
        objeto.setDia(entrada.nextInt());
        objeto.setMes(entrada.nextInt());
        objeto.setAño(entrada.nextInt());
        objeto.presentar();
    }
    
    public void presentar(){
        System.out.println(dia+"/"+"/"+mes+"/"+año);
    }

    public Fecha() {
    }
   
   public boolean fechaCorrecta(int dia, int mes, int año){
       if(dia<=30&&mes<=12&&año<=2019){
           return true;
       }else{
           return false;
       }
   }
   private boolean esBiciesto(int diasaño,int inaño){
       diasaño=365;
       if ( inaño>diasaño){
       return true;
   }else{
           return false;
       }
   }
   public int diaSieguiente(int dia, int mes, int año){
       int dia1=dia;
       dia=dia+1;      
       if(dia>30){
           dia=1;
           mes=mes+1; 
           return mes;
       }if(mes>12){
               mes=1;
               año=año+1;
               return año;
           }
       return dia1;
   }
   public String fecha1Correcta(int dia, int mes, int año){
       if(dia>30||mes>12||año>2019){
           
       }return "la fecha ingresada es incorrecta";
   }
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
   
}
