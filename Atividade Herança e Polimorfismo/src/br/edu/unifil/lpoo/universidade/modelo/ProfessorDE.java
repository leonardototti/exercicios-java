package br.edu.unifil.lpoo.universidade.modelo;

public class ProfessorDE extends Professor {
    private int licencasPremio;

    public ProfessorDE(String nome, float salario, String matricula, int licencasPremio) {
        super(nome, salario, matricula);
        this.licencasPremio = licencasPremio;
    }

    public int getLicencasPremio() {
        return licencasPremio;
    }

    public void setLicencasPremio(int licencasPremio) {
        this.licencasPremio = licencasPremio;
    }

    @Override
    public void getDados() {
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("Salário: %s\n", this.getSalario());
        System.out.printf("Matrícula: %s\n", this.getMatricula());
        System.out.printf("Licenças prêmio: %s\n", this.getLicencasPremio());
    }
}
