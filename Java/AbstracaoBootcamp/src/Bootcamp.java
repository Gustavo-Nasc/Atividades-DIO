import java.util.ArrayList;
import java.util.List;

import Desenvolvedor.Desenvolvedor;
import Modulo.Modulo;

public class Bootcamp {
	// Atributos da Classe
	private String titulo;
	private String nivel;
	private int cargaHoraria;
	private List<Desenvolvedor> devsInscritos = new ArrayList<>();
	private int quantidadeDevsInscritos = 0;
	private List<Modulo> modulos = new ArrayList<>();
	
	// Método Construtor sem Parâmetro
	public Bootcamp() {
		
	}
	
	// Métodos de Acesso
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	// Métodos adicionais
	public void adicionarDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.devsInscritos.add(desenvolvedor);
		this.quantidadeDevsInscritos++;
	}
	public void adicionarModulo(Modulo modulo) {
		this.modulos.add(modulo);
	}
	public String formatarLista(List<?> lista) {
		StringBuilder formatacaoLista = new StringBuilder();
		
		for (int i = 0; i < lista.size(); i++) {
			formatacaoLista.append(
				lista.get(i)
			);
		}
		
		return formatacaoLista.toString();
	}
	
	// 'Override' para reescrever o Método 'toString'
	public String toString() {
		StringBuilder formatacaoBootcamp = new StringBuilder();
		
		formatacaoBootcamp.append(
			"Bootcamp:\n\n"
			+ titulo + "\n"
			+ nivel + " - " + cargaHoraria + " hrs - " + quantidadeDevsInscritos + " Dev(s) já se inscreveram"
			+ "\n" + formatarLista(devsInscritos)
			+ "\n" + formatarLista(modulos)
			
		);
		
		return formatacaoBootcamp.toString();
	}
	
}
