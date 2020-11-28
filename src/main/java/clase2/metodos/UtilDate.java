package clase2.metodos;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class UtilDate {

    public static long calcularDiferenciaDias(LocalDate fechaInicio, LocalDate fechaFin) {
        return DAYS.between(fechaInicio, fechaFin);
    }
}
