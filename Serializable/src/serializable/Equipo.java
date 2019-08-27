package serializable;

import java.io.Serializable;

public class Equipo implements Serializable {

    private String nombre;
    private String color;
    private int numero_jugador;
    private String director;
    private Futbolista futbolista;
    public Equipo(String ganadores, String azul, int par, String carlos_Silva, Futbolista futbolista1) {
    }

    public Equipo(String nombre, String color, int numero_jugador, String director) {
        this.nombre = nombre;
        this.color = color;
        this.numero_jugador = numero_jugador;
        this.director = director;
    }

    public Equipo(Futbolista futbolista) {
        this.futbolista = futbolista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero_jugador() {
        return numero_jugador;
    }

    public void setNumero_jugador(int numero_jugador) {
        this.numero_jugador = numero_jugador;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Futbolista getFutbolista() {
        return futbolista;
    }

    public void setFutbolista(Futbolista futbolista) {
        this.futbolista = futbolista;
    }
    
    public static void main(String[] args) {
    Equipo obj = new Equipo ("ganadores","azul", 18, "Carlos Silva", new Futbolista("Simon", "Vargas", 8, "Delantero", 526.89));
    }









}



