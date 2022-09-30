public class CarritoStateCerrado extends CarritoState{

    public CarritoStateCerrado(Carrito unCarrito) {
        super(unCarrito);
    }

    @Override
    public void agregarProductos(Producto unProducto) throws CarritoStateException {
        throw new CarritoStateException("Compra realizada, no se pueden agregar productos");
    }

    @Override
    public void cancelarCarrito() throws CarritoStateException {
        throw new CarritoStateException("Compra realizada, no se puede cancelar");
    }

    @Override
    public void estadoAnterior() throws CarritoStateException {
        throw new CarritoStateException("Compra realizada, no se puede volver al estado anterior");

    }

    @Override
    public void estadoSiguiente() {
        Carrito miCarrito = getUnCarrito();

        miCarrito.setEstado(new CarritoStateVacio(miCarrito));
    }

    @Override
    public String toString() {
        return "Cerrado";
    }
}
