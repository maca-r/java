package BancoNacional;

public class CajaAhorro extends Cuenta{

    private Cuenta cuenta;
    private Double tasaInteres;

    public CajaAhorro(String numeroCuenta, String cbu, Double saldo) {
        super(numeroCuenta, cbu, saldo);

    }

    @Override
    public String depositar(Double importe) {
        Double nuevoSaldo = getSaldo() + importe;
        return "Su saldo actual es: " + nuevoSaldo.toString();
    }

    @Override
    public String extraer(Double importe) {
        Double nuevoSaldo = getSaldo();
        if (importe <= getSaldo()){
            nuevoSaldo -= importe;
        }
        else {
            System.out.println("El importe que desea extraer supera el saldo actual disponible.");
        }
        return "Su saldo actual es: " + nuevoSaldo.toString();
    }


}
