public class CartaoCredito {
    private int numero;
    private float saldo;
    private float limite;
    private float bonus;
    private String bandeira;

    public CartaoCredito(int numero, String bandeira) {
        this.numero = numero;
        this.bandeira = bandeira;
    }

    public CartaoCredito(int numero, float limite, String bandeira) {
        this.numero = numero;
        this.bandeira = bandeira;
        this.limite = limite;
    }

    public float getSaldo() { return this.saldo; }

    public float getLimite() { return this.limite; }

    public float getBonus() { return bonus; }

    public String getBandeira() { return bandeira; }

    public int getNumero() { return numero; }

    public void setBandeira(String bandeira) {
        if(!bandeira.isBlank()) {
            this.bandeira = bandeira;
        }
    }

    public void setLimite(float limite) {
        if(limite >= 1) {
            this.limite = limite;
        }
    }

    public void addPagar(float valorPago) {
        this.saldo -= valorPago;
        this.creditaBonus((float) (valorPago * 0.02));
    }

    public void addComprar(float valorCompra) {
        this.saldo += valorCompra;
        this.creditaBonus((float) (valorCompra * 0.03));
    }

    private void creditaBonus(float valor) {
        this.bonus += valor;
    }
}
