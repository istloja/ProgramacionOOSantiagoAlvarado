package serializable;

import java.io.Serializable;

public class Futbolista implements Serializable {
private String nombre;
private String apellido;
private int numero;
private String Posicion;
private double sueldo;
private int pases;
private double asistencias;
private double kmreco;
private int golesperdidos;

    public Futbolista() {
    }

    public Futbolista(String nombre, String apellido, int numero, String Posicion, double sueldo, int pases, double asistencias, double kmreco, int golesperdidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.Posicion = Posicion;
        this.sueldo = sueldo;
        this.pases = pases;
        this.asistencias = asistencias;
        this.kmreco = kmreco;
        this.golesperdidos = golesperdidos;
    }

    Futbolista(String simon, String vargas, int i, String delantero, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public double getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(double asistencias) {
        this.asistencias = asistencias;
    }

    public double getKmreco() {
        return kmreco;
    }

    public void setKmreco(double kmreco) {
        this.kmreco = kmreco;
    }

    public int getGolesperdidos() {
        return golesperdidos;
    }

    public void setGolesperdidos(int golesperdidos) {
        this.golesperdidos = golesperdidos;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
    
    
}