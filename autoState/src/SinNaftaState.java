public class SinNaftaState extends AutoState{

    public SinNaftaState(Auto miAuto) {
        super(miAuto);
    }
    public void acelerar() throws AutoStateException {
        Auto miAuto = getMiAuto();

        if (miAuto.getCantidadCombustible()>0){
            throw new AutoStateException("El auto tiene combustible, puede circular");
        }
        else{
            System.out.println("El auto no tiene combustible");
        }

    }

    public void contacto() throws AutoStateException{
        throw new AutoStateException("El auto no tiene combustible");
    }

    public void frenar() throws AutoStateException {
        throw new AutoStateException("El auto no tiene combustible");
    }

    @Override
    public String toString() {
        return "Sin nafta";
    }
}
