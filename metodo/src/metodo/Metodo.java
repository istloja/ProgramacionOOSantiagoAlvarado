/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

/**
 *
 * @author Usuario
 */
public class Metodo {

    public double CalcularEdad(int año, int fechaActual) {
        double edad = fechaActual - año;
        return edad;
    }

    public double CalcularHipotenusa(double catetoOpuesto, double catetoAdyacente) {

        double resp = Math.hypot(catetoOpuesto, catetoAdyacente);
        return resp;
    }

    public String MayorDeEdad(int edad) {
        if (edad >= 18) {
            return "es mayor de edad";

        } else {
            return "es menor de edad";
        }
    }

    public double CalcularIva(boolean Iva, double precio) {
        if (Iva == true) {
            double iva = precio * 0.12;
            double preciotot = precio + iva;
            return preciotot;
        } else {
            return precio;
        }
    }

    public boolean Pase(double nota, int porcentajefaltas) {
        if (nota >= 7 && porcentajefaltas <20) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
