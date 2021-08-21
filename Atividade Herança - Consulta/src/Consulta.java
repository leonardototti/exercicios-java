public class Consulta {
    private String nomePaciente;
    private String matricula;
    private int numDependentes;
    private int anoInclusao;
    private double valorConsulta;

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public int getAnoInclusao() {
        return anoInclusao;
    }

    public void setAnoInclusao(int anoInclusao) {
        this.anoInclusao = anoInclusao;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
