public class ConsultasPrata extends Consulta {
    @Override
    public double getValorConsulta() {
        return super.getValorConsulta() - (super.getValorConsulta() * 0.2);
    }
}