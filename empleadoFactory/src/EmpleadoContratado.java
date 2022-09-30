public class EmpleadoContratado extends Empleado {

    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldo(Integer dias) {
        if (dias == 30){
            return importePorHora * 8 * 30;
        } else {
            return importePorHora * 8 * (dias/30);
        }
    }

    public Double calcularSueldoPorHora(Integer dias, Double horasTrabajadas) {

        return dias * (horasTrabajadas * importePorHora * ((100 - retencionImpuesto) /100));
    }
}
