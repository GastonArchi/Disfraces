package domain;

import java.time.Duration;
import java.time.LocalDate;


public class Tobara implements CaracteristicasDisfraz {

    private LocalDate diaDeLaCompra;

    public int devolverPuntos(Invitado unInvitado) {

        if (Duration.between(diaDeLaCompra, LocalDate.now()).toDays() > 2 ){

            return 5;
        }else
            return 3;

    }
}
