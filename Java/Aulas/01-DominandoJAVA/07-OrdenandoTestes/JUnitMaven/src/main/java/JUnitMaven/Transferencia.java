package JUnitMaven;

public class Transferencia {
    public void transfere(Conta contaOrigem, Conta contaDestino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de Transferência não pode ser menor do que 0");
        }
    }
}