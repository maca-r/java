public class EmpleadoRelacionDependencia extends Empleado{
    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo, Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo(Integer dias) {

        if (dias == 30){
            return sueldoMensual;
        }
        return sueldoMensual * (dias/30);

    }


}
