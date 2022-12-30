package JUnitMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10};
        int[] terceiroLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, terceiroLancamento);
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validadarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Gustavo", LocalDate.now());

        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDifernetes() {
        double valor1 = 5.0;
        int valor2 = 5;

        assertEquals(valor1, valor2);
    }

}
