public class ConsultasFamilia extends Consulta {
    @Override
    public double getValorConsulta() {
        if(super.getNumDependentes() > 2) {
            return super.getValorConsulta() - (super.getValorConsulta() * 0.5);
        } else {
            return super.getValorConsulta();
        }
    }
}
