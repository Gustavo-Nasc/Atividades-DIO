package AbstracaoBootcamp;

import java.util.ArrayList;
import java.util.List;

import AbstracaoBootcamp.Desenvolvedor.Desenvolvedor;
import AbstracaoBootcamp.Modulo.Atividade;

public class Bootcamp {
	private String nome;
	private String nivel;
	private String cargaHoraria;
	
	private List<Atividade> atividades = new ArrayList<>();
	private List<Desenvolvedor> devsIncritos = new ArrayList<>();
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
	public List<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	public List<Desenvolvedor> getDevsIncritos() {
		return devsIncritos;
	}
	public void setDevsIncritos(List<Desenvolvedor> devsIncritos) {
		this.devsIncritos = devsIncritos;
	}
	
	
	
}
