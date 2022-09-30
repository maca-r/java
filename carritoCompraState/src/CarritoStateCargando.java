import java.util.ArrayList;
import java.util.List;

public class CarritoStateCargando extends CarritoState{

    public CarritoStateCargando(Carrito unCarrito) {
        super(unCarrito);
    }

    @Override
    public void agregarProductos(Producto unProducto) throws CarritoStateException {
        Carrito miCarrito = getUnCarrito();

        (miCarrito.getProductos()).add(unProducto);
    }

    @Override
    public void cancelarCarrito() throws CarritoStateException {
        Carrito miCarrito = getUnCarrito();

        miCarrito.setEstado(new CarritoStateVacio(miCarrito));
    }

    @Override
    public void estadoAnterior() throws CarritoStateException {
        Carrito miCarrito = getUnCarrito();

        miCarrito.setEstado(new CarritoStateVacio(miCarrito));
    }

    @Override
    public void estadoSiguiente() {
        Carrito miCarrito = getUnCarrito();

        miCarrito.setEstado(new CarritoStatePagando(miCarrito));
    }

    @Override
    public String toString() {
        return "Cargando";
    }
}
