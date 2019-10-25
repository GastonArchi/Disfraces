package domain;

public class Gracioso implements CaracteristicasDisfraz {

    private int nivelDeGracia;


    public Gracioso(int nivelDeGracia) {
        this.nivelDeGracia = nivelDeGracia;
    }

    public int devolverPuntos(Invitado unInvitado) {

        if (unInvitado.getEdad() > 50){

            return nivelDeGracia*3;
        }else
        return nivelDeGracia;
    }
}
