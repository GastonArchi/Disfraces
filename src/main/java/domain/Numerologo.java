package domain;

public class Numerologo implements Mania {

    private int numeroDeseado;


    public boolean satisfaccion(Invitado unInvitado, Disfraz unDisfraz) {
        return unDisfraz.puntosDisfraz(unInvitado) >= 10 && unDisfraz.puntosDisfraz(unInvitado) == numeroDeseado;
    }
}
