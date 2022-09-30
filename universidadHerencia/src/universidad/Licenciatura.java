package universidad;

public class Licenciatura extends Titulo implements Comparable{
    private String temaTesis;
    private String fechaEntregaTesis;
    private Integer cantTrabajosInvestigacion;

    public Licenciatura(Persona persona, Integer cantidadMaterias, String fechaInicioEstudios, String fechaFinEstudios, Boolean selladoMinisterio, Boolean selladoInstituto) {
        super(persona, cantidadMaterias, fechaInicioEstudios, fechaFinEstudios, selladoMinisterio, selladoInstituto);
    }

    public void setCantTrabajosInvestigacion(Integer cantTrabajosInvestigacion) {
        this.cantTrabajosInvestigacion = cantTrabajosInvestigacion;
    }

    @Override
    public int compareTo(Object object){
        int unaLicenciatura = ((Licenciatura) object).cantTrabajosInvestigacion;

        if(this.cantTrabajosInvestigacion > unaLicenciatura){
            return 1;
        } else if (this.cantTrabajosInvestigacion < unaLicenciatura) {
            return -1;
        } return 0;

        //return this.cantTrabajosInvestigacion - unaLicenciatura;
    }
}
