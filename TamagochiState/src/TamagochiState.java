public abstract class TamagochiState {

    private Tamagochi unTamagochi;

    public TamagochiState(Tamagochi unTamagochi) {
        this.unTamagochi = unTamagochi;
    }

    public abstract void comer();
    public abstract void beber();
    public abstract void hacerMimos();

    public Tamagochi getUnTamagochi() {
        return unTamagochi;
    }
}
