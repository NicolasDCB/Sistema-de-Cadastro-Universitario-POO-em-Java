package Sistema;

public class Efetivo extends Docente{
    private String area;

    public Efetivo(double salarios, String nomes, String codigos, int cargas, String posi, String lvl, String areas){
        super(salarios, nomes, codigos, posi, lvl);
        this.area = areas;
    }

    @Override
    public Double calcularSalario() { /*Como são três opções, vamos usar switch case (a própria IDE recomendou). */
        switch (getNivel()) {
            case Utilitaria.docenteE1 ->  {
                return (getSalario() * 1.05f);
            }
            case Utilitaria.docenteE2 -> {
                return (getSalario() * 1.10f);
            }
            case Utilitaria.docenteE3 -> {
                return (getSalario() * 1.20f);
            }

            default -> throw new IllegalArgumentException("Erro. Nivel errado: " + getNivel());
        }
    }

    @Override
    public void info() {
        System.out.println("Nome: " + getNome() + ", Salario: " + calcularSalario() + " reais, Codigo: " + getCodigo() +
                ", Area: " + getArea() + ", Titulo: " + getTitulo() + ", Nivel: " + getNivel() + "\n\n");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
public String toString() {
    return "Docente Efetivo {" +
           "Nome: " + getNome() +
           ", Código: " + getCodigo() +
           ", Nível: " + getNivel() +
           ", Área: " + area +
           ", Titulação: " + titulo +
           ", Salário: R$ " + calcularSalario() +
           '}';
}

}
