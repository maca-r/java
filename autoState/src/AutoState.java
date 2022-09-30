public abstract class AutoState {

    private Auto miAuto;

    public AutoState(Auto miAuto) {
        this.miAuto = miAuto;
    }

    public abstract void acelerar() throws AutoStateException;

    public abstract void contacto() throws AutoStateException;

    public abstract void frenar() throws AutoStateException;

    public Auto getMiAuto() {
        return miAuto;
    }

}
