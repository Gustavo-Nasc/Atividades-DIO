# Java

## Curso: Testes Unitários com JUnit

### Aula 06 - Testando Exceptions

Vamos pensar que, em algum caso hipotético, nós executamos uma operação e, ao invés de recebermos aquilo esperado, nós recebemos uma Exception como resposta.

Nós podemos também testar esses cenários de Exceções quando acontecem.

Supomos que temos uma Classe responsável pela Transferência entre Contas.

Essa classe terá um método responsável pela transferência monetária entre duas contas.

Esse método precisa verificar se o valor da transferência será maior do que 0, do contrário, o método irá lançar uma nova *IllegalArgumentException*, informando que o valor da transferência não pode ser menor do que 0.

**Consulte os arquivos: *[TransferenciaEntreContas.java](./JUnitMaven/src/main/java/JUnitMaven/TransferenciaEntreContas.java)* e *[ExceptionsTest.java](./JUnitMaven/src/test/java/JUnitMaven/ExceptionsTest.java)***

```java
package JUnitMaven;

public class TransferenciaEntreContas {
    public void transfere(Conta contaOrigem, Conta contaDestino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de Transferência não pode ser menor do que 0");
        }
    }
}
```

#### assertThrows

Agora, tendo em vista que nós precisamos testar esse cenário de Exceção, nós criamos uma nova Classe, para testar esse cenário.

Essa Classe terá um método que validará esse cenário de teste.

Esse método irá criar a Conta de origem e destino, além da Transferência, e, por meio do método *assertThrows* da classe *Assertions*, se a Exceção é lançada como resposta. Esse método recebe dois parâmetros: A Exceção que queremos verificar e o método que desejamos testar.

```java
package JUnitMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("67890", 100);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> transferencia.transfere(contaOrigem, contaDestino, -1)
        );
    }
}
```

#### assertDoesNotThrow

Outro cenário de execução para verificar Exceções é o *assertDoesNotThrow*. Ele valida se uma operação não retorna uma Exceção.

```java
@Test
void validarCenarioExcecaoNaTransferencia() {
    Conta contaOrigem = new Conta("12345", 0);
    Conta contaDestino = new Conta("67890", 100);

    TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

    Assertions.assertDoesNotThrow(
            () -> transferencia.transfere(contaOrigem, contaDestino, 1)
    );
}
```