package serializable;

import java.io.Serializable;

public class Futbolista implements Serializable {
private String nombre;
private String apellido;
private int numero;
private String Posicion;
private double sueldo;

    public Futbolista() {
    }

    public Futbolista(String nombre, String apellido, int numero, String Posicion, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.Posicion = Posicion;
        this.sueldo = sueldo;
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