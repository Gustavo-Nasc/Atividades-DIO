package Desenvolvedor;

public class Idioma {
    // Atributos da Classe
    private String idioma;
    private String nivel;

    // Método Construtor sem parâmetro
    public Idioma() { 

    }

    // Métodos de Acesso
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    // Override do Método 'toString'
    @Override
    public String toString() {
        StringBuilder formatacaoIdioma = new StringBuilder();
        
        formatacaoIdioma.append(
            idioma + " - " + nivel + "\n"
        );

        return formatacaoIdioma.toString();
    }
}
