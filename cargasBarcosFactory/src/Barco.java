import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private List<Carga> cargas;

    public Barco(String nombre) {
        this.nombre = nombre;
        cargas = new ArrayList<Carga>();
    }

    public void mostrarCarga(){

        for (Carga unaCarga : cargas
             ) {
            System.out.println(unaCarga.toString());
        }
    }

    public void agregarCarga(Carga unaCarga){

        cargas.add(unaCarga);
    }


}
