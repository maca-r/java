import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos;
    private CarritoState estado;

    public Carrito() {
        productos = new ArrayList<Producto>();
        estado = new CarritoStateVacio(this);
    }

    public void agregarProductos(Producto unProducto) throws CarritoStateException {
        estado.agregarProductos(unProducto);
    }

    public void cancelarCarrito() throws CarritoStateException {
        productos = new ArrayList<Producto>();
        estado.cancelarCarrito();
    }

    public void estadoAnterior() throws CarritoStateException {
        estado.estadoAnterior();
    }

    public void estadoSiguiente(){
        estado.estadoSiguiente();
    }

    public void setEstado(CarritoState estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public CarritoState getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "El carrito esta: " + estado ;

    }

    public void verProductosCarrito(){
        for (Producto producto:productos
             ) {
            System.out.println(producto.toString());
        }
    }

}
