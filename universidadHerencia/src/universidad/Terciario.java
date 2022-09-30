package universidad;

import universidad.Persona;

public class Terciario extends Titulo {
    private Boolean validacionNacional;
    private Boolean validacionProvincial;

    public Terciario(Persona persona, Integer cantidadMaterias, String fechaInicioEstudios, String fechaFinEstudios, Boolean selladoMinisterio, Boolean selladoInstituto, Boolean validacionNacional, Boolean validacionProvincial) {
        super(persona, cantidadMaterias, fechaInicioEstudios, fechaFinEstudios, selladoMinisterio, selladoInstituto);
        this.validacionNacional = validacionNacional;
        this.validacionProvincial = validacionProvincial;
    }

    public Boolean esValidoNacional(){
        return validacionNacional;
    }
}
