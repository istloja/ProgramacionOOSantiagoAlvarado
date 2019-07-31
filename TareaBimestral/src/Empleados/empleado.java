
package Empleados;


public class empleado {

    private String Nombre;
    private int Edad;
    private double Salario;
    private int Plus = 300;

    public empleado() {
    }

    public empleado(String Nombre, int Edad, double Salario) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getPlus() {
        return Plus;
    }

    public void setPlus(int Plus) {
        this.Plus = Plus;
    }

}
