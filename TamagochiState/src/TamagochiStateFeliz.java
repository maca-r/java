public class TamagochiStateFeliz extends TamagochiState{

    public TamagochiStateFeliz(Tamagochi unTamagochi) {
        super(unTamagochi);
    }

    @Override
    public void comer() {

        Tamagochi unTamagochi = getUnTamagochi();

        unTamagochi.setEstado(new TamagochiStateSediento(unTamagochi));

    }

    @Override
    public void beber() {
        Tamagochi unTamagochi = getUnTamagochi();

        unTamagochi.setEstado(new TamagochiStateHambriento(unTamagochi));
    }

    @Override
    public void hacerMimos() {
        System.out.println("Estoy feliz y me miman! ^.^");
    }
}
