
package Empleados;


public class repartidor extends empleado {

    private String zona;

    public repartidor(String zona, String Nombre, int Edad, double Salario) {
        super(Nombre, Edad, Salario);
        this.zona = zona;
    }

    public repartidor() {
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}
