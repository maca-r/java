public class Main {
    public static void main(String[] args) {
        Barco unBarquito = new Barco("marSalado");

        CargaFactory unaFactory = CargaFactory.getInstance();

        Carga cargaSimple = unaFactory.crearCarga("Carga Simple");
        Carga cargaSimpleRef = unaFactory.crearCarga("Carga Simple Refrigerada");
        Carga contenedorAmarillo = unaFactory.crearCarga("Contenedor");

        /*((Contenedor) contenedorAmarillo).ad(cargaSimple);
        ((Contenedor) contenedorAmarillo).agregarCargaContenedor(cargaSimpleRef);*/

        unBarquito.agregarCarga(cargaSimple);
        unBarquito.agregarCarga(cargaSimpleRef);
        unBarquito.agregarCarga(contenedorAmarillo);




        System.out.println(cargaSimple.calcularPeso());
        System.out.println( cargaSimpleRef.calcularPeso());
        System.out.println(contenedorAmarillo.calcularPeso());

        unBarquito.mostrarCarga();
    }
}