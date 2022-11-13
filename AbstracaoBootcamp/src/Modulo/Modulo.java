package Modulo;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
	// Atributos da Classe
	private String titulo;
	private List<Curso> listaCursos = new ArrayList<>();
	private int quantidadeCursos = 0;
	private List<Atividade> listaAtividades = new ArrayList<>();
	private int quantidadeAtividades = 0;
	
	// Método Construtor sem Parâmetro
	public Modulo() {
		
	}
	
	// Métodos de Acesso
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQuantidadeCursos() {
		return quantidadeCursos;
	}
	
	// Métodos adicionais
	public void adicionarCurso(Curso curso) {
		this.listaCursos.add(curso);
		this.quantidadeCursos++;
	}
	public void adicionarAtividade(Atividade atividade) {
		this.listaAtividades.add(atividade);
		this.quantidadeAtividades++;
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
	
	// 'Override' para reescrever a função 'toString'
	public String toString() {
		StringBuilder formatacaoModulo = new StringBuilder();
		
		formatacaoModulo.append(
			titulo + " - " + quantidadeCursos + " Curso - " + quantidadeAtividades + " Atividades/Desafios\n\n"
			+ "Cursos:\n\n"
			+ formatarLista(listaCursos) + "\n"
			+ "Atividades:\n\n"
			+ formatarLista(listaAtividades)
		);
		
		return formatacaoModulo.toString();
	}
}
