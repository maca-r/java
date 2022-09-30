import java.time.LocalDate;

public class Largometraje extends Pelicula implements Comparable{
    private String tema;
    private Integer cantidadActoresPrincipales;

    public Largometraje(Cine cine, String nombre, String clasificacion, Double minutosDuracion, LocalDate fechaFilmacion, String nombreDirector, String tema, Integer cantidadActoresPrincipales) {
        super(cine, nombre, clasificacion, minutosDuracion, fechaFilmacion, nombreDirector);
        this.tema = tema;
        this.cantidadActoresPrincipales = cantidadActoresPrincipales;
    }


    @Override
    public int compareTo(Object objeto){
        int unLargometraje = ((Largometraje) objeto).cantidadActoresPrincipales;

        if (cantidadActoresPrincipales > unLargometraje){
            return 1;
        } else if ((cantidadActoresPrincipales < unLargometraje)) {
            return -1;
        }
        return 0;
    }
}
