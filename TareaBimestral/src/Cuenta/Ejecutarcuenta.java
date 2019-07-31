package Cuenta;

import java.util.Scanner;

public class Ejecutarcuenta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numero;
        double tipo, saldo;
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre : ");
        nombre = entrada.nextLine();
        cuenta1.setNombrecliente(nombre);
        System.out.print("Número de cuenta : ");
        numero = entrada.nextInt();
        cuenta1.setNumeroCuenta(numero);
        System.out.print("Tipo de interes : ");
        tipo = entrada.nextDouble();
        cuenta1.setTipoInteres(tipo);
        System.out.print("Saldo: ");
        saldo = entrada.nextDouble();
        cuenta1.setSaldo(saldo);

        System.out.println("Digite 1 para hacer deposito \nDigite 2 para hacer un retiro ");
        int opc = entrada.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Ingresar la cantidad");
                double cu2 = entrada.nextInt();
                if(cu2>0){
                System.out.println(cuenta1.ingreso(cu2));
                System.out.println("Saldo total: " + cuenta1.saldoingreso(saldo, cu2));
                }else{
                    System.out.println("Porfavor dijitar solo cantidades positivas");
                }break;
            case 2:
                System.out.println("Ingrese la cantidad al retirar");
                double cu3=entrada.nextInt();
                System.out.println(cuenta1.suficiencia(saldo, cu3));
                System.out.println(cuenta1.saldoretiro(saldo, cu3));
                break;
        }
    }
}
