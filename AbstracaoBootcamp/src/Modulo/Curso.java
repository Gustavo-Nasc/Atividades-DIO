package Modulo;

import java.util.ArrayList;
import java.util.List;

import Mentoria.Professor;

public class Curso {
	// Atributos da Classe
	private String nome;
	private String nivel;
	private int cargaHoraria;
	private Professor professor;
	private List<Aula> aulas = new ArrayList<>();
	
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
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	// Métodos adicionais
	public void adicionarAula(Aula aula) {
		this.aulas.add(aula);
	}
	
	public String formatarListas(List<?> lista) {
		StringBuilder formatacaoLista = new StringBuilder();
		
		for (int i = 0; i < lista.size(); i++) {
			formatacaoLista.append(
				lista.get(i)
			);
		}
		
		return formatacaoLista.toString();
	}
	
	// Override do Método 'toString'
	public String toString() {
		StringBuilder formatacaoCurso = new StringBuilder();
		
		formatacaoCurso.append(
			nome + " - " + nivel + " - " + cargaHoraria + " hrs"
			+ "\nLecionador:\n" + professor + "\n\n"
		);
		
		return formatacaoCurso.toString();
	}
	
	public String retornarCursoDetalhado() {
		StringBuilder formatacaoCurso = new StringBuilder();
		
		formatacaoCurso.append(
			nome + " - " + nivel + " - " + cargaHoraria + " hrs"
			+ "\nLecionador:\n" + professor + "\n"
			+ "\nAulas:\n"
			+ formatarListas(aulas) + "\n"
		);
		
		return formatacaoCurso.toString();
	}
}
