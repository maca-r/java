package universidad;

import universidad.Persona;

public abstract class Titulo {
    private Persona persona;
    private Integer cantidadMaterias;
    private String fechaInicioEstudios;
    private String fechaFinEstudios;
    private Boolean selladoMinisterio;
    private Boolean selladoInstituto;

    public Titulo(Persona persona, Integer cantidadMaterias, String fechaInicioEstudios, String fechaFinEstudios, Boolean selladoMinisterio, Boolean selladoInstituto) {
        this.persona = persona;
        this.cantidadMaterias = cantidadMaterias;
        this.fechaInicioEstudios = fechaInicioEstudios;
        this.fechaFinEstudios = fechaFinEstudios;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
    }

    public Boolean puedeEjercer(){
        return selladoMinisterio && selladoInstituto;
    }
}
