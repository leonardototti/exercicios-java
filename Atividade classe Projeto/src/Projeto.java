public class Projeto {
    String nome;
    double custoHora;
    int horas;

    public Projeto(String nome, double custoHora) {
        this.nome = nome;
        this.custoHora = custoHora;
    }

    public void registrarHoras(int horas) {
        if(horas > 0) {
            this.horas += horas;
        }
    }

    public double getCustoAtual() {
        return this.horas * this.custoHora;
    }
}