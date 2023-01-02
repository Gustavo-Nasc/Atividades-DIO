package JUnitMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioExcecaoNaTransferencia1() {
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("67890", 100);

        Transferencia transferencia = new Transferencia();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> transferencia.transfere(contaOrigem, contaDestino, -1)
        );
    }

    @Test
    void validarCenarioExcecaoNaTransferencia2() {
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("67890", 100);

        Transferencia transferencia = new Transferencia();

        Assertions.assertDoesNotThrow(
                () -> transferencia.transfere(contaOrigem, contaDestino, 1)
        );
    }
}
