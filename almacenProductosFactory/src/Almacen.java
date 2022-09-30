import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<Producto>();

    }

    //Se agrega el empleado ya armado
    public void agregarProducto(Producto unProducto){
        productos.add(unProducto);
    }

    //Almacen agregar producto creandolo con ProductoFactory
    public void agregarProducto(String producto){

        productos.add(ProductoFactory.construir(producto));
    }

    public Double calcularEspacioNecesario(){
        Double espacioNecesario = 0.0;

        for (Producto producto : this.productos) {
            espacioNecesario += producto.calcularEspacio();
        }

        return espacioNecesario;

    }
}
