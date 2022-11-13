package Mentoria;

public class Professor {
	// Atributos da Classe
	private String nome;
	private String empresa;
	
	// Método Construtor sem Parâmetro
	public Professor() {
		
	}
	
	// Métodos de Acesso
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	// 'Override' para reescrever o Método 'toString'
	@Override	
	public String toString() {
		StringBuilder formatacaoProfessor = new StringBuilder();
		
		formatacaoProfessor.append(
			nome + " - " + empresa
		);
		
		return formatacaoProfessor.toString();
	}
	
}
