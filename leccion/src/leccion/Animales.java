
package leccion;


public class Animales {
    
    private String nombre;
    private double peso;
    private double altura;
    private String color;
    private int edad;

    public Animales(String nombre, double peso, double altura, String color, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
public void alimentarse(){
    System.out.println("soy "+nombre+" y me alimento");
}
   
public String informacionAnimal(){
    String cadena="Soy un "+nombre+"\n mi peso es: "+peso+"\n y mi color es "+color;
    return cadena;
}
    
    
}
