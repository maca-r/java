public class Curso extends OfertaAcademica{

    private Integer cargaHoraria;
    private Integer mesesDuracion;
    private Double valorHora;

    public Curso(String nombre, String descripcion, Integer cargaHoraria, Integer mesesDuracion, Double valorHora) {
        super(nombre, descripcion);
        this.cargaHoraria = cargaHoraria;
        this.mesesDuracion = mesesDuracion;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularPrecio() {
        return cargaHoraria * mesesDuracion * valorHora;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
}
