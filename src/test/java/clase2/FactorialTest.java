package clase2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void calculaFactorial() {
        int factorialEsperado = Factorial.calculaFactorial(6);
        int factorialActual = 720;

        assertEquals("factorial incorrecto",factorialActual, factorialEsperado);
    }
}