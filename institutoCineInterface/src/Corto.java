import java.time.LocalDate;

public class Corto extends Pelicula{
    private Boolean origenNacional;

    public Corto(Cine cine, String nombre, String clasificacion, Double minutosDuracion, LocalDate fechaFilmacion, String nombreDirector, Boolean origenNacional) {
        super(cine, nombre, clasificacion, minutosDuracion, fechaFilmacion, nombreDirector);
        this.origenNacional = origenNacional;
    }


    public Boolean esNacional(){
        return origenNacional;
    }
}
