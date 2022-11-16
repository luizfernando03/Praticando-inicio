package Universidade;

public class Main {
    public static void main(String[] args) {

     FuncionarioAdministrativo funcionarioAdministrativo  = new FuncionarioAdministrativo();
     System.out.println();
     System.out.println(" Dados do funcionario");
     System.out.println(" Nome:  " + funcionarioAdministrativo.getNome());
     System.out.println(" CPF :  " + funcionarioAdministrativo.getCpf());
     System.out.println(" Registro:   " + funcionarioAdministrativo.getRg());
     System.out.println(" Lotacao:   " + funcionarioAdministrativo.getLotacao());
     System.out.println(" Salario:   " + funcionarioAdministrativo.getSalario());



     System.out.println("########################################################################");


     Professores professores = new Professores();

     System.out.println("Dados do funcionario");
     System.out.println();
     System.out.println(" Nome:  " + professores.getNome());
     System.out.println(" CPF :  " + professores.getCpf());
     System.out.println(" Registro:   " + professores.getRg());
     System.out.println(" Lotacao:   " + professores.getLotacao());
     System.out.println(" Salario:   " + professores.getSalario());
     System.out.println(" Disciplina:  " + professores.getDisciplinaMinistrada());
     System.out.println(" Quantidade de turmas:  " + professores.getQuantidadeTurmas());
     System.out.println(" graduação:  " + professores.getNivelGraduacao());


     System.out.println("###########################################################################");


     Coordenadores coordenadores = new  Coordenadores ();

     System.out.println(" Coordenador: " + coordenadores.getNome());
     System.out.println(" CPF: " + coordenadores.getCpf());
     System.out.println(" Numero de registro: " + coordenadores.getRg());
     System.out.println(" Lotação: " + coordenadores.getLotacao());
     System.out.println(" Salario " + coordenadores.getSalario());
     System.out.println(" ProfesoresSupervisionados" + coordenadores.getProfessoresSupervisionados());

    }
}
