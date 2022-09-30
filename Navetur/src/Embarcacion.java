public abstract class Embarcacion {
    private Capitan capitan;

    private Double precioBase;

    private Double valorAdicional;

    private Integer anioFabricacion;

    private Double eslora;

    public Embarcacion(Capitan capitan, Integer anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public Double calcularAlquiler(){
        Double montoAlquiler = 0.0;
        if (getAnioFabricacion() > 2020){
            montoAlquiler = getPrecioBase() + getValorAdicional();
        } else {
            montoAlquiler = getPrecioBase();
        }
        return montoAlquiler;
    };
}
