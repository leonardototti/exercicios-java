public class ProfessorDE extends Professor {
    private int licencaPremio;

    public ProfessorDE(String nome, float salario, String matricula, int licencaPremio) {
        super(nome, salario, matricula);
        this.licencaPremio = licencaPremio;
    }

    public int getLicensaPremio() {
        return licencaPremio;
    }

    public void setLicensaPremio(int licencaPremio) {
        this.licencaPremio = licencaPremio;
    }
}