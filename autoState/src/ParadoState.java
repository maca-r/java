public class ParadoState extends AutoState{

    public ParadoState(Auto miAuto) {
        super(miAuto);
    }
    public void acelerar() throws AutoStateException {
        Auto miAuto = getMiAuto();

        miAuto.setEstado(new EnMarchaState(miAuto));
    }

    public void contacto() throws AutoStateException{
        Auto miAuto = getMiAuto();

        miAuto.setEstado(new ParadoState(miAuto));
    }

    public void frenar() throws AutoStateException {
        throw new AutoStateException("El auto esta parado");
    }

    @Override
    public String toString() {
        return "Auto Parado";
    }
}
