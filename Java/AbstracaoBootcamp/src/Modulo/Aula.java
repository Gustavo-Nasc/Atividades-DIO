package Modulo;

public class Aula {
	// Atributos da Classe
	private String titulo;
	private String tempo;
	
	// Método Construtor sem Parâmetro
	public Aula() {
		
	}
	
	// Método Construtor sem Parâmetro
	public Aula(String titulo, String tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	// Métodos de Acesso
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	// 'Override' para reescrever a função 'toString'
	@Override
	public String toString() {
		StringBuilder formatacaoAula = new StringBuilder();
		
		formatacaoAula.append(
			titulo + " - " + tempo + "\n"
		);
		
		return formatacaoAula.toString();
	}
	
}
