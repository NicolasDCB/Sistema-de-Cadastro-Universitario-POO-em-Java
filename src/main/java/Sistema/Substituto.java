package Sistema;

public class Substituto extends Docente{
    private int cargaHoraria;

    public Substituto(double salarios, String nomes, String codigos, String posi, String lvl, int cargas){
        super(salarios, nomes, codigos, posi, lvl);
        this.cargaHoraria = cargas;
    }

    @Override
    public Double calcularSalario() {
        if(getNivel().equals(Utilitaria.docenteS1)){
            return (getSalario() * 1.05f);
        }else{
            return (getSalario() * 1.10f);
        }
    }

    @Override
    public void info() {
        System.out.println("Nome: " + getNome() + ", Salario: " + calcularSalario() + " reais, Codigo: " + getCodigo() +
                ", Carga Horaria: " + getCargaHoraria() + " horas, Titulo: " + getTitulo() + ", Nivel: "
                + getNivel() + "\n\n");
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
public String toString() {
    return "Docente Substituto {" +
           "Nome: " + getNome() +
           ", Código: " + getCodigo() +
           ", Nível: " + getNivel() +
           ", Titulação: " + titulo +
           ", Carga Horária: " + cargaHoraria +
           ", Salário: R$ " + calcularSalario() +
           '}';
}

}
