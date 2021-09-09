package br.edu.unifil.lpoo.consulta.modelo;

import java.util.ArrayList;

public class ConsultasDiamante extends Consulta {
    public ConsultasDiamante() {
        super("diamante");
    }

    @Override
    public double getValorConsulta() {
        return super.getValorConsulta() - (super.getValorConsulta() * 0.4);
    }
}
