package JUnitMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    void validarSomenteNoUsuarioDiferenteDoAdmnistrador() {
        Assumptions.assumeFalse("Administrador".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
