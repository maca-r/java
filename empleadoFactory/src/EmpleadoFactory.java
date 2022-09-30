public class EmpleadoFactory {

    //Variable de clase que representa una instancia de EmpleadoFactory (la crea vacia)
    private static EmpleadoFactory instance;

    public static EmpleadoFactory getInstance(){
        if (instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    private Integer legajo;

    public EmpleadoFactory() {
        legajo = 0;
    }

    public Empleado construir(String codigo, String nombre, String apellido){
        switch (codigo){
            case "EMP-RD":
                legajo ++;
                return new EmpleadoRelacionDependencia(nombre, apellido, legajo, 1000.00);
            case "EMP-PH":
                legajo ++;
                return new EmpleadoContratado(nombre, apellido, legajo, 7.0, 14.0);
            default:
                throw new IllegalStateException("El código " + codigo + "no es valido.");
        }
    }
}
