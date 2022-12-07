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
