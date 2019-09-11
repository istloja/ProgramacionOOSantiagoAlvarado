package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FRANCO
 */
public class Serealizable {

    public void escribirarchivo(String rutaArchivo, Equipo equipo) throws IOException {
        Serealizable obj = new Serealizable();

        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            escribir.writeObject(equipo);
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serealizable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void leerarchivo(String rutaArchivo) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo));
            // leer la linea codificada, creamos un auxiliar con las lineas de codigo         
            Object auxiliar = leer.readObject();
            Equipo equipo = (Equipo) auxiliar;

            System.out.println(equipo.getNombre());
            System.out.println(equipo.getFutbolista().getNombre());
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }

    }
    
    public Futbolista verifcarMenor(List<Futbolista> lista){
    Futbolista menor=lista.get(0);
    for ( Futbolista jugador : lista) {
        if(menor.getNumero()>jugador.getNumero()){
            menor=jugador;
            
        }
    }
    return menor;
}


public Equipo equipoMasTitulos(List<Equipo> Lista) {
        Equipo titulos = Lista.get(0);
        for (Equipo equi : Lista) {
            if (titulos.getTitulos() < equi.getTitulos()) {
                titulos = equi;
            }
        }
        return titulos;
    }
public double porcentajeAcierto(Futbolista objeto){
    return(objeto.getPases()+objeto.getAsistencias())/objeto.getGolesperdidos();
    }
public double porcentajeEfectividad(Futbolista objeto){
   return objeto.getPases()/objeto.getGolesperdidos();
}
public double rendimientoFutbolista(Futbolista objeto){
    return porcentajeAcierto(objeto)+porcentajeEfectividad(objeto)+objeto.getKmreco();
}
//public Futbolista mejorJugador(List<Futbolista>lista1){
//    Futbolista mejor=lista1.get(0);
//    for (Futbolista futbolista : lista1) {
//        if(mejor.)
//    }
//}

    public static void main(String[] args) throws IOException {
        Serealizable obj = new Serealizable();
        Equipo equipo1 = new Equipo("ganadores", "azul", 18, "Carlos Silva", new Futbolista("Simon", "Vargas", 8, "Delantero", 526.89,55,66.12,1223.4,16),6);
        Equipo equipo2 = new Equipo("ballenita", "morado", 12, "Mario Sanchez", new Futbolista("Andres", "Samaniego", 20, "Defensa", 823.96,78,55.13,7765.9,20),3);
        Equipo equipo3 = new Equipo("Barcelona", "amarillo", 22, "Juan Torres", new Futbolista("Pedro", "Armijos", 1, "Arquero", 728.00,65,77.4,57865.6,10));
        Equipo equipo4 = new Equipo("Emelec", "Azul", 15, "Fabian Altamirano", new Futbolista("Carlos", "Quintero", 14, "Delantero", 978.23,66,88.3,1234.6,2),15);
        Equipo equipo5 = new Equipo("Liga de Loja", "Blanco", 17, "Carlos Campoverde", new Futbolista("Javier", "Masache", 13, "Delantero", 456.25,55,46.7,3456,6),4);
        Equipo equipo6 = new Equipo("Nacional", "Rojo", 13, "Jose Villalta", new Futbolista("Mario", "Correa", 1, "Arquero", 879,55,98.4,6543.3,30));
        Equipo equipo7 = new Equipo("Liga de Quito", "Blanco", 15, "Eduardo Garcia", new Futbolista("Richard", "Salazar", 2, "defensa", 578.35,105,55.3,6543,5),10);
        Equipo equipo8 = new Equipo("Aucas", "amarillo", 13, "Angel Mera", new Futbolista("Felioe", "Caicedo", 3, "Defensa", 846.00,20,100.0,54323.1,2),6);
        Equipo equipo9 = new Equipo("Olmedo", "Rojo", 14, "Walter Medina", new Futbolista("Gerardo", "Montaño", 5, "Delantero", 956,105,30.4,43422.00,12),13);
        Equipo equipo10 = new Equipo("Manta_FC", "Azul", 17, "Matias Lopez", new Futbolista("David", "Mogroviejo", 13, "Delantero", 687.457,76,80.3,23432.4,1),5);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo1);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo2);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo3);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo4);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo5);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo6);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo7);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo8);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo9);
        obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt", equipo10);

        obj.leerarchivo("C:\\Users\\Usuario\\Desktop\\deberar.txt");

        List<Equipo> lista = new ArrayList<>();
        lista.add(equipo1);
        lista.add(equipo2);
        lista.add(equipo3);
        lista.add(equipo4);
        lista.add(equipo5);
        lista.add(equipo6);
        lista.add(equipo8);
        lista.add(equipo9);
        lista.add(equipo10);
       
       
        System.out.println();
    }


}
