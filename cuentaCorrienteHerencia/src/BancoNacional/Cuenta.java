package BancoNacional;

public abstract class Cuenta {

    private String numeroCuenta;
    private String cbu;
    private Double saldo;

    public Cuenta(String numeroCuenta, String cbu, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cbu = cbu;
        this.saldo = saldo;


    }

    public abstract String depositar(Double importe);

    public abstract String extraer(Double importe);

    public Double informarSaldo(){
        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
