package JUnitMaven;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = java.util.logging.Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        // Insere pessoa no DB
        LOGGER.info("Dados inseridos");
    }

    public static void removeDados(Pessoa pessoa) {
        // Remove pessoa do DB
        LOGGER.info("Dados removidos");
    }

}
