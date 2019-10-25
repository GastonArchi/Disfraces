package domain;

public class Careta implements CaracteristicasDisfraz {

    private Personaje miPersonaje;



    public int devolverPuntos(Invitado unInvitado) {
        return miPersonaje.getValor();
    }
}
