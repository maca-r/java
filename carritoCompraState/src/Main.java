public class Main {
    public static void main(String[] args) throws CarritoStateException {
        //crea carrito vacio
        Carrito miCarrito = new Carrito();

        //crea productos
        Producto unProducto = new Producto("leche entera", 5.5);

        Producto unProducto2 = new Producto("harina",2.3);

        System.out.println(miCarrito);

        //avanza de estado
        miCarrito.estadoSiguiente();

        System.out.println(miCarrito);

        //cargando productos al carrito

        miCarrito.agregarProductos(unProducto);

        miCarrito.agregarProductos(unProducto2);

        //muestra lista de productos cargados
        miCarrito.verProductosCarrito();

        //avanza de estado
        miCarrito.estadoSiguiente();

        System.out.println(miCarrito);

        //excepcion porque en estado pagando no se pueden agregar mas productos
        // miCarrito.agregarProductos(unProducto);

        miCarrito.estadoSiguiente();

        miCarrito.estadoAnterior();

        System.out.println(miCarrito);







    }
}