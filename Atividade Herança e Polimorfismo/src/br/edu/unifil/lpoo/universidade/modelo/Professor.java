package br.edu.unifil.lpoo.universidade.modelo;

public class Professor {
    protected String nome;
    protected float salario;
    protected String matricula;

    public Professor(String nome, float salario, String matricula) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void getDados() {
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("Salário: %s\n", this.getSalario());
        System.out.printf("Matrícula: %s\n", this.getMatricula());
    }
}
