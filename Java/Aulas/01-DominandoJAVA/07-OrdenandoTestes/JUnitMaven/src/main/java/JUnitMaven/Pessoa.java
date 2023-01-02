package JUnitMaven;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    // Atributos da Classe
    private String nome;
    private LocalDate nascimento;

    // Método Construtor com parâmetro
    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    // Métodos de Acesso (Getters) para o 'nome' e 'nascimento'
    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    // Cálculo da Idade com o 'LocalDate' e 'ChronoUnit'
    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
