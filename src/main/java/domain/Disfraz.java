package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Disfraz {

    private String nombre;
    private LocalDate fechaConfeccion;
    private List<CaracteristicasDisfraz> misCaracteristicas;
    private Invitado miInvitado;

    public Disfraz(String nombre, LocalDate fechaConfeccion, Invitado miInvitado) {
        this.nombre = nombre;
        this.fechaConfeccion = fechaConfeccion;
        this.misCaracteristicas = new ArrayList<>();
        this.miInvitado = miInvitado;
    }

    public int puntosDisfraz(Invitado miInvitado){

        return misCaracteristicas.stream().mapToInt(c -> c.devolverPuntos(miInvitado)).sum();

    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaConfeccion() {
        return fechaConfeccion;
    }

    public void agregarCaracteristica (CaracteristicasDisfraz caracteristica){

        this.misCaracteristicas.add(caracteristica);

    }

    public void addCaracteristica(CaracteristicasDisfraz unaCaracteristica){

        misCaracteristicas.add(unaCaracteristica);

    };


}
