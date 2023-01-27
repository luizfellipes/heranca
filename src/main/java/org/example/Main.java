package org.example;

public class Main {
    public static void main(String[] args) {


        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();
        Visitante visitante = new Visitante();
        Bolsista bolsista = new Bolsista();


        aluno.setNome("Maria");
        aluno.setCurso("Informática");
        aluno.setMatricula(1111);
        aluno.setIdade(18);
        aluno.setSexo("M");
        aluno.pagarMensalidade();
        System.out.println(aluno.toString());


        bolsista.setMatricula(1212);
        bolsista.setNome("Jubileu");
        bolsista.setBolsa(12.5f);
        bolsista.setSexo("M");
        bolsista.setIdade(22);
        bolsista.pagarMensalidade();
        System.out.println(bolsista.toString());





    }
}