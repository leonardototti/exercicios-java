public class Aviao {
    private String nomeVoo;
    private int quantidadePassageiros;
    private char estado;
    private int quantidadeMaxima;

    public Aviao(int quantidadeMaxima) {
        this.estado = 'P';
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public void decolar() {
        if(this.estado == 'P') {
            this.estado = 'V';
        }
    }

    public void pousar() {
        if(this.estado == 'V') {
            this.estado = 'P';
        }
    }

    public String getNomeVoo() { return this.nomeVoo; }

    public char getEstado() { return this.estado; }

    public int getQuantidadePassageiros() { return this.quantidadePassageiros; }

    public void setNomeVoo(String nomeVoo) {
        if(!nomeVoo.isBlank()) {
            this.nomeVoo = nomeVoo;
        }
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        if(quantidadeMaxima > 0 && quantidadeMaxima <= this.quantidadeMaxima) {
            this.quantidadeMaxima = quantidadeMaxima;
        }
    }

    public int getQuantidadeMaxima() { return this.quantidadeMaxima; }

    public void embarcar() {
        if(this.estado == 'P' && this.quantidadePassageiros < this.quantidadeMaxima) {
            this.quantidadePassageiros++;
        }
    }

    public void desembarcar() {
        if(this.estado == 'P' && this.quantidadePassageiros < 0) {
            this.quantidadePassageiros--;
        }
    }
}