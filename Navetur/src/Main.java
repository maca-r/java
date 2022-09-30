public class Main {
    public static void main(String[] args) {

        Embarcacion unVelero = new Velero(new Capitan("Susana","Ramirez",123456),2022,5.2,6);

        unVelero.setPrecioBase(1000.00);

        unVelero.setValorAdicional(250.0);

        System.out.println("El monto del alquiler del velero es:" + unVelero.calcularAlquiler());


        System.out.println("El velero es grande?: " + ((Velero) unVelero).esGrande());
    }
}