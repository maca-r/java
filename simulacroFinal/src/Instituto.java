import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> ofertasAcademicas;
    private String nombre;

    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertasAcademicas = new ArrayList<OfertaAcademica>();
    }

    public void agregarOfertaAcademica(OfertaAcademica unaOferta){
        ofertasAcademicas.add(unaOferta);
    }

    public void generarInforme(){
        for (OfertaAcademica unaOferta:ofertasAcademicas
             ) {
            System.out.println(unaOferta.toString());

        }
    }
}
