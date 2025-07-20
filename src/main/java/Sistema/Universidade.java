/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

public class Universidade {
    private String nome;
    private int MAX = 5;
    private int contadorDepartamentos = 0;
    Departamento[] departamentos = new Departamento[MAX];

    public Universidade(String nome) {
        this.nome = nome;
    }

    public void adicionarDepartamento(Departamento d) {
        if (contadorDepartamentos < MAX) {
            departamentos[contadorDepartamentos] = d;
            contadorDepartamentos++;
        } else {
            System.out.println("Limite de departamentos atingido.");
        }
    }

    public void listarTudo() {
        for (int i = 0; i < contadorDepartamentos; i++) {
            System.out.println("Departamento: " + departamentos[i].getNome());
            departamentos[i].listarFuncionarios();
            System.out.println("Gasto total: R$" + departamentos[i].gastoTotal());
        }
    }

    public void ResumoDepartamentos() {
        System.out.println("Fazendo um resumo geral dos departamentos: \n");
        for (int i = 0; i < contadorDepartamentos; i++) {
            System.out.println("Departamento: " + departamentos[i].getNome());
            System.out.println("Codigo: " + departamentos[i].getCodigo());
            System.out.println("Quantidade de funcionarios: " + departamentos[i].getCont());
            System.out.println("Gasto total: " + departamentos[i].gastoTotal());
            System.out.println("\n");
        }
    }

    public void exibirDepartamentoFaixaDeGasto(double a, double b) {
        System.out.println("Fazendo um resumo geral dos departamentos que gastam entre " + a + " e " + b + ":");
        for (int i = 0; i < contadorDepartamentos; i++) {
            if ((departamentos[i].gastoTotal() >= a) && (departamentos[i].gastoTotal() <= b)) {
                System.out.println("Departamento: " + departamentos[i].getNome());
                System.out.println("Codigo: " + departamentos[i].getCodigo());
                System.out.println("Quantidade de funcionarios: " + departamentos[i].getCont());
                System.out.println("Gasto total: " + departamentos[i].gastoTotal());
                System.out.println("\n");
            }
        }
    }
    
    public Departamento buscarDepartamentoPorCodigo(String cod) {
    for (int i = 0; i < contadorDepartamentos; i++) {
        if (departamentos[i].getCodigo().equals(cod)) {
            return departamentos[i];
        }
    }
    return null;
}
    
    public Funcionario buscarFuncionarioPorCodigo(String cod){
    for (int i = 0; i < contadorDepartamentos; i++){
        Funcionario f = departamentos[i].buscarFuncionarioPorCodigo(cod);
        if(f != null) return f;
    }
    return null;
}

    public Funcionario buscarFuncionarioPorNome(String nome){
    for (int i = 0; i < contadorDepartamentos; i++){
        for (Funcionario f : departamentos[i].getFuncionarios()) {
            if (f != null && f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
    }
    return null;
}

    public Departamento[] getDepartamentos(){
        return departamentos;
    }

}