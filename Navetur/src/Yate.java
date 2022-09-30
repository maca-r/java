public class Yate extends Embarcacion implements Comparable{

    private Integer cantidadCamarotes;



    public Yate(Capitan capitan, Integer anioFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitan, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        setPrecioBase(1000.00);
    }

    @Override
    public int compareTo(Object unYate) {
        Yate otroYate = (Yate) unYate;

        Integer otroYateCamarotes = otroYate.cantidadCamarotes;

        if (cantidadCamarotes > otroYateCamarotes){
            return 1;
        } else if (cantidadCamarotes < otroYateCamarotes) {
            return -1;
        }
        return 0;
    }




}
