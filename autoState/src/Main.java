public class Main {
    public static void main(String[] args) throws AutoStateException {

        Auto unAuto = new Auto(0,10.0);

        unAuto.contacto();
        unAuto.acelerar();
        System.out.println(unAuto.toString());
        unAuto.acelerar();
        System.out.println(unAuto.toString());
        unAuto.acelerar();
        System.out.println(unAuto.toString());

    }
}