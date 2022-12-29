package Conta;

import Cliente.Cliente;
import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        JOptionPane.showMessageDialog(null,
                "===== Extrato Conta Corrente =====\n"
                        + this.formatarExtrato(extrato)
        );
    }
}