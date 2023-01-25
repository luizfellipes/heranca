package org.example;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Pedro");
        aluno.setNome("Maria");
        professor.setNome("Cláudio");
        funcionario.setNome("Fabiana");

        pessoa.setSexo("M");
        funcionario.setSexo("F");
        aluno.setIdade(18);

        aluno.setCurso("Informática");
        professor.setSalario(2500.75f);
        funcionario.setSetor("Estoque");

        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());

    }
}