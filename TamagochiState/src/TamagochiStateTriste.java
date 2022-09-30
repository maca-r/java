public class TamagochiStateTriste extends TamagochiState{

    public TamagochiStateTriste(Tamagochi unTamagochi) {
        super(unTamagochi);
    }

    @Override
    public void comer() {
        System.out.println("Beep! Beep! Puaaaajjjj *-*");
    }

    @Override
    public void beber() {
        System.out.println("Beep!Beep!Beep! brrrrr");
    }

    @Override
    public void hacerMimos() {
        Tamagochi unTamagochi = getUnTamagochi();

        unTamagochi.setEstado(new TamagochiStateFeliz(unTamagochi));
    }
}
