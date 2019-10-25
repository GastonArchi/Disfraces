package domain;

public class Taciturno implements Personalidad {


    public boolean devolverSexy(Invitado unInvitado) {

        if (unInvitado.getEdad() < 30){

            return true;

        }else
            return false;

    }
}
