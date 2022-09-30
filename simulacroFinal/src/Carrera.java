import java.util.List;

public class Carrera extends OfertaAcademica{

    private List<OfertaAcademica> ofertasAcademicas;
    private Double costoBasico;

    public Carrera(String nombre, String descripcion, List<OfertaAcademica> ofertasAcademicas, Double costoBasico) {
        super(nombre, descripcion);
        this.ofertasAcademicas = ofertasAcademicas;
        this.costoBasico = costoBasico;
    }

    @Override
    public Double calcularPrecio() {
        Double preciosIndividuales = 0.0;

        for (OfertaAcademica unaOferta : ofertasAcademicas
             ) {
            preciosIndividuales += unaOferta.calcularPrecio();
        }

        return costoBasico + preciosIndividuales;
    }

    public void agregarCurso(OfertaAcademica unCurso){

        if (((Curso) unCurso).getCargaHoraria() > 10){
            ofertasAcademicas.add(unCurso);
        }

    }
}
