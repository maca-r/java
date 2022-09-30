package Herencia;

public class CuentaCorriente extends Cuenta {
    private double descubierto;

    public CuentaCorriente(String numero, double saldo){
        super(numero, saldo);
        descubierto = 1000.00;
    }


    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }
}
