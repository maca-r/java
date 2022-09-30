import java.util.ArrayList;
import java.util.List;

public class Contenedor implements Comparable{

    private Integer numeroIdentificacion;
    private String paisProcedencia;

    /*private List<Pais> paisesProcedenciaPermitidos;*/
    private Boolean materialesPeligrosos;

    public Contenedor(Integer numeroIdentificacion, String paisProcedencia, Boolean materialesPeligrosos) throws ContenedorException {
        if (!(paisProcedencia.equals("Brasil") || paisProcedencia.equals("Rusia") || paisProcedencia.equals("China") || paisProcedencia.equals("Desconocida"))){
          throw new ContenedorException("El pais de procedencia " + paisProcedencia +  " no es valido");
        }
        this.paisProcedencia = paisProcedencia;
        this.numeroIdentificacion = numeroIdentificacion;
        this.materialesPeligrosos = materialesPeligrosos;

        /*paisesProcedenciaPermitidos = new ArrayList<Pais>(){{
            add(new Pais("Brasil"));
            add(new Pais("China"));
            add(new Pais("Desconocida"));
            add(new Pais("Rusia"));

        }};

        for (Pais unPais: paisesProcedenciaPermitidos) {
            if (!(unPais.equals(this.paisProcedencia))){
                throw new ContenedorException("El pais de procedencia " + paisProcedencia +  " no es valido");
            }
        }*/
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }


    public Boolean getMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    /*public List<Pais> getPaisesProcedenciaPermitidos() {
        return paisesProcedenciaPermitidos;
    }*/

    @Override
    public int compareTo(Object c) {
        Contenedor otroContenedor = (Contenedor) c;
        return this.numeroIdentificacion - otroContenedor.getNumeroIdentificacion();
    }

    @Override
    public String toString() {
        return "Contenedor: " +
                "numeroIdentificacion: " + numeroIdentificacion +
                ", paisProcedencia: " + paisProcedencia + '\'' +
                ", materialesPeligrosos: " + materialesPeligrosos;
    }
}
