package clase2.metodos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VerificacionCreditoInstantaneoTest {

    @Test
    public void esUsuarioCalificado() {
        boolean calificado = VerificacionCreditoInstantaneo.esUsuarioCalificado(25000, 800);
        boolean esperado = true;
        Assert.assertEquals(calificado, esperado);
    }

    @Test
    public void noCalificadoTest() {
        boolean resultadoActual = VerificacionCreditoInstantaneo.esUsuarioCalificado(25000, 600);
        Assert.assertFalse(resultadoActual);
        Double salarioRequerido = VerificacionCreditoInstantaneo.salarioRequerido;
        Double salarioEsperado = 25000.0;
        Assert.assertEquals(salarioEsperado, salarioRequerido);
    }
}