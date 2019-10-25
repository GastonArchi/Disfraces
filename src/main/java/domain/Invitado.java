package domain;

public class Invitado {

    private Disfraz miDisfraz;
    private int edad;
    private Personalidad miPersonalidad;
    private Mania miMania;


    public Invitado(Disfraz miDisfraz, int edad, Personalidad miPersonalidad, Mania miMania) {
        this.miDisfraz = miDisfraz;
        this.edad = edad;
        this.miPersonalidad = miPersonalidad;
        this.miMania = miMania;
    }

    public int getEdad() {
        return edad;
    }

        public int pedirPuntuacionDeDisfraz (){

        return miDisfraz.puntosDisfraz(this);


    }

    public Disfraz getMiDisfraz() {
        return miDisfraz;
    }

    public boolean sosSexy(){

        return miPersonalidad.devolverSexy(this);

    }

    public boolean estasSatisfecho (Invitado unInvitado, Disfraz unDisfraz){

        return miMania.satisfaccion(this, miDisfraz);

    }
}
