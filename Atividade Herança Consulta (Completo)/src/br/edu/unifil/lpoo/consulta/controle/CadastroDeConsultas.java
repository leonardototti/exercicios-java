package br.edu.unifil.lpoo.consulta.controle;

import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.ArrayList;

public class CadastroDeConsultas {
    private ArrayList<Consulta> listaConsultas = new ArrayList<>();

    public Consulta addConsulta(String tipoConsulta) {
        switch (tipoConsulta) {
            case "prata" -> listaConsultas.add(new ConsultasPrata());
            case "diamante" -> listaConsultas.add(new ConsultasDiamante());
            case "ouro" -> listaConsultas.add(new ConsultasOuro());
            case "familia" -> listaConsultas.add(new ConsultasFamilia());
        }
        return listaConsultas.get(listaConsultas.size()-1);
    }

    public void getConsultas(String tipoConsulta) {
        int consultasEncontradas = 0;

        if(listaConsultas.size() == 0) {
            System.out.println("Nenhuma consulta registrada ainda.");
        } else {
            System.out.println();
            System.out.println("Listando consultas do tipo " + tipoConsulta + ":");
            for (Consulta listaConsulta : listaConsultas) {
                if (listaConsulta.getTipoConsulta().equals(tipoConsulta)) {
                    consultasEncontradas++;
                    System.out.println("Nome: " + listaConsulta.getNomePaciente());
                    System.out.println("Matrícula: " + listaConsulta.getMatricula());
                    System.out.println();
                }
            }
            if(consultasEncontradas == 0) {
                System.out.println("Nenhuma consulta do tipo " + tipoConsulta + " foi encontrada.");
            }
        }
    }

    public int getNumTotalConsultas(String tipoConsulta) {
        int numTotalConsultas = 0;
        for (Consulta listaConsulta : listaConsultas) {
            if (listaConsulta.getTipoConsulta().equals(tipoConsulta)) {
                numTotalConsultas++;
            }
        }
        return numTotalConsultas;
    }

    public double getValorTotalConsultas(String tipoConsulta) {
        double valorTotalConsultas = 0;
        for (Consulta listaConsulta : listaConsultas) {
            if (listaConsulta.getTipoConsulta().equals(tipoConsulta)) {
                valorTotalConsultas += listaConsulta.getValorConsulta();
            }
        }
        return valorTotalConsultas;
    }

}
