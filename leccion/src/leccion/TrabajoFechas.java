
package leccion;

import java.util.Date;


public class TrabajoFechas {
    public static void main(String[] args) {
      Date fecha=new Date(118,9,16); 
        System.out.println(fecha);
        Date fechas=new Date();
        System.out.println(fechas);
        System.out.println("Año: "+(fechas.getYear()+1900));
        System.out.println("mes: "+fechas.getMonth());
        System.out.println("dia: "+fechas.getDay());
        Date fechass=new Date(101,6,18);
        Date fechaActual=new Date();
        System.out.println(fechass.after(fechaActual));
        System.out.println(fechass.before(fechaActual));
    }
    
    
}
