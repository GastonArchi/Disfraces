package domain;

public class Personaje {

    private int valorPersonaje;
    private String nombre;

    public Personaje(int valorPersonaje, String nombre) {
        this.valorPersonaje = valorPersonaje;
        this.nombre = nombre;
    }

    public int getValor() {
        return valorPersonaje;
    }
}
