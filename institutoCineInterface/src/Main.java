import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cine unCine = new Cine("Trasnoche","San Martin 123", 250);

        Pelicula unCorto = new Corto(unCine,"Corto 1","ATP",120.0, LocalDate.of(2021,12,01),"Pepe Flores",false);

        System.out.println("El corto es ATP?: " + unCorto.esApta());

        System.out.println("El corto es de origen nacional?: " + ((Corto) unCorto).esNacional());

        Pelicula unlargometraje = new Largometraje(unCine,"El largo", "+16",100.00, LocalDate.of(2019,11,15),"Charles","accion",3);

        Pelicula otroLargo = new Largometraje(unCine,"El largo 2", "+16",115.00, LocalDate.of(2020,12,15),"Charles","accion",2);

        if (((Largometraje) unlargometraje).compareTo(otroLargo ) == 1) {
            System.out.println("El largo es mayor que El largo 2");
        } else if ((((Largometraje) unlargometraje).compareTo(otroLargo ) == -1)) {
            System.out.println("El largo es menor que El largo 2");
        } else {
            System.out.println("Ambos largometrajes son iguales");
        }

        System.out.println("El largometraje El Largo 2 es ATP?: " + otroLargo.esApta());


    }
}