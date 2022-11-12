package AbstracaoBootcamp;

import javax.swing.JOptionPane;

import AbstracaoBootcamp.Desenvolvedor.Desenvolvedor;
import AbstracaoBootcamp.Desenvolvedor.ExperienciaProfissional;
import AbstracaoBootcamp.Desenvolvedor.FormacaoAcademica;
import AbstracaoBootcamp.Desenvolvedor.Idioma;

public class Main {
	public static void main(String[] args) {
        // Criando o 1º 'Dev' inscrito no Bootcamp

        // Formação Acadêmica
        FormacaoAcademica formacaoAcademicaDev1 = new FormacaoAcademica();
        formacaoAcademicaDev1.setNomeCurso("MTEC - NovoTec | Análise e Desenvolvimento de Sistemas");
        formacaoAcademicaDev1.setInstituicaoEnsino("ETEC Cidade Tiradentes");
        formacaoAcademicaDev1.setNivelFormacao("Técnico");
        formacaoAcademicaDev1.setDataInicio("02/2021");
        formacaoAcademicaDev1.setDataConclusao("12/2021");

        // Experiência Profissional
        ExperienciaProfissional experienciaProfissionalDev1 = new ExperienciaProfissional();
        experienciaProfissionalDev1.setEmpresa("Carrefour - Itaquera");
        experienciaProfissionalDev1.setCargo("Assistente de Caixa");
        experienciaProfissionalDev1.setDescricaoCargo(
            "Atendimento ao Consumidor;\n"
            + "Gerenciamento de Caixa\n"
            + "Gerenciamento de Sistema Comercial\n"
            + "Gestão de Estoque\n"
        );
        experienciaProfissionalDev1.setDataEntrada("02/2020");
        experienciaProfissionalDev1.setDataSaida("06/2022");

        // Idioma
        Idioma idioma1Dev1 = new Idioma();
        idioma1Dev1.setIdioma("Inglês");
        idioma1Dev1.setNivel("Intermediário");

        Idioma idioma2Dev1 = new Idioma();
        idioma2Dev1.setIdioma("Português");
        idioma2Dev1.setNivel("Nativo");

        Desenvolvedor dev1 = new Desenvolvedor();
        dev1.setNome("Gustavo Nascimento Souza");
        dev1.setBiografia("Estudante de Tecnologia da Informação pela FATEC Zona Leste, no curso de Desenvolvimento de Software Multiplataforma");
        dev1.setCelularContato("(11) 98765-4321");
        dev1.setCidade("São Paulo - SP");
        dev1.setEmail("gustavo.ns@outlook.com.br");
        dev1.setDisponibilidadeOfertasEmprego(true);
        dev1.setLinkGithub("https://github.com/Gustavo-Nasc");
        dev1.setLinkLinkedin("https://www.linkedin.com/in/gustanascsouza");
        dev1.setPretensaoSalarial(1100);
        dev1.setTempoExperiencia(0);
        dev1.adicionarExperienciaProfissional(experienciaProfissionalDev1);
        dev1.adicionarFormacaoAcadêmica(formacaoAcademicaDev1);
        dev1.adicionarTecnologiaDominio("HTML");
        dev1.adicionarTecnologiaDominio("CSS");
        dev1.adicionarTecnologiaDominio("JavaScript");
        dev1.adicionarTecnologiaDominio("TypeScript");
        dev1.adicionarIdioma(idioma1Dev1);
        dev1.adicionarIdioma(idioma2Dev1);

        JOptionPane.showMessageDialog(null, dev1.retornarDadosCompletos(), "Desenvolvedor 1", 1);
    }
}