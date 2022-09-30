import java.util.ArrayList;
import java.util.List;

public class CargaFactory {

    private static CargaFactory instance;

    public CargaFactory() {
    }

    public static CargaFactory getInstance(){
        if(instance == null){
            instance = new CargaFactory();
        }
        return instance;
    }

    /*public Carga crearCarga(String codigo, String nombre, String descripcion, Double pesoCarga){
        switch (codigo){
            case "Carga Simple":
                return new Simple(nombre, descripcion, pesoCarga,false);
            case "Carga Simple Refrigerada":
                return new Simple(nombre, descripcion, pesoCarga,true);
            case "Contenedor":
                CargaFactory unaFactory = CargaFactory.getInstance();

                List<Carga> listaCargas = new ArrayList<>();

                listaCargas.add(unaFactory.crearCarga("Carga Simple",nombre,descripcion,pesoCarga));
                listaCargas.add(unaFactory.crearCarga("Carga Simple Refrigerada",nombre,descripcion,pesoCarga));

                return new Contenedor(nombre,descripcion,pesoCarga,listaCargas);

            default:
                throw new IllegalStateException("El codigo ingresado" + codigo + "no es valido");
        }*/

        public Carga crearCarga(String codigo){
            switch (codigo){
                case "Carga Simple":
                    return new Simple("TV 32", "una tv", 3.0,false);
                case "Carga Simple Refrigerada":
                    return new Simple("caja medicamentos", "medicacion", 2.0,true);
                case "Contenedor":
                    CargaFactory unaFactory = CargaFactory.getInstance();

                    List<Carga> listaCargas = new ArrayList<>();

                    listaCargas.add(unaFactory.crearCarga("Carga Simple"));
                    listaCargas.add(unaFactory.crearCarga("Carga Simple Refrigerada"));

                    return new Contenedor("contenedor","es amarillo",100.0,listaCargas);

                default:
                    throw new IllegalStateException("El codigo ingresado" + codigo + "no es valido");
            }

    }
}
