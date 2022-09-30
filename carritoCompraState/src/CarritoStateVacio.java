public class CarritoStateVacio extends CarritoState{
    public CarritoStateVacio(Carrito unCarrito) {
        super(unCarrito);
    }

    @Override
    public void agregarProductos(Producto unProducto) throws CarritoStateException {
        throw new CarritoStateException("En el estado vacío no se pueden agregar productos.");
    }

    @Override
    public void cancelarCarrito() throws CarritoStateException {
        throw new CarritoStateException("El carrito ya esta vacio, no se puede cancelar");
    }

    @Override
    public void estadoAnterior() throws CarritoStateException {
        throw new CarritoStateException("Estado vacio, no se puede volver a un estado anterior");

    }

    @Override
    public void estadoSiguiente() {
        Carrito miCarrito = getUnCarrito();

        miCarrito.setEstado(new CarritoStateCargando(miCarrito));
    }

    @Override
    public String toString() {
        return "Vacio";
    }
}
