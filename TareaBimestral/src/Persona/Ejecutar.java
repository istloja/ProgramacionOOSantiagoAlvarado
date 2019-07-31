
package Persona;
import java.util.Locale;
import java.util.Scanner;

 
public class Ejecutar {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);
         
        //Introducimos los datos
        System.out.println("Introduce el nombre");
        String nombre = sc.next();
        System.out.println("Introduce la edad");
        int edad = sc.nextInt();
        System.out.println("Introduce el DNI");
        int DNI=sc.nextInt();
        System.out.println("Introduce el sexo");
        char sexo = sc.next().charAt(0);
        System.out.println("Introduce el peso");
        double peso = sc.nextDouble();
        System.out.println("Introduce la altura");
        double altura = sc.nextDouble();
 
        //Creamos objetos con cada constructor
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad,DNI, sexo, peso, altura);
 
        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
 
        persona2.setPeso(90.5);
        persona2.setAltura(1.80);
 
        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
 
        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
 
        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }
 
    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.CalcularIMC(0, 0);
        switch (IMC) {
            case 0:
                System.out.println("La persona esta en su peso ideal");
                break;
            case -1:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case 1:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.Edad(0)) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
 
}
