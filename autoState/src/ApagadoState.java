public class ApagadoState extends AutoState{

    public ApagadoState(Auto miAuto) {
        super(miAuto);
    }

    public void acelerar() throws AutoStateException {
        throw new AutoStateException("El auto esta apagado, no puede acelerar");
    }

    public void contacto(){
        Auto miAuto = getMiAuto();

        miAuto.setEstado(new ParadoState(miAuto));
    }

    public void frenar() throws AutoStateException {
        throw new AutoStateException("El auto esta apagado, no puede frenar");
    }

    @Override
    public String toString() {
        return "Auto apagado";
    }
}
