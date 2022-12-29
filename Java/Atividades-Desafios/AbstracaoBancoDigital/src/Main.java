import Cliente.Cliente;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Cliente gustavo = new Cliente("Gustavo", "489.076.780-06", "28.235.862-6");

        Conta corrente = new ContaCorrente(gustavo);
        Conta poupanca = new ContaPoupanca(gustavo);

        corrente.depositar(200, LocalDateTime.now());
        corrente.transferir(100, poupanca, LocalDateTime.now());

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();


    }

}