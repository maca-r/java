public class Main {
    public static void main(String[] args) {
        ProductoFactory fabricaProductos = new ProductoFactory();

        Almacen unAlmacen = new Almacen();

        unAlmacen.agregarProducto("CAJA10X10");

        unAlmacen.agregarProducto("PELOTATENIS");

        /*unAlmacen.agregarProducto("PELOTAFUTBOL");*/


        System.out.println(unAlmacen.calcularEspacioNecesario());


        Producto unaCaja = ProductoFactory.construir("CAJA10X10");

        Producto unaPelotaTenis = ProductoFactory.construir("PELOTATENIS");

        System.out.println(unaCaja.calcularEspacio());

        System.out.println(unaPelotaTenis.calcularEspacio());

    }
}