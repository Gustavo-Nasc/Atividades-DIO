package AbstracaoBootcamp.Desenvolvedor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExperienciaProfissional {
	// Atributos da Classe
	private String empresa;
	private String cargo;
	private String descricaoCargo;
	private Date dataEntrada;
	private Date dataSaida;
	
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
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	// Override do Método 'toString'
	@Override
	public String toString() {
		StringBuilder formatamacaoExperiencia = new StringBuilder();
		
		String formatoData = "MMMM-yyyy";
		SimpleDateFormat formatadorData = new SimpleDateFormat(formatoData);
		String dataEntrada = formatadorData.format(this.getDataEntrada());
		String dataSaida = formatadorData.format(this.getDataSaida());
		
		formatamacaoExperiencia.append(
				"Formação Acadêmica:\n\n"
				+ this.getEmpresa() + "\n"
				+ this.getCargo() + "\n"
				+ this.getDescricaoCargo() + "\n"
				+ "(" + dataEntrada + " - " + dataSaida + ")"
			);
		
		return formatamacaoExperiencia.toString();
	}
}
