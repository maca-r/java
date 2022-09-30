public class Main {
    public static void main(String[] args) {

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        EmpleadoFactory empleadoFactory1 = EmpleadoFactory.getInstance();

        Empleado empleadoAdministracion = empleadoFactory.construir("EMP-RD", "Macarena","Reyes");

        Empleado empleadoTesoreria = empleadoFactory.construir("EMP-RD","Pepito","Juan");

        Empleado empleadoLegales = empleadoFactory1.construir("EMP-PH","Vicente","Rosas");

        System.out.println(empleadoAdministracion.toString());

        System.out.println(empleadoTesoreria.toString());

        System.out.println(empleadoLegales.toString());

        System.out.println(empleadoAdministracion.calcularSueldo(29));

        System.out.println(((EmpleadoContratado) empleadoLegales).calcularSueldoPorHora(5,8.0));

    }
}