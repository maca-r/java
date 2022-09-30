public class EnMarchaState extends AutoState{

    private final Integer VELOCIDAD_MAXIMA = 200;
    public EnMarchaState(Auto miAuto) {
        super(miAuto);
    }

    public void acelerar() throws AutoStateException {
        Auto miAuto = getMiAuto();

        if (miAuto.getCantidadCombustible()>0){
            if(miAuto.getVelocidad()<VELOCIDAD_MAXIMA){
                Integer velocidadAumenta = miAuto.getVelocidad();

                miAuto.setVelocidad(velocidadAumenta + 10);

                Double combustibleDisminuye = miAuto.getCantidadCombustible();

                miAuto.setCantidadCombustible(combustibleDisminuye - 15);
            }
        } else{
            miAuto.setEstado(new SinNaftaState(miAuto));
            throw new AutoStateException("Se quedo sin combustible");
        }

    }

    public void contacto() throws AutoStateException{
        throw new AutoStateException("El auto ya esta en marcha");
    }

    public void frenar() throws AutoStateException {
        Auto miAuto = getMiAuto();

        miAuto.setVelocidad(miAuto.getVelocidad()- miAuto.getVelocidad());

        System.out.println("El auto está detenido");
    }

    @Override
    public String toString() {
        return "En marcha";
    }
}
