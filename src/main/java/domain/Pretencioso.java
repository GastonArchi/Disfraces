package domain;

import java.time.Duration;
import java.time.LocalDate;

public class Pretencioso implements Mania {




    public boolean satisfaccion(Invitado unInvitado, Disfraz unDisfraz) {
        return Duration.between(unDisfraz.getFechaConfeccion(), LocalDate.now()).toDays() > 30 && unDisfraz.puntosDisfraz(unInvitado) >= 10;
    }
}
