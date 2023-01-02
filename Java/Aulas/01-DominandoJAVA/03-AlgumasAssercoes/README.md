# Java

## Curso: Testes Unitários com JUnit

### Aula 03 - Algumas Asserções

Utilizando o mesmo repositório **Maven** da aula anterior, nós podemos testar algumas *Asserções*.

Para testá-las, criei uma nova Classe Teste chamada *AssertionsTest*.

**Consulte o arquivo: *[AssertionsTest](./JUnitMaven/src/test/java/JUnitMaven/AssertionsTest.java)*.**

#### Assertions.assertArrayEquals

A primeira a ser testada será a *assertArrayEquals*, que valida se dois Arrays são iguais.

```java
@Test
void validaArray() {
    int[] primeiroLancamento = {10, 20, 30, 40, 50};
    int[] segundoLancamento = {10, 20, 30, 40, 50};

    Assertions.assertArrayEquals(primeiroLancamento, terceiroLancamento);
}
```

Ao executar o código acima, ele não apresentará erro de teste, pois os dois arrays são iguais, em tamanho e valores.

#### Asserstions.assertNotEquals

Agora nós utilizaremos a *assertNotEquals*, que valida se dois valores/variáveis são diferentes.

```java
@Test
void validarArray() {
    int[] primeiroLancamento = {10, 20, 30, 40, 50};
    int[] segundoLancamento = {-1, 5, 2, 3, 10};

    Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
}
```

Ao rodar o código acima, o mesmo não retornará erro, pois os dois Arrays são diferentes.


#### Assertions.assertNull

O *assertNull*, por sua vez, verifica se uma variável é nula, seja ela de qualquer tipo.

```java
@Test
void validaObjeto() {
    Pessoa pessoa = null;

    Assertions.assertNull(pessoa);
}
```

Executanto o código acima, o mesmo não retornará erro, pois o o Objeto *pessoa* é nulo.

#### Assertions.assertNotNull

Assim como podemos ver se uma variável é nula, podemos verificar se não é nula também;

```java
@Test
void validaObjeto() {
    Pessoa pessoa = new Pessoa("Gustavo", LocalDate.now());

    Assertions.assertNotNull(pessoa);
}
```

#### Assertions.assertEquals

O *assertEquals* foi visto anteriormente, mas vale citar que nele há diversos tipos de sobrecargas, ou seja, há inúmeras formas de utilizar o método para testes.

Para nosso teste, utilizamos o seguinte código

```java
@Test
void validarNumerosDeTiposDifernetes() {
    double valor1 = 5.0;
    int valor2 = 5;

    Assertions.assertEquals(valor1, valor2);
}
```

Ao executá-lo, o mesmo não retornará erros de teste, pois, embora os valores sejam de tipos diferentes, os seus respectivos valores são exatos, com e sem casa decimal.

### OBS

Um detalhe que pode ajudar na hora do desenvolvimento é realizar importações estáticas, apenas dos métodos que iremos utilizar

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Se formos utilizar mais de um método, vale a pena colocar o *, que importará tudo que há na classe

public class AssertionsTest {
    @Test
    void validarNumerosDeTiposDifernetes() {
        double valor1 = 5.0;
        int valor2 = 5;

        assertEquals(valor1, valor2);
    }
}
```