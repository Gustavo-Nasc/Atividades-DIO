package JUnitMaven;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosDePessoaTest {
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Gustavo", LocalDate.now()));
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removeDados(new Pessoa("Gustavo", LocalDate.now()));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
    }

    @Test
    void validaNumeros() {
        assertEquals(1, 1.0);
    }

    @AfterAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }

}
