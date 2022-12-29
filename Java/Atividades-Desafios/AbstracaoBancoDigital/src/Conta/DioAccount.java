package Conta;

import java.time.LocalDateTime;

public interface DioAccount {
    void sacar(double valor, LocalDateTime dataHora);

    void depositar(double valor, LocalDateTime dataHora);

    void transferir(double valor, DioAccount contaDestino, LocalDateTime dataHora);

    void imprimirExtrato();
}
