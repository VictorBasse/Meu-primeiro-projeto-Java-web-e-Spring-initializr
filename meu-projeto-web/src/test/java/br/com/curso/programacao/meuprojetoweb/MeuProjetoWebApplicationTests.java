package br.com.curso.programacao.meuprojetoweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class MeuProjetoWebApplicationTests {

	private BigDecimal meuSalarioDeProgramador = new BigDecimal("10.00");

	@Test
	void contextLoads() {
		System.out.println("começando o debug");
		System.out.println("O salario de programador é: R$"+meuSalarioDeProgramador);
		System.out.println("fim do debug");
	}

}
