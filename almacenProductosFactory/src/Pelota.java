public class Pelota extends Producto{

    private Double radio;

    public Pelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {
        Double volumenPelota = 4 * Math.PI * Math.pow(radio,2);
        return volumenPelota;
    }
}
