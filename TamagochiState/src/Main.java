public class Main {
    public static void main(String[] args) {
        Tamagochi miTamagochi = new Tamagochi("Lolin");

        //mimos-feliz
        miTamagochi.hacerMimos();

        //pasa de feliz a sediento
        miTamagochi.comer();

        //mimos-sediento
        miTamagochi.hacerMimos();
    }
}