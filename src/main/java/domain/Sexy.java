package domain;

public class Sexy implements CaracteristicasDisfraz {



    public int devolverPuntos(Invitado unInvitado) {

        if (unInvitado.sosSexy()){

            return 15;

        }else
            return 2;

    }
}
