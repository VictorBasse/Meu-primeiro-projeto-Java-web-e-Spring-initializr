package br.com.curso.programacao.meuprojetoweb.controller;

import br.com.curso.programacao.meuprojetoweb.entity.Salarios;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
@Controller //Controller o spring vai controlar os metodos publicos, por exemplo não vou precisar mais por new EX: GeradorDeSalarios geraSalario = new GeradorDeSalarios(); INJEÇÃO DE DEPENDENCIAS
public class GeradorDeSalarios {
    public Salarios todosOsSalarios(){
        Salarios salarios = new Salarios(new BigDecimal("10.00"),new BigDecimal("20.00"));
        return salarios;
    }
    public BigDecimal salarioDeProgramador() {
        Salarios salarioDeProgramador = new Salarios();
        salarioDeProgramador.setMeuSalarioDeProgramdor(new BigDecimal(10.00));

        return salarioDeProgramador.getMeuSalarioDeProgramdor();
    }
    public BigDecimal salarioDeStreamer(){
        Salarios salarioDeStreamer = new Salarios();
        salarioDeStreamer.setMeuSalarioDeStreamer(new BigDecimal(20.00));

        return salarioDeStreamer.getMeuSalarioDeStreamer();
    }
}
