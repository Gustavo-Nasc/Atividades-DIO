package Desenvolvedor;

public class ExperienciaProfissional {
	// Atributos da Classe
	private String empresa;
	private String cargo;
	private String descricaoCargo;
	private String dataEntrada;
	private String dataSaida;

	// Método Construtor sem Parâmetro
	public ExperienciaProfissional() {
		
	}
	
	// Métodos de Acesso da Classe
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDescricaoCargo() {
		return descricaoCargo;
	}
	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	// Override do Método 'toString'
	@Override
	public String toString() {
		StringBuilder formatamacaoExperiencia = new StringBuilder();
		
		formatamacaoExperiencia.append(
				"Experiência Profissinal:\n"
				+ empresa + "\n\n"
				+ cargo + "\n"
				+ descricaoCargo + "\n"
				+ "(" + dataEntrada + " - " + dataSaida + ")"
			);
		
		return formatamacaoExperiencia.toString();
	}
}
