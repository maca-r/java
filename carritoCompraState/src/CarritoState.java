public abstract class CarritoState {
    private Carrito unCarrito;

    public CarritoState(Carrito unCarrito) {
        this.unCarrito = unCarrito;
    }

    public abstract void agregarProductos(Producto unProducto) throws CarritoStateException;


    public abstract void cancelarCarrito() throws CarritoStateException;


    public abstract void estadoAnterior() throws CarritoStateException;


    public abstract void estadoSiguiente();

    public Carrito getUnCarrito() {
        return unCarrito;
    }


}
