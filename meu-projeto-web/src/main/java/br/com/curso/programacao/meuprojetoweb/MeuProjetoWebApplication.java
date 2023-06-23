package br.com.curso.programacao.meuprojetoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuProjetoWebApplication {
	public static void main(String[] args) {
		System.out.println("Meu primeiro projeto está subindo agora");
		SpringApplication.run(MeuProjetoWebApplication.class, args);
	}

}
