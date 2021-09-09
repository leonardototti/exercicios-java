package br.edu.unifil.lpoo.consulta.modelo;

import java.util.ArrayList;

public class ConsultasOuro extends Consulta {
    public ConsultasOuro() {
        super("ouro");
    }

    @Override
    public double getValorConsulta() {
        if(super.getAnoInclusao() <= 2000) {
            return 0;
        } else {
            return super.getValorConsulta() - (super.getValorConsulta() * 0.3);
        }
    }
}
