import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DataEstendida {
    private LocalDateTime entrada;

    public DataEstendida(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public String formataPadraoBrasileiro() {
        return entrada.getDayOfMonth() + "/"
             + entrada.getMonthValue() + "/"
             + entrada.getYear() + " "
             + entrada.getHour() + ":"
             + String.format("%02d", entrada.getMinute());
    }

    public boolean isHorarioEspecial() {
        if(entrada.getDayOfWeek() == DayOfWeek.SATURDAY
                || entrada.getDayOfWeek() == DayOfWeek.SUNDAY
                || entrada.getHour() < 7
                || entrada.getHour() >= 22)
            return true;
        return false;
    }
}
