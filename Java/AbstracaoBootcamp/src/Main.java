import javax.swing.JOptionPane;

import Desenvolvedor.Desenvolvedor;
import Desenvolvedor.ExperienciaProfissional;
import Desenvolvedor.FormacaoAcademica;
import Desenvolvedor.Idioma;
import Mentoria.Professor;
import Modulo.Atividade;
import Modulo.Aula;
import Modulo.Curso;
import Modulo.Modulo;

public class Main {
	public static void main(String[] args) {
        // Criando 'Dev' inscrito no Bootcamp

        // Formação Acadêmica
        FormacaoAcademica formacaoAcademicaDev = new FormacaoAcademica();
        formacaoAcademicaDev.setNomeCurso("MTEC - NovoTec | Análise e Desenvolvimento de Sistemas");
        formacaoAcademicaDev.setInstituicaoEnsino("ETEC Cidade Tiradentes");
        formacaoAcademicaDev.setNivelFormacao("Técnico");
        formacaoAcademicaDev.setDataInicio("02/2021");
        formacaoAcademicaDev.setDataConclusao("12/2021");

        // Experiência Profissional
        ExperienciaProfissional experienciaProfissionalDev = new ExperienciaProfissional();
        experienciaProfissionalDev.setEmpresa("Carrefour - Itaquera");
        experienciaProfissionalDev.setCargo("Assistente de Caixa");
        experienciaProfissionalDev.setDescricaoCargo(
            "Atendimento ao Consumidor;\n"
            + "Gerenciamento de Caixa\n"
            + "Gerenciamento de Sistema Comercial\n"
            + "Gestão de Estoque\n"
        );
        experienciaProfissionalDev.setDataEntrada("02/2020");
        experienciaProfissionalDev.setDataSaida("06/2022");

        // Idioma
        Idioma idioma1Dev = new Idioma();
        idioma1Dev.setIdioma("Inglês");
        idioma1Dev.setNivel("Intermediário");

        Idioma idioma2Dev = new Idioma();
        idioma2Dev.setIdioma("Português");
        idioma2Dev.setNivel("Nativo");

        Desenvolvedor dev = new Desenvolvedor();
        dev.setNome("Gustavo Nascimento Souza");
        dev.setBiografia("Estudante de Tecnologia da Informação pela FATEC Zona Leste, no curso de Desenvolvimento de Software Multiplataforma");
        dev.setCelularContato("(11) 98765-4321");
        dev.setCidade("São Paulo - SP");
        dev.setEmail("gustavo.ns@outlook.com.br");
        dev.setDisponibilidadeOfertasEmprego(true);
        dev.setLinkGithub("https://github.com/Gustavo-Nasc");
        dev.setLinkLinkedin("https://www.linkedin.com/in/gustanascsouza");
        dev.setPretensaoSalarial(1100);
        dev.setTempoExperiencia(0);
        dev.adicionarExperienciaProfissional(experienciaProfissionalDev);
        dev.adicionarFormacaoAcadêmica(formacaoAcademicaDev);
        dev.adicionarTecnologiaDominio("HTML");
        dev.adicionarTecnologiaDominio("CSS");
        dev.adicionarTecnologiaDominio("JavaScript");
        dev.adicionarTecnologiaDominio("TypeScript");
        dev.adicionarIdioma(idioma1Dev);
        dev.adicionarIdioma(idioma2Dev);

        // Impressão do Desenvolvedor
        JOptionPane.showMessageDialog(null, dev.retornarDadosSemicompletos(), "Desenvolvedor 1", 1);
        
        // Criando Aulas - Instâncias de Aulas
        Aula aula1 = new Aula("Classe - Conceitos", "10:15");
        Aula aula2 = new Aula("Atributo - Conceitos", "08:37");
        Aula aula3 = new Aula("Método - Conceitos", "19:20");
        Aula aula4 = new Aula("Objeto e Mensagem - Conceitos", "10:18");
        Aula aula5 = new Aula("Herança - Conceitos", "05:33");
        Aula aula6 = new Aula("Herança - Tipos", "05:15");
        Aula aula7 = new Aula("Herança - Upcast e Downcast", "06:05");
        Aula aula8 = new Aula("Herança - Polimorismo e Sobrescrita", "08:01");
        Aula aula9 = new Aula("Associação - Conceito", "01:43");
        Aula aula10 = new Aula("Associação - Tipos", "10:02");
        Aula aula11 = new Aula("Interface - Conceito", "06:43");
        Aula aula12 = new Aula("Pacotes - Conceito", "06:38");
        Aula aula13 = new Aula("Visibilidades - Conceito", "08:10");
        
        // Criando um novo curso
        Curso curso = new Curso();
        curso.setNome("Programação Orientada a Objetos");
        curso.setNivel("Intermediário");
        curso.setCargaHoraria(4);
        curso.adicionarAula(aula1);
        curso.adicionarAula(aula2);
        curso.adicionarAula(aula3);
        curso.adicionarAula(aula4);
        curso.adicionarAula(aula5);
        curso.adicionarAula(aula6);
        curso.adicionarAula(aula7);
        curso.adicionarAula(aula8);
        curso.adicionarAula(aula9);
        curso.adicionarAula(aula10);
        curso.adicionarAula(aula11);
        curso.adicionarAula(aula12);
        curso.adicionarAula(aula13);
        
        // Criando um professor a ser inserido para o Curso
        Professor professorCurso = new Professor();
        professorCurso.setNome("Thiago Leite");
        professorCurso.setEmpresa("Serpro");
        
        // Adicionando Professor ao Curso
        curso.setProfessor(professorCurso);
        
        JOptionPane.showMessageDialog(null, curso.retornarCursoDetalhado(), "Curso 1", 1);
        
        // Criando Atividade a ser inserida no Módulo
        Atividade atividade1 = new Atividade();
        atividade1.setTitulo("Abstraindo um Bootcamp Usando Orientação a Objetos em Java");
        atividade1.setDescricao(
        	"Desmistifique a Programação Orientada a Objetos (POO) com Java e pratique esse conceito fundamental nesse desafio.\n"
        	+ "Para isso, os pilares da OO são devidamente formalizados: Abstração, Encapsulamento, Herança e Polimorfismo.\n"
        	+ "Neste desafio, você poderá desenvolver sua capacidade de abstração com um problema real e implementar as evoluções que achar interessantes"
        );
        
        // Criando um Módulo para adicionar o Curso e a Atividade
        Modulo modulo = new Modulo();
        modulo.setTitulo("Programação Orientada a Objetos com Java");
        modulo.adicionarCurso(curso);
        modulo.adicionarAtividade(atividade1);
        
        // Impressão do Módulo
        JOptionPane.showMessageDialog(null, modulo.toString(), "Módulo 1", 1);
     
        
        // Finalizando, Instanciando um Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("Potência Tech powered by iFood - Java Beginners");
        bootcamp.setNivel("Básico");
        bootcamp.setCargaHoraria(91);
        bootcamp.adicionarDesenvolvedor(dev);
        bootcamp.adicionarModulo(modulo);
        
        JOptionPane.showMessageDialog(null, bootcamp.toString(), "Bootcamp", 1);
        
    }
}