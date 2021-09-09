package br.edu.unifil.lpoo.consulta.modelo;

import java.util.ArrayList;

public class ConsultasPrata extends Consulta {
    public ConsultasPrata() {
        super("prata");
    }

    @Override
    public double getValorConsulta() {
        return super.getValorConsulta() - (super.getValorConsulta() * 0.2);
    }
}