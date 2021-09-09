package br.edu.unifil.lpoo.consulta.modelo;

import java.util.ArrayList;

public class ConsultasFamilia extends Consulta {
    public ConsultasFamilia() {
        super("familia");
    }

    @Override
    public double getValorConsulta() {
        if(super.getNumDependentes() > 2) {
            return super.getValorConsulta() - (super.getValorConsulta() * 0.5);
        } else {
            return super.getValorConsulta();
        }
    }
}
