package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class Testeo {
    private Disfraz elDisfraz;
    private Invitado elInvitado;
    private Personalidad laPersonalidad;
    private Mania laMania;
    private CaracteristicasDisfraz laCaracteristica;
    private Disfraz otroDisfraz;
    private Invitado otroInvitado;
    private Personalidad otraPersonalidad;
    private Mania otraMania;
    private CaracteristicasDisfraz otraCaracteristica;
    private Fiesta laFiesta;



    @Before
    public void init(){
        this.elDisfraz = new Disfraz("DisfrazDeGary", LocalDate.of(2018, Month.MAY, 14),elInvitado);
        this.elInvitado = new Invitado(elDisfraz, 34,laPersonalidad,laMania);
        this.laPersonalidad = new Alegre();
        this.laMania = new Caprichoso();
        this.laCaracteristica = new Gracioso(8);
        this.otroDisfraz = new Disfraz("DisfrazDeRicardoFortx", LocalDate.of(2019, Month.MAY, 16),otroInvitado);
        this.otroInvitado = new Invitado(elDisfraz, 25,otraPersonalidad,otraMania);
        this.otraPersonalidad = new Taciturno();
        this.otraMania = new Caprichoso();
        this.otraCaracteristica = new Gracioso(10);
        this.laFiesta = new Fiesta("Moreno",LocalDate.now());
    }

    @Test
    public void Test1(){
        /*Determinar el puntaje de un disfraz.*/

        /*le damos caracteristicas al Disfraz*/


        elDisfraz.addCaracteristica(laCaracteristica);

        Assert.assertEquals(8, this.elDisfraz.puntosDisfraz(elInvitado));

    }

    @Test
    public void Test2(){
        /*Saber si una fiesta es un bodrio, esto ocurre cuando todos los asistentes están disconformes con su disfraz.*/

        /*le damos caracteristicas a los Disfraces*/

        elDisfraz.addCaracteristica(laCaracteristica);
        otroDisfraz.addCaracteristica(otraCaracteristica);

        laFiesta.addInvitado(elInvitado);
        laFiesta.addInvitado(otroInvitado);


        Assert.assertTrue(this.laFiesta.chequearSiLaFiestaEsUnBodrio(laFiesta));

    }



}
