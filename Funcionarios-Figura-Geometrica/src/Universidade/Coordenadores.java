package Universidade;

import java.util.HashSet;
import java.util.Set;

public class Coordenadores extends Funcionario {

    private Set<Professores> professoresSupervisionados = new HashSet<>();
    private int quantidadeProfessores;


    public Coordenadores() {
        super();
        this.quantidadeProfessores = quantidadeProfessores;
    }

    public void adicionarProfessor(Professores p){
        if (professoresSupervisionados.size() < quantidadeProfessores) {
            this.professoresSupervisionados.add(p);
        }

    }

    public void aumentarSalario() {
        double salarioCord = this.getSalario() + (this.getSalario() * 0.05);
        setSalario(salarioCord);

    }

    public int getQuantidadeProfessores() {
        return quantidadeProfessores;
    }

    public void setQuantidadeProfessores(int quantidadeProfessores) {
        this.quantidadeProfessores = quantidadeProfessores;
    }

    public Set<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

}




