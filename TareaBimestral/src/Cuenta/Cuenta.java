package Cuenta;

public class Cuenta {

    public String nombrecliente;
    public int numeroCuenta;
    public double tipoInteres;
    public double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombrecliente, int numeroCuenta, double tipoInteres, double saldo) {
        this.nombrecliente = nombrecliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(final Cuenta c) {
        nombrecliente = c.nombrecliente;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double cu2) {
        boolean ingresoCorrecto = true;
        if (cu2 < 0) {
            ingresoCorrecto = false;
        } 
        return ingresoCorrecto;
    }

    public boolean suficiencia(double saldo,double cu3){
        if((saldo-cu3)<0){
            return false;
        }else{
            return true;
        }
    }
         public String saldoretiro(double saldo,double cu3){
             if((saldo-cu3)<0){
                 return "Saldo insufuciente";
             }else{
                 double total=saldo-cu3;
                 return "Saldo disponible: "+total;
             }
         } 
        
    
    public double saldoingreso(double saldo,double cu2){
        double saldoingreso=saldo+cu2;
        return saldoingreso;
    }
}


    

