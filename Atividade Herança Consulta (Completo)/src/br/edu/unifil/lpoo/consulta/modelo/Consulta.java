package br.edu.unifil.lpoo.consulta.modelo;

import java.util.ArrayList;
import java.util.UUID;

public class Consulta {
    private String nomePaciente;
    private String matricula;

    protected int numDependentes;
    protected int anoInclusao;
    protected double valorConsulta;
    protected String tipoConsulta;

    public Consulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(matricula.length() == 5) {
            this.matricula = matricula;
        } else {
            System.out.println("A matrícula deve ter exatamente 5 dígitos!");
        }
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numeroDependentes) {
        this.numDependentes = numeroDependentes;
    }

    public int getAnoInclusao() {
        return anoInclusao;
    }

    public void setAnoInclusao(int anoInclusao) {
        this.anoInclusao = anoInclusao;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }
}
