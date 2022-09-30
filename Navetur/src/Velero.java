public class Velero extends Embarcacion{
    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Integer anioFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitan, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Integer getCantidadMastiles() {
        return cantidadMastiles;
    }

    public Boolean esGrande(){
        return getCantidadMastiles() > 4;
    }


}
