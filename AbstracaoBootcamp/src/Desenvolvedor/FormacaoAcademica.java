package Desenvolvedor;

public class FormacaoAcademica {
	// Atributos da Classe
	private String instituicaoEnsino;
	private String nivelFormacao;
	private String nomeCurso;
	private String dataInicio;
	private String dataConclusao;

	// Método Construtor sem Parâmetro
	public FormacaoAcademica() {
		
	}
	
	// Métodos de Acesso da Classe
	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}
	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}
	public String getNivelFormacao() {
		return nivelFormacao;
	}
	public void setNivelFormacao(String nivelFormacao) {
		this.nivelFormacao = nivelFormacao;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(String dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	
	// Override do Método 'toString'
	@Override
	public String toString() {
		StringBuilder formatamacaoFormacao = new StringBuilder();
		
		formatamacaoFormacao.append(
			"Formação Acadêmica:\n\n"
			+ this.getInstituicaoEnsino() + "\n"
			+ this.getNomeCurso() + " " + this.getNivelFormacao() + "\n"
			+ "(" + dataInicio + " - " + dataConclusao + ")"
		);
		
		return formatamacaoFormacao.toString();
	}
}
