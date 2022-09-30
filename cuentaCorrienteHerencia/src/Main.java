import BancoNacional.CajaAhorro;
import BancoNacional.Cuenta;

public class Main {
    public static void main(String[] args) {


        CajaAhorro cajaAhorro = new CajaAhorro ("123","789", 500.00);


        System.out.println(cajaAhorro.extraer(600.00));
        System.out.println(cajaAhorro.depositar(600.00));


    }
}