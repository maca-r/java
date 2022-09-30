public abstract class OfertaAcademica {

    private String nombre;
    private String descripcion;

    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "//Oferta Academica: " + "\n" + "nombre: " + nombre + "\n"
                + "precio: " + calcularPrecio();
    }


}
