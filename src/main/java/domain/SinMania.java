package domain;



public class SinMania implements Mania {




    public boolean satisfaccion(Invitado unInvitado, Disfraz unDisfraz) {
        return unDisfraz.puntosDisfraz(unInvitado) >= 10;
    }
}
