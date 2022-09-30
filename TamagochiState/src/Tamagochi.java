public class Tamagochi {

    private String nombre;

    private TamagochiState estado;

    public Tamagochi(String nombre) {
        this.nombre = nombre;
        estado = new TamagochiStateFeliz(this);
    }

    public void comer(){
        estado.comer();
    }
    public void beber(){
        estado.beber();
    }
    public void hacerMimos(){
        estado.hacerMimos();
    }

    public void setEstado(TamagochiState estado) {
        this.estado = estado;
    }
}
