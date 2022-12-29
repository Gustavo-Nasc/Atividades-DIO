package Conta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private LocalDateTime dataHora;
    private double valor;
    private String tipo;

    public Transacao() {}

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

//    String dataHoraFormatado = this.dataHora.format(formatter);

    @Override
    public String toString() {
        return "Data e Hora da transação: " + dataHora + "\nValor: " + this.valor + "\nTipo de transação: " + tipo + "\n\n";
    }
}
