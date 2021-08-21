public class ConsultasOuro extends Consulta {
    @Override
    public double getValorConsulta() {
        if(super.getAnoInclusao() <= 2000) {
            return 0;
        } else {
            return super.getValorConsulta() - (super.getValorConsulta() * 0.3);
        }
    }
}
