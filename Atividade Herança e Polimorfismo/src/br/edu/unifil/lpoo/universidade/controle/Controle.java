package br.edu.unifil.lpoo.universidade.controle;

import br.edu.unifil.lpoo.universidade.modelo.Professor;
import br.edu.unifil.lpoo.universidade.modelo.ProfessorDE;
import br.edu.unifil.lpoo.universidade.modelo.ProfessorHorista;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Professor> listaProfessores;

    public Controle() {
        this.listaProfessores = new ArrayList<>();
    }

    public void incluiProfessor(String tipoProfessor, String nome, float salario, String matricula, int horasOuPremios) {
        switch (tipoProfessor) {
            case "dedicado" -> listaProfessores.add(new ProfessorDE(nome, salario, matricula, horasOuPremios));
            case "horista" -> listaProfessores.add(new ProfessorHorista(nome, salario, matricula, horasOuPremios));
        }
        System.out.println("Professor " + listaProfessores.get(listaProfessores.size() - 1).getNome() + " cadastrado com sucesso!");
    }

    public void listaProfessores() {
        for(Professor professor : this.listaProfessores) {
            System.out.println("---------------------------");
            System.out.printf("Nome: %s\n", professor.getNome());
            System.out.printf("Salário: %s\n", professor.getSalario());
            System.out.println("---------------------------");
        }
    }

    public void mostraDados() {
        for(Professor professor : this.listaProfessores) {
            System.out.println("---------------------------");
            professor.getDados();
            System.out.println("---------------------------");
        }
    }
}
