package AbstracaoBootcamp.Desenvolvedor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormacaoAcademica {
	// Atributos da Classe
	private String instituicaoEnsino;
	private String nivelFormacao;
	private String nomeCurso;
	private Date dataInicio;
	private Date dataConclusao;
	
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
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	
	// Override do Método 'toString'
	@Override
	public String toString() {
		StringBuilder formatamacaoFormacao = new StringBuilder();
		
		String formatoData = "MMMM-yyyy";
		SimpleDateFormat formatadorData = new SimpleDateFormat(formatoData);
		String dataInicio = formatadorData.format(this.getDataInicio());
		String dataConclusao = formatadorData.format(this.getDataConclusao());
		
		formatamacaoFormacao.append(
			"Formação Acadêmica:\n\n"
			+ this.getInstituicaoEnsino() + "\n"
			+ this.getNomeCurso() + " " + this.getNivelFormacao() + "\n"
			+ "(" + dataInicio + " - " + dataConclusao + ")"
		);
		
		return formatamacaoFormacao.toString();
	}
}
