import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private List<OfertaAcademica> ofertasAcademicas;
    private Double bonificacion;

    public ProgramaIntensivo(String nombre, String descripcion, List<OfertaAcademica> ofertasAcademicas, Double bonificacion) {
        super(nombre, descripcion);
        this.ofertasAcademicas = ofertasAcademicas;
        this.bonificacion = bonificacion;
    }

    @Override
    public Double calcularPrecio() { //calcularPrecio() es sobre unaOferta

        Double precioTotal = 0.0;

        Double porcentajeBonificacion = bonificacion / 100;

        for (OfertaAcademica unaOferta : ofertasAcademicas
             ) {
            precioTotal = precioTotal + unaOferta.calcularPrecio();
        }

        return precioTotal - (precioTotal * porcentajeBonificacion);
    }
}
