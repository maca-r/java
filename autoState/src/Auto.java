public class Auto {

    private Integer velocidad;
    private Double cantidadCombustible;

    private AutoState estado;

    public Auto(Integer velocidad, Double cantidadCombustible) {
        this.velocidad = velocidad;
        this.cantidadCombustible = cantidadCombustible;
        estado = new ApagadoState(this);
    }


    public void acelerar() throws AutoStateException {
        estado.acelerar();
    }

    public void contacto() throws AutoStateException{
        estado.contacto();
    }

    public void frenar()  throws AutoStateException{
        estado.frenar();
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Double getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(Double cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public AutoState getEstado() {
        return estado;
    }

    public void setEstado(AutoState estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "velocidad=" + velocidad +
                ", cantidadCombustible=" + cantidadCombustible +
                ", estado=" + estado +
                '}';
    }
}
