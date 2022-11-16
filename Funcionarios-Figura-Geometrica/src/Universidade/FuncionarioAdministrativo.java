package Universidade;
public class FuncionarioAdministrativo extends Funcionario {

    private String funcaoAdministrativa,senioridade;

    public FuncionarioAdministrativo() {
        super();
        this.funcaoAdministrativa = getFuncaoAdm();
        this.senioridade = senioridade;
    }

    public void aumentarSalario() {
        double salarioAdm = getSalario() + (getSalario() * 0.10);
        setSalario(salario);
    }

    public String getFuncaoAdm() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdministrativa = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;

    }
}
