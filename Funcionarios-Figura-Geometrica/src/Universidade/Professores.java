package Universidade;

import java.util.HashSet;
import java.util.Set;

public class Professores extends Funcionario {

    private HashSet<Turma> turmasEscolhidas = new HashSet<>();
    private String nivelGraduacao,disciplinaMinistrada;
    private int quantidadeAlunos,quantidadeTurmas;


    public Professores() {
        super();
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = getDisciplinaMinistrada();
        this.quantidadeAlunos = getQuantidadeAlunos();
        this.quantidadeTurmas = getQuantidadeTurmas();
        adicionar(turmasEscolhidas);
    }

    private <Turma> void adicionar(Turma turma) {
    }

    public void aumentarSalario() {
        double salarioProf = getSalario() + (getSalario() * 0.10);
        setSalario(salarioProf);
    }

    public <Turma> void adicionaTurma(Turma  turma, Professores.Turma Turma){
        if(turmasEscolhidas.size()<quantidadeTurmas){
            this.turmasEscolhidas.add(Turma);
        }
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaEnsina) {
        this.disciplinaMinistrada = disciplinaEnsina;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }

    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeAlunos = quantidadeTurmas;
    }

    public <Turma> Set<Turma> getTurmasEscolhidas() {
        return (Set<Turma>) turmasEscolhidas;
    }

    private class Turma {
    }
}

