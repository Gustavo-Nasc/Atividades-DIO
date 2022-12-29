package Cliente;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Cliente {

    private String nome;
    private String cpf;
    private String rg;

    public Cliente(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    Pattern formatoRG = Pattern.compile("(^\\d{1,2}).?(\\d{3}).?(\\d{3})-?(\\d{1}|X|x$)");
    Pattern formatoCPF = Pattern.compile("(^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$)");

    public void imprimirDadosCliente() {
        JOptionPane.showMessageDialog(null,
                "Nome: " + this.nome
                + "\nRG: " + String.format(this.rg, formatoRG)
                + "\nCPF: " + String.format(this.rg, formatoRG)
        );
    }
}