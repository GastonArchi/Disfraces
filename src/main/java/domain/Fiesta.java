package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fiesta {

    private String lugar;
    private LocalDate fecha;
    private List<Invitado> Invitados;


    public Fiesta(String lugar, LocalDate fecha) {
        this.lugar = lugar;
        this.fecha = fecha;
        Invitados = new ArrayList<>();
    }

    public void addInvitado(Invitado unInvitado){

        Invitados.add(unInvitado);

    }

    public boolean chequearSiLaFiestaEsUnBodrio(Fiesta unaFiesta){

        return Invitados.stream().anyMatch(i -> !i.estasSatisfecho(i, i.getMiDisfraz()));


    }
}
