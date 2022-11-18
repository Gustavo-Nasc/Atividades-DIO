package Modulo;

public class Atividade {
	// Atributos da Classe
	private String titulo;
	private String descricao;
	
	// Método Construtor sem Parâmetro
	public Atividade() {
		
	}
	
	// Métodos de Acesso
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// 'Override' para reescrever o Método 'toString'
	@Override
	public String toString() {
		StringBuilder formatacaoAtividade = new StringBuilder();
		
		formatacaoAtividade.append(
			titulo + "\n"
		);
		
		return formatacaoAtividade.toString();
	}
	
	public String retornarAtividadeCompleta() {
		StringBuilder formatacaoAtividade = new StringBuilder();
		
		formatacaoAtividade.append(
			titulo + "\n"
			+ descricao + "\n"
		);
		
		return formatacaoAtividade.toString();
	}
}
