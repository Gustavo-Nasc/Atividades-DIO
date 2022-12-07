# Java

## Curso: Testes Unitários com JUnit

### Aula 02 - Hello World com JUnit

#### JUnit - Gradle

O Primeiro passo é criar o projeto Projeto em Graddle

Então, logo após, dentro da pasta *"lib"*, no arquivo *"build.gradle"*, nós adicionamos a linha de *"testImplementation"*, logo após a linha de *"implementarion"*:

```java
// lib/build.gradle

// This dependency is used internally, and not exposed to consumers on their own compile classpath.
implementation 'com.google.guava:guava:30.1.1-jre'

// Note que estou utilizando a versão '5.8.2'.
// Você pode utilizar outra versão da documentação
testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.8.2'
```

Logo após, dentro de *"lib/src/java"*, nós podemos criar uma classe base para realizar nossos testes:

```java
// lib/src/java

package JUnitGradle;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    // Atributos da Classe
	private String nome;
    private LocalDate nascimento;
    
    // Método Construtor com parâmetro
    public Pessoa(String nome, LocalDate nascimento) {
    	this.nome = nome;
    	this.nascimento = nascimento;
    }
    
    // Métodos de Acesso (Getters) para o 'nome' e 'nascimento'
    public String getNome() {
    	return nome;
    }
    
    public LocalDate getNascimento() {
    	return nascimento;
    }
    
    // Cálculo da Idade com o 'LocalDate' e 'ChronoUnit'
    public int getIdade() {
    	return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }
}
```

Logo após, dentro de *"lib/src/test"*, nós podemos criar uma classe para, de fato, realizar nossos testes:

```java
package JUnitGradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
	@Test
    void validarCalculoIdade() {
    	Pessoa pessoa = new Pessoa("Gustavo", LocalDate.of(2004, 9, 9));
    	
    	// O primeiro parâmetro é o resultado esperado e o segundo parâmetro é a função que desejamos testar
    	Assertions.assertEquals(18, pessoa.getIdade());
    }
}
```