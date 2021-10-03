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
        return super.getSalario() * this.horasTrabalhadas;
    }
}