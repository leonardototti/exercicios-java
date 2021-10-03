package br.edu.unifil.lpoo.universidade.modelo;

public class ProfessorHorista extends Professor {
    private int horasTrabalhadas;

    public ProfessorHorista(String nome, float salario, String matricula, int horasTrabalhadas) {
        super(nome, salario, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public float getSalario() {
        return super.salario * this.horasTrabalhadas;
    }

    @Override
    public void getDados() {
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("Salário: %s\n", this.getSalario());
        System.out.printf("Matrícula: %s\n", this.getMatricula());
        System.out.printf("Horas trabalhadas: %s\n", this.getHorasTrabalhadas());
    }
}
