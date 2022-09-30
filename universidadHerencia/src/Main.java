import universidad.Licenciatura;
import universidad.Persona;
import universidad.Titulo;

public class Main {
    public static void main(String[] args) {
        Persona estudiante = new Persona("Macarena", "Reyes","27","38909606");

        Titulo unaLicenciatura = new Licenciatura(estudiante,36,"01/03/2022","30/11/2024",false,true);

        System.out.println("El graduado puede ejercer?: " + unaLicenciatura.puedeEjercer());

        Titulo otraLicenciatura = new Licenciatura(estudiante, 40,"31/08/2022","xx/xx/xxx",true,false);

        ((Licenciatura) unaLicenciatura).setCantTrabajosInvestigacion(5);

        ((Licenciatura) otraLicenciatura).setCantTrabajosInvestigacion(9);

        int comparacion = ((Licenciatura) unaLicenciatura).compareTo(otraLicenciatura);

        if (comparacion == 1){
            System.out.println("El titulo de unaLicenciatura es mayor que el de otraLicenciatura");
        } else if (comparacion == -1) {
            System.out.println("El titulo de unaLicenciatura es menor que el de otraLicenciatura");
        } else{
            System.out.println("Ambas licenciaturas son iguales");
        }

    }

}