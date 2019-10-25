package domain;

public class Caprichoso implements Mania {


    /*Copiado De StackOverflow*/
    boolean isEven(int  num) { return ((num % 2) == 0); }

    public boolean satisfaccion(Invitado unInvitado, Disfraz unDisfraz) {
        return isEven(unDisfraz.getNombre().length()) && unDisfraz.puntosDisfraz(unInvitado) >= 10;

    }
}
