package AbstracaoBootcamp.Mentoria;

public class Curso {
	// Atributos da Classe
	private String nome;
	private String nivel;
	private String cargaHoraria;
	
	// Métodos de Acesso da Classe
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	// Override do Método 'toString'
	public String toString() {
		StringBuilder formatacaoCurso = new StringBuilder();
		
		formatacaoCurso.append(
			nome + " - " + nivel + " - " + cargaHoraria
		);
		
		return formatacaoCurso.toString();
	}
}
