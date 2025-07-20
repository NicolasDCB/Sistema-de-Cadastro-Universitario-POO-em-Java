/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Sistema;

/**
 *
 * @author natha
 */
public abstract class Funcionario {
    private double salario;
    private String nome;
    private String codigo;
    private String nivel;
    
    public Funcionario(double salarios, String nomes, String codigos, String lvl){ // só aceita construtor com dados.
        this.salario = salarios;
        this.nome = nomes;
        this.codigo = codigos;
        this.nivel = lvl;
    }

    public abstract Double calcularSalario();

    public abstract void info();
    
    // a partir daq, ta todos os gets e sets.
    
    public void setSalario(double valor){
        this.salario = valor;
    }
    
    public void setNome(String valor){
        this.nome = valor;
    }
    
    public void setCodigo(String valor){
        this.codigo = valor;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCodigo(){
        return codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
