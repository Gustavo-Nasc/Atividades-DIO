# Java

## Curso: Testes Unitários com JUnit

### Aula 07 - Ordenando Testes

Imaginemos que agora nós possuimos mais uma Classe para Testes, e essa Classe possui 4 cenários de Teste.

A ideia, nessa Classe Teste, é definir a ordem da execução dos Testes.

**Consulte o arquivo: *[EscolhendoOrdemTest.java](./JUnitMaven/src/test/java/JUnitMaven/EscolhendoOrdemTest.java)***


#### @TestMethodOrder

Para definir a ordem dos testes, basta passarmos, antes da criação da Classe de Teste, o *@TestMethodOrder*, que é responsável por realizar os testes na ordem passada.

##### OrderAnnotation

Por ordem de anotação, onde, para cada teste, nós passamos um número correspondente a posição dele na ordem.

```java
package JUnitMaven;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoOrdemTest {
    @Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
```

#### MethodName

Outra forma de ordernar os testes é por meio do *MethodName*. Nele, nós não utilizamos o *@Order* como o anterior.

O MethodName olha como o Método foi escrito e escolhe de acordo com a ordem alfabética.

```java
package JUnitMaven;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoOrdemTest {
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }
}
```

#### Random

O *Random*, por sua vez, executa os testes de forma aleatória

```java
package JUnitMaven;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.Random.class)
public class EscolhendoOrdemTest {
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
```

#### DisplayName

O *DisplayName* é um recurso de nomearmos nosso teste de alguma forma, conforme exemplo:

```java
package JUnitMaven;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
@TestMethodOrder(MethodOrderer.DisplayName.class)

public class EscolhendoOrdemTest {
    @DisplayName("A")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}

```

Na execução dos Testes, ele não aparecerá mais como o nome do Método e sim do DisplayName que passamos para o método.

O DisplayName também ordena por ordem alfabética.