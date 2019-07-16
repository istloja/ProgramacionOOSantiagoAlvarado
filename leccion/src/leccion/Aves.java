
package leccion;


public class Aves extends Animales {
    private String tipoPico;
    private String movilidad;

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public Aves(String tipoPico, String movilidad, String nombre, double peso, double altura, String color, int edad) {
        super(nombre, peso, altura, color, edad);
        this.tipoPico = tipoPico;
        this.movilidad = movilidad;
    }

    public Aves(String nombre, double peso, double altura, String color, int edad) {
        super(nombre, peso, altura, color, edad);
    }

    
    
}
