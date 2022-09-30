public class CarritoStatePagando extends CarritoState{

    public CarritoStatePagando(Carrito unCarrito) {
        super(unCarrito);
    }

    @Override
    public void agregarProductos(Producto unProducto) throws CarritoStateException {
        throw new CarritoStateException("No se pueden agregar mas productos al carrito, esperando aceptacion compra");
    }

    @Override
    public void cancelarCarrito() throws CarritoStateException {
        Carrito miCarrito = getUnCarrito();

        miCarrito.setEstado(new CarritoStateVacio(miCarrito));
    }

    @Override
    public void estadoAnterior() throws CarritoStateException {
        Carrito miCarrito = getUnCarrito();

        miCarrito.setEstado(new CarritoStateCargando(miCarrito));
    }

    @Override
    public void estadoSiguiente() {
        Carrito miCarrito = getUnCarrito();

        miCarrito.setEstado(new CarritoStateCerrado(miCarrito));
    }

    @Override
    public String toString() {
        return "Pagando";
    }
}
