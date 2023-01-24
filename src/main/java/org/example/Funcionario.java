package org.example;

public class Funcionario extends Pessoa{
    private String setor;
    private String trabalhando;

    public Funcionario(String setor, String trabalhando) {
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){

    }
}
