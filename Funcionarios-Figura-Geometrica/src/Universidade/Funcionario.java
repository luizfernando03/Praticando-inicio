package Universidade;

public abstract class Funcionario {
    private String nome, cpf, rg, lotacao;
    public double salario;

    public Funcionario() {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.lotacao = lotacao;
        this.salario = salario;
    }

    public abstract void aumentarSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


