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
	private int tempoExperiencia;
	private List<String> tecnologiasDominio = new ArrayList<>();
	private List<Idioma> idiomas = new ArrayList<>();
	
	private List<FormacaoAcademica> formacaoAcademica = new ArrayList<>();
	private List<ExperienciaProfissional> experienciaProfissional = new ArrayList<>();

	// Métodos Construtores
	
	// Sem parâmetro
	public Desenvolvedor() {
		
	}

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
	public int getTempoExperiencia() {
		return tempoExperiencia;
	}
	public void setTempoExperiencia(int tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
	public List<String> getTecnologiasDominio() {
		return tecnologiasDominio;
	}
	public List<Idioma> getIdiomas() {
		return idiomas;
	}
	public List<FormacaoAcademica> getFormacaoAcademica() {
		return formacaoAcademica;
	}
	public List<ExperienciaProfissional> getExperienciaProfissional() {
		return experienciaProfissional;
	}
	
	// Métodos adicionais
	public void adicionarFormacaoAcadêmica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica.add(formacaoAcademica);
	}

	public void adicionarExperienciaProfissional(ExperienciaProfissional experienciaProfissional) {
		this.experienciaProfissional.add(experienciaProfissional);
	}

	public void adicionarTecnologiaDominio(String tecnologiaDominio) {
		this.tecnologiasDominio.add(tecnologiaDominio);
	}

	public void adicionarIdioma(Idioma idioma) {
		this.idiomas.add(idioma);
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
			"Nome:\n" + nome + "\n\n"
			+ "Biografia:\n" + biografia + "\n\n"
			+ "Email:\n" + email + "\n\n"
			+ "Disponibilidade para ofertas de emprego?\n" + disponibilidadeOfertasEmprego + "\n\n"
			+ "Cidade:\n" + cidade + "\n\n"
			+ "Celular de Contato:\n" + this.getCelularContato() + "\n\n"
			+ "Pretenção Salarial:\nR$ " + formatoMonetario.format(pretensaoSalarial) + "\n\n"
			+ "GitHub:\n" +  linkGithub + "\n\n"
			+ "LinkedIn:\n" + linkLinkedin + "\n\n"
			+ "Tempo de Experiência:\n" + tempoExperiencia + "\n\n"
			
			+ "Tecnologias de Domínio:\n"
			+ tecnologiasDominio.toString() + "\n\n"
			
			+ "Idiomas:\n"
			+ idiomas.toString() + "\n\n"
			
			+ formacaoAcademica.toString() + "\n\n"
			
			+ experienciaProfissional.toString()
		);
		
		return formatacaoDesenvolvedor.toString();
	}
}
