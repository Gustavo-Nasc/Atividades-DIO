package Conta;

import Cliente.Cliente;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        JOptionPane.showMessageDialog(null,
                "===== Extrato Conta Poupança =====\n"
                        + this.formatarExtrato(extrato)
        );
    }
}