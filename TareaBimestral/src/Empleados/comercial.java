package Empleados;

import java.util.Scanner;

public class comercial extends empleado {

    private double comison;

    public comercial() {
    }

    public comercial(double comison) {
        this.comison = comison;
    }

    public comercial(double comison, String Nombre, int Edad, double Salario) {
        super(Nombre, Edad, Salario);
        this.comison = comison;
    }

    public double getComison() {
        return comison;
    }

    public void setComison(double comison) {
        this.comison = comison;
    }

    public void plus(int plus, double Salario) {

    }

}
