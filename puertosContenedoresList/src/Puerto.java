import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private String nombre;

    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedores = new ArrayList<Contenedor>();

    }

    public void agregaContenedor(Contenedor contenedor){
        contenedores.add(contenedor);
    }

    public void mostrarContenedoresOrdenados(){
        contenedores.sort(null);

        for (Contenedor unContenedor: contenedores) {
            System.out.println(unContenedor.toString());
        }
    }

    public Integer cantidadContenedoresPeligrosos(){
        Integer cantidad = 0;
        for (Contenedor unContenedor:contenedores) {
            if (unContenedor.getMaterialesPeligrosos() == true && unContenedor.getPaisProcedencia().equalsIgnoreCase("Desconocida")){
                cantidad++;
            }

        }
        return cantidad;
    }
}
