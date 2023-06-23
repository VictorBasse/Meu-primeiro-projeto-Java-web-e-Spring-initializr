package br.com.curso.programacao.meuprojetoweb.service;

import br.com.curso.programacao.meuprojetoweb.controller.GeradorDeSalarios;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController //RestController declara que a classe é do tipo Rest ou seja o mundo externo tem acesso
public class Salarios {
    @Autowired
    private GeradorDeSalarios geraSalario;

    @ResponseBody //ResponseBody declara que isso é um metodo que se comunica com o mundo externo
    @RequestMapping(method = RequestMethod.GET,
            path = "todos-salarios", produces = MediaType.APPLICATION_JSON)
    //RequestMapping, quando o seu site subir para a web aonde todos terão acesso, o codigo abaixo será realizado ao ter salario-programador em seu link htpp
    //Jason é um formato que as APIS se comunicam (Pesquisar no google)
    public ResponseEntity<?> getTodosSalarios() {
        return new ResponseEntity<>(geraSalario.todosOsSalarios(), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
            path = "salario-programador", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getSalarioProgramador() {
        return new ResponseEntity<>(geraSalario.salarioDeProgramador(), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
    path = "salario-streamer", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?>getSalarioStreamer(){
        return new ResponseEntity<>(geraSalario.salarioDeStreamer(),HttpStatus.OK);
    }
}