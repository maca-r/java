public class TallerIntensivo extends OfertaAcademica{

    private Integer cantidadTP;
    private Double costoPorTP;

    public TallerIntensivo(String nombre, String descripcion, Integer cantidadTP, Double costoPorTP) {
        super(nombre, descripcion);
        this.cantidadTP = cantidadTP;
        this.costoPorTP = costoPorTP;
    }

    @Override
    public Double calcularPrecio() {
        Double costoTotalTaller = 0.0;

        costoTotalTaller = costoPorTP * cantidadTP;

        return costoTotalTaller;
    }
}
