package br.com.curso.programacao.meuprojetoweb.entity;

import java.math.BigDecimal;

//@Entity
//@Table = (schema "", name = "TB_SALARIOS"
public class Salarios {
    private BigDecimal meuSalarioDeProgramdor = BigDecimal.ZERO;
    private BigDecimal meuSalarioDeStreamer = BigDecimal.ZERO;

    public Salarios(){

    }

    public Salarios(BigDecimal meuSalarioDeProgramdor, BigDecimal meuSalarioDeStreamer) {
        this.meuSalarioDeProgramdor = meuSalarioDeProgramdor;
        this.meuSalarioDeStreamer = meuSalarioDeStreamer;
    }
    public BigDecimal getMeuSalarioDeProgramdor() {
        return meuSalarioDeProgramdor;
    }

    public void setMeuSalarioDeProgramdor(BigDecimal meuSalarioDeProgramdor) {
        this.meuSalarioDeProgramdor = meuSalarioDeProgramdor;
    }


    public BigDecimal getMeuSalarioDeStreamer() {
        return meuSalarioDeStreamer;
    }
    public void setMeuSalarioDeStreamer(BigDecimal meuSalarioDeStreamer) {
        this.meuSalarioDeStreamer = meuSalarioDeStreamer;
    }

    @Override
    public String toString() {
        return "Salarios{" +
                "meuSalarioDeProgramdor=" + meuSalarioDeProgramdor +
                ", meuSalarioDeStreamer=" + meuSalarioDeStreamer +
                '}';
    }
}