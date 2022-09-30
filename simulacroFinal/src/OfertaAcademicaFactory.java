import java.util.ArrayList;
import java.util.List;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance;

    public OfertaAcademicaFactory() {
    }

    public static OfertaAcademicaFactory getInstance(){
        if (instance == null){
            instance = new OfertaAcademicaFactory();
        }

        return instance;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo) {
        switch (codigo) {
            case "Front End":
                return new Curso("Front End", "Curso de F.E.", 16, 2, 1000.0);
            case "Back End":
                return new Curso("Back End", "Curso de B.E.", 20, 2, 900.0);
            case "FullStack":
                List<OfertaAcademica> listaCursos = new ArrayList<OfertaAcademica>();

                OfertaAcademicaFactory factoryDeCursos = OfertaAcademicaFactory.getInstance();

                listaCursos.add(factoryDeCursos.crearOfertaAcademica("Front End"));
                listaCursos.add(factoryDeCursos.crearOfertaAcademica("Back End"));


                return new ProgramaIntensivo("FullStack", "Curso de F.E. + B.E", listaCursos, 20.0);
            case "Taller Intensivo":
                return new TallerIntensivo("Taller IT", "Un taller intensivo",5,1500.0);
            case "Carrera":
                List<OfertaAcademica> listaCarreras = new ArrayList<OfertaAcademica>();

                OfertaAcademicaFactory otraFactory = OfertaAcademicaFactory.getInstance();

                listaCarreras.add(otraFactory.crearOfertaAcademica("Taller Intensivo"));
                listaCarreras.add(otraFactory.crearOfertaAcademica("Front End"));
                listaCarreras.add(otraFactory.crearOfertaAcademica("Back End"));

                return new Carrera("Carrera IT","Taller+FE+BE",listaCarreras,3000.0);

                default:
                throw new IllegalStateException("El codigo ingresado " + codigo + "no corresponde a ninguna oferta academica");
        }


    }

}
