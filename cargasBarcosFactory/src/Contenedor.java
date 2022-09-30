import java.util.List;

public class Contenedor extends Carga{

    private Double pesoContenedor;
    private List<Carga> listaCargas;

    public Contenedor(String nombre, String descripcion, Double pesoContenedor, List<Carga> listaCargas) {
        super(nombre, descripcion);
        this.pesoContenedor = pesoContenedor;
        this.listaCargas = listaCargas;
    }

    /*public void agregarCargaContenedor (Carga unaCarga){
        listaCargas.add(unaCarga);
    }*/

    @Override
    public Double calcularPeso() {
        Double pesoTotal = 0.0;

        for (Carga unaCarga : listaCargas) {
            pesoTotal = pesoTotal + unaCarga.calcularPeso();

        }

        return pesoTotal + pesoContenedor;

    }

    @Override
    public String toString() {
        return "Contenedor: " + "\n" +
                "nombre: " + getNombre() + "\n" +
                "peso: " + calcularPeso();

    }
}
