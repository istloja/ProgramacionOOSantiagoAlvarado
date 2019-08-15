package ArchivosSerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class LeeryEscribir {

    public void escribirArchivo(String rutaArchivo, Persona persona) {

        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            escribir.writeObject(persona);
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public void leerArchivo(String rutaArchivo) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo));
            Object aux = leer.readObject();
//            System.out.println(aux);
           // Persona persona = (Persona) aux;
//            System.out.println(persona.getNombre());
//            System.out.println(persona.getMascota().getNombre());
            while (aux != null) {
                Persona persona = (Persona) aux;
                System.out.println(persona.getMascota().getNombre());
                aux = leer.readObject();

            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

    public static void main(String[] args) {

        LeeryEscribir objet = new LeeryEscribir();
        Persona objeto = new Persona("Santiago", "Alvarado", 20, new Mascota("Kashi", 4));
//        objet.escribirArchivo("C:\\Users\\Usuario\\Desktop\\rutaarchivo.txt", objeto);
//        objet.leerArchivo("C:\\Users\\Usuario\\Desktop\\rutaarchivo.txt");
        Persona objet2 = new Persona("Daniel", "Maldonado", 21, new Mascota("Kashi", 4));
        Persona objet3 = new Persona("alex", "rivera", 21, new Mascota("Snoopy", 4));
        Persona objet4 = new Persona("Sebas", "Pedrera", 21, new Mascota("Kira", 4));
        Persona objet5 = new Persona("Anthony", "Mendieta", 21, new Mascota("Fish", 0));
        List<Persona>lista=new ArrayList<>();
        lista.add(objeto);
        lista.add(objet2);
        lista.add(objet3);
        lista.add(objet4);
        lista.add(objet5);
     // objet.escribirArchivo("C:\\Users\\Usuario\\Desktop\\rutaarchivo.txt", (Persona) lista);
        objet.escribir_lista("C:\\Users\\Usuario\\Desktop\\rutaarchivo.txt",lista);
        objet.leerArchivo("C:\\Users\\Usuario\\Desktop\\rutaarchivo.txt");
    }

    public void escribir_lista(String direccion_archivo, List<Persona> listaPersona) {

        try {
            ObjectOutputStream leer = new ObjectOutputStream(new FileOutputStream(direccion_archivo));
            for (Persona persona : listaPersona) {
                leer.writeObject(persona);

            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

}
