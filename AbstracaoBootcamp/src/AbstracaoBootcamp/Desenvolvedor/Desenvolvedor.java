package AbstracaoBootcamp.Desenvolvedor;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {
	// Atributos da Classe de Desenvolvedor
	private String nome;
	private String biografia;
	private String email;
	private boolean disponibilidadeOfertasEmprego;
	private String cidade;
	private String celularContato;
	private String linkGithub;
	private String linkLinkedin;
	private double pretensaoSalarial;
	private String tempoExperiencia;
	private List<String> tecnologiasDominio = new ArrayList<>();
	private List<String> idiomas = new ArrayList<>();
	
	private List<FormacaoAcademica> formacaoAcademica = new ArrayList<>();
	private List<ExperienciaProfissional> experienciaProfissional = new ArrayList<>();
	
	// Métodos de Acesso da Classe
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isDisponibilidadeOfertasEmprego() {
		return disponibilidadeOfertasEmprego;
	}
	public void setDisponibilidadeOfertasEmprego(boolean disponibilidadeOfertasEmprego) {
		this.disponibilidadeOfertasEmprego = disponibilidadeOfertasEmprego;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCelularContato() {
		return celularContato;
	}
	public void setCelularContato(String celularContato) {
		this.celularContato = celularContato;
	}
	public String getLinkGithub() {
		return linkGithub;
	}
	public void setLinkGithub(String linkGithub) {
		this.linkGithub = linkGithub;
	}
	public String getLinkLinkedin() {
		return linkLinkedin;
	}
	public void setLinkLinkedin(String linkLinkedin) {
		this.linkLinkedin = linkLinkedin;
	}
	public double getPretensaoSalarial() {
		return pretensaoSalarial;
	}
	public void setPretensaoSalarial(double pretensaoSalarial) {
		this.pretensaoSalarial = pretensaoSalarial;
	}
	public String getTempoExperiencia() {
		return tempoExperiencia;
	}
	public void setTempoExperiencia(String tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
	public List<String> getTecnologiasDominio() {
		return tecnologiasDominio;
	}
	public void setTecnologiasDominio(List<String> tecnologiasDominio) {
		this.tecnologiasDominio = tecnologiasDominio;
	}
	public List<String> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}
	public List<FormacaoAcademica> getFormacaoAcademica() {
		return formacaoAcademica;
	}
	public void setFormacaoAcademica(List<FormacaoAcademica> formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}
	public List<ExperienciaProfissional> getExperienciaProfissional() {
		return experienciaProfissional;
	}
	public void setExperienciaProfissional(List<ExperienciaProfissional> experienciaProfissional) {
		this.experienciaProfissional = experienciaProfissional;
	}
	
	// Override da Função 'toString' do Desenvolvedor
	@Override
	public String toString() {
		StringBuilder formatacaoDesenvolvedor = new StringBuilder();
		
		formatacaoDesenvolvedor.append(
			"Nome: " + nome
			+ "\nEmail: " + email
			+ "\nGitHub: " + linkGithub
			+ "\nLinkedIn: " + linkLinkedin
			+ "\nCelular de Contato: " + celularContato
		);
		
		return formatacaoDesenvolvedor.toString();
	}
	
	public String retornarDadosCompletos() {
		StringBuilder formatacaoDesenvolvedor = new StringBuilder();
		
		DecimalFormat formatoMonetario = new DecimalFormat();
		
		formatacaoDesenvolvedor.append(
			"Nome: " + nome + "\n"
			+ "Biografia: " + biografia + "\n"
			+ "Email: " + email + "\n"
			+ "Disponibilidade para ofertas de emprego? " + disponibilidadeOfertasEmprego + "\n"
			+ "Cidade: " + cidade + "\n"
			+ "Celular de Contato: " + this.getCelularContato() + "\n"
			+ "Pretenção Salarial: R$ " + formatoMonetario.format(pretensaoSalarial) + "\n"
			+ "GitHub: " +  linkGithub + "\n"
			+ "LinkedIn: " + linkLinkedin + "\n"
			+ "Tempo de Experiência: " + tempoExperiencia + "\n\n"
			
			+ "Tecnologias de Domínio:\n"
			+ tecnologiasDominio.toString() + "\n\n"
			
			+ "Idiomas:\n"
			+ idiomas.toString() + "\n\n"
			
			+ "Formação Acadêmica:\n"
			+ formacaoAcademica.toString() + "\n\n"
			
			+ "Experiência Profissional:\n"
			+ experienciaProfissional.toString()
		);
		
		return formatacaoDesenvolvedor.toString();
	}
}
