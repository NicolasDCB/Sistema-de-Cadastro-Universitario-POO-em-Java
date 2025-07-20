package Sistema;

public class Tecnico extends Funcionario{
    private String funcao;

    public Tecnico(double salarios, String nomes, String codigos, String lvl, String funfa){
        super(salarios, nomes, codigos, lvl);
        this.funcao = funfa;
    }

    @Override
    public void info(){
        System.out.println("Codigo: " + getCodigo() + ", Nome: " + getNome() + ", Salario: " + calcularSalario() + " reais, " +
                "Funcao: " + getFuncao() + ", Nivel: " + getNivel() + ".\n");
    }
    
    @Override
public String toString() {
    return "Técnico {" +
           "Nome: " + getNome() +
           ", Código: " + getCodigo() +
           ", Nível: " + getNivel() +
           ", Função: " + funcao +
           ", Salário: R$ " + calcularSalario() +
           '}';
}


    @Override
    public Double calcularSalario() {
        if(getNivel().equals(Utilitaria.tecnico1)){
            return (getSalario() * 1.1f); /*Retorna 10% caso seja T1*/
        }else{
            return (getSalario() * 1.2f); /*Retorna 20% caso seja T2*/
        }
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
