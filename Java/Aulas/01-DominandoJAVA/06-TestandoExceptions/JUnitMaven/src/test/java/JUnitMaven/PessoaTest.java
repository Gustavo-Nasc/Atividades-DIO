package JUnitMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente() {
        Assertions.assertEquals(18, new Pessoa("João", LocalDate.of(2004, 9, 9)).getIdade());
    }

    @Test
    void deveRetonarSeEhMaiorIdade() {
        Assertions.assertTrue(new Pessoa("Cláudio", LocalDate.of(2004, 9, 9)).ehMaiorDeIdade());
    }
}
