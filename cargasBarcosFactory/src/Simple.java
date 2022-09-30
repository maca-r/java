public class Simple extends Carga{

    private Double peso;
    private Boolean refrigeracion;

    public Simple(String nombre, String descripcion, Double peso, Boolean refrigeracion) {
        super(nombre, descripcion);
        this.peso = peso;
        this.refrigeracion = refrigeracion;
    }


    @Override
    public Double calcularPeso() {
        if (refrigeracion){
            return peso + (peso * 0.1);
        }
        return peso;

    }

    @Override
    public String toString() {
        return "Carga Simple: " + "\n" +
                "nombre: " + getNombre() + "\n" +
                "peso: " + peso + "\n" +
                "refrigeracion" + refrigeracion;

    }
}
