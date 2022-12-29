package Conta;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.util.Stack;

import Cliente.Cliente;

public abstract class Conta implements DioAccount {
    Stack<Transacao> extrato = new Stack<Transacao>();

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor, LocalDateTime dataHora) {
        saldo -= valor;
        Transacao saque = new Transacao();
        saque.setTipo("Saque");
        saque.setValor(valor);
        saque.setDataHora(dataHora);

        extrato.push(saque);
    }

    @Override
    public void depositar(double valor, LocalDateTime dataHora) {
        saldo += valor;
        Transacao deposito = new Transacao();
        deposito.setTipo("Depósito");
        deposito.setValor(valor);
        deposito.setDataHora(dataHora);

        extrato.push(deposito);
    }

    @Override
    public void transferir(double valor, DioAccount contaDestino, LocalDateTime dataHora) {
        this.sacar(valor, dataHora);
        contaDestino.depositar(valor, dataHora);
    }

    public void imprimirInfosComuns() {
        JOptionPane.showMessageDialog(null,
                "Titular: " + this.cliente.getNome()
                + "\nAgência: " + this.agencia
                + "\nNúmero: " + this.numero
                + "\nSaldo: " + this.saldo
        );
    }

    public void imprimirExtrato() {
        JOptionPane.showMessageDialog(null,
                "===== Extrato =====\n"
                + this.formatarExtrato(extrato)
        );
    }

    protected String formatarExtrato(Stack<Transacao> extrato) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < extrato.size(); i++) {
            sb.append(extrato.get(i));
        }

        return sb.toString();
    }
}