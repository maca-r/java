public class Main {
    public static void main(String[] args) throws ContenedorException {
        try {
            Contenedor contenedorAzul = new Contenedor(456, "Brasil", false);

            Contenedor contenedorRojo = new Contenedor(98, "Desconocida", true);

            Contenedor contenedorVerde = new Contenedor(321, "Rusia", true);

            Contenedor contenedorAmarillo = new Contenedor(32, "Argentina", true);

            Puerto unPuerto = new Puerto("Amarelo");
            unPuerto.agregaContenedor(contenedorAzul);
            unPuerto.agregaContenedor(contenedorVerde);
            unPuerto.agregaContenedor(contenedorRojo);
            unPuerto.agregaContenedor(contenedorAmarillo);
            System.out.println(unPuerto.cantidadContenedoresPeligrosos());

            unPuerto.mostrarContenedoresOrdenados();

        }
        catch(ContenedorException excepcion){
            System.out.println(excepcion.getMessage());
        }








    }
}