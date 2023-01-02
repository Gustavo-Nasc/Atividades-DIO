package JUnitMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Administrador")
    void validarSomenteNoUsuarioADM() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "Administrador")
    void validarSomenteNoUsuarioDiferenteDoADM() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
//    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void validarSomenteNoSistemaLinux() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_18)
    void validarSomenteNoJava18() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_18)
    void validarNosJava11ao18() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
