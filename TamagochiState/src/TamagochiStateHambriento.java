public class TamagochiStateHambriento extends TamagochiState{

    public TamagochiStateHambriento(Tamagochi unTamagochi) {
        super(unTamagochi);
    }

    @Override
    public void comer() {
        Tamagochi unTamagochi = getUnTamagochi();

        unTamagochi.setEstado(new TamagochiStateFeliz(unTamagochi));
    }

    @Override
    public void beber() {
        Tamagochi unTamagochi = getUnTamagochi();

        unTamagochi.setEstado(new TamagochiStateTriste(unTamagochi));
    }

    @Override
    public void hacerMimos() {
        System.out.println("Tengo hambre!!! º~º");
    }
}
