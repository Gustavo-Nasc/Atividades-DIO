# Java

## Curso: Testes Unitários com JUnit

### Aula 04 - After e Before

Imaginenos um cenário hipotético, imaginar que temos uma Classe Responsável pela conexão com o nosso Banco de Dados.

**Consulte os arquivos: *[BancoDeDados.java](./JUnitMaven/src/main/java/JUnitMaven/BancoDeDados.java)* e *[ConsultarDadosDePessoaTest.java](./JUnitMaven/src/test/java/JUnitMaven/ConsultarDadosDePessoaTest.java)***

```java
import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = java.util.logging.Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexão");
    }
}
```

**NÃO ENTRAREMOS NO NÍVEL DE COMPLEXIDADE NESSA AULA A RESPEITO DO LOGGER**

---

Tendo em vista que nós possuímos essa classe, nós precisamos testar a conexão. Para isso, criamos uma nova Classe chamada *ConsultarDadosDePessoaTest*.

#### @BeforeAll e @AfterAll

```java
package JUnitMaven;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }

}
```

Note que utilizamos outros 2 escopos de código, o *@BeforeAll* e o *@AfterAll*.

Em resumo, eles trabalham em ordem de execução, ou seja, o *@Test* será executato depois do *@BeforeAll* e a antes do *@AfterAll*.

Antes de qualquer teste, o *@BeforeAll* é executado como prioridade.
E depois de todos os testes executados, o *@AfterAll* é executado.

---

#### @BeforeEach e @AfterEach

Agora, imaginemos a seguinte situação: Nós, em nossa classe *Banco de Dados* temos os seguintes novos métodos:
```java
public static void insereDados(Pessoa pessoa) {
    // Insere pessoa no DB
    LOGGER.info("Dados inseridos");
}

public static void removeDados(Pessoa pessoa) {
    // Remove pessoa do DB
    LOGGER.info("Dados removidos");
}
```

Daí, para teste, nós sempre queremos, antes de cada *@Test*, nós queremos que uma nova Pessoa seja adicionada em nosso Banco de Dados.
Para solucionar isso, existem duas *Assertions* chamadas *@BeforeEach* e *@AfterEach*. As duas Assertions serão executadas antes e depois de cada teste, ou seja, se tivermos 10 testes em nossa classe teste, os dois escopos serão executados 10 vezes cada também.

```java
@BeforeEach
static void insereDadosParaTeste() {
    BancoDeDados.insereDados(new Pessoa("Gustavo", LocalDate.now()));
}

@AfterEach
static void removeDadosParaTeste() {
    BancoDeDados.removeDados(new Pessoa("Gustavo", LocalDate.now()));
}

```

### OBS
O *@BeforeAll* e o *@AfterAll* são executados uma vez, antes de todos os teste.

O *@BeforeEach* e *@AfterEach* são executados uma vez a cada teste, ou seja, são executados de acordo com a quantidade de testes.