package Test;
import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import Atividade12_prova.Recursivo;


//Teste da atividade 12_prova
public class RecursivoTest {
    @Test
    public void testMetodoRecursivo() {
        Recursivo recursivo = new Recursivo();

        int m1 = 36;
        int n1 = 92;
        int resultado1 = recursivo.metodoRecursivo(m1, n1);
        int resultadoEsperado1 = 3648;

        System.out.println("Teste 1  m: " + m1 + ", n: " + n1);
        System.out.println("Resultado esperado: " + resultadoEsperado1);
        System.out.println("Resultado obtido: " + resultado1);

        assertEquals(resultadoEsperado1, resultado1);

        int m2 = 53;
        int n2 = 62;
        int resultado2 = recursivo.metodoRecursivo(m2, n2);
        int resultadoEsperado2 = 575;

        System.out.println("Teste 2 - m: " + m2 + ", n: " + n2);
        System.out.println("Resultado esperado: " + resultadoEsperado2);
        System.out.println("Resultado obtido: " + resultado2);

        assertEquals(resultadoEsperado2, resultado2);
    }

    @Test
    public void testMetodoRecursivoRandom() {
        Recursivo recursivo = new Recursivo();
        Random random = new Random();

        int m = random.nextInt(100) + 1;
        int n = random.nextInt(100) + 1;

        int resultado = recursivo.metodoRecursivo(m, n);
        System.out.println("m: " + m + ", n: " + n + ", resultado: " + resultado);
        assertEquals(recursivo.metodoRecursivo(m, n), resultado);
    }
}
