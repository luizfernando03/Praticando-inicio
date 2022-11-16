package GerenciarListaDeCandidatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidatos {
    private  String numeroMatricula;
    private float nota;
    
    Scanner input = new Scanner(System.in);
    
    ArrayList<Candidatos>listaCandidatos=new ArrayList<>();
    
    
    public Candidatos(String numeroMatricula, float nota) {
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }
    
    public Candidatos(){}
    
    public void adicionar(){
        System.out.println("Qual o numero da matricula do candidato? : ");
        String matricula = input.next();
        System.out.println("####################################################");

        System.out.println("Qual a nota do candidato? : ");
        float nota = input.nextFloat();
        System.out.println("#####################################################");

        System.out.println("Você adicinou um novo candidato! O candidato tem como número de matricula: " +matricula+ "e nota: " +nota);
        
        Candidatos novoCandidato = new Candidatos(matricula,nota);
        listaCandidatos.add(novoCandidato);
        
    }
    public void exibir (){
        
        for (int i =0;i<listaCandidatos.size(); i++){
            System.out.println("Número de matricula: " + listaCandidatos.get(i).getNumeroMatricula()+ "nota:" + listaCandidatos.get(i).getNota());
        }
    }

    private String getNota() {
        return null;
    }
    

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void excluir() {
    }
}

