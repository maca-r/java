public class Main {
    public static void main(String[] args) {
        //crea instituto
        Instituto unInstituto = new Instituto("DigitalHouse");

        //crea factory
        OfertaAcademicaFactory unaFactory = OfertaAcademicaFactory.getInstance();

        //crea curso y programa intensivo
        OfertaAcademica cursoFe =  unaFactory.crearOfertaAcademica("Front End");
        OfertaAcademica cursoBe =  unaFactory.crearOfertaAcademica("Back End");
        OfertaAcademica programaFs = unaFactory.crearOfertaAcademica("FullStack");

        Double precioCursoFront = cursoFe.calcularPrecio();
        Double precioCursoBack = cursoBe.calcularPrecio();
        Double precioProgramaI = programaFs.calcularPrecio();

        //agrega las ofertas a la lista
        unInstituto.agregarOfertaAcademica(cursoFe);
        unInstituto.agregarOfertaAcademica(cursoBe);
        unInstituto.agregarOfertaAcademica(programaFs);

        //ver informe del instituto sin taller y carrera
        //unInstituto.generarInforme();


        OfertaAcademica unTaller = unaFactory.crearOfertaAcademica("Taller Intensivo");
        OfertaAcademica unaCarrera = unaFactory.crearOfertaAcademica("Carrera");

        unInstituto.agregarOfertaAcademica(unTaller);
        unInstituto.agregarOfertaAcademica(unaCarrera);

        unInstituto.generarInforme();











    }
}