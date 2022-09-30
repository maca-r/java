public class ProductoFactory {
    public ProductoFactory() {
    }


    public static Producto construir(String codigo){
        switch (codigo){
            case "CAJA10X10":
                return new Caja(1.5,10.0,10.0,10.0);
            case "PELOTAFUTBOL":
                return new Pelota(0.3, 11.0);
            case "PELOTATENIS":
                return new Pelota(0.7, 0.32);
            default:
                throw new IllegalStateException("El codigo de producto" + codigo + "no es valido.");
        }
    }



}
