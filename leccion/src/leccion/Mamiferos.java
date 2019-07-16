
package leccion;


public class Mamiferos extends Animales {
    private String movilidad;
    private boolean marsupia;

    public Mamiferos(String movilidad, boolean marsupia, String nombre, double peso, double altura, String color, int edad) {
        super(nombre, peso, altura, color, edad);
        this.movilidad = movilidad;
        this.marsupia = marsupia;
    }

    public Mamiferos(String nombre, double peso, double altura, String color, int edad) {
        super(nombre, peso, altura, color, edad);
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public boolean isMarsupia() {
        return marsupia;
    }

    public void setMarsupia(boolean marsupia) {
        this.marsupia = marsupia;
    }

    
   
    
}
