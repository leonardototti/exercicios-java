public class Professor {
    private String nome;
    private int matricula;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setNome(String nome) {
        if(!nome.isBlank()) {
            this.nome = nome;
        }
    }
}
