package Sistema;

public abstract class Docente extends Funcionario{
    String titulo;

    public Docente(double salarios, String nomes, String codigos, String posi, String lvl){
        super(salarios, nomes, codigos, lvl);
        this.titulo = posi;
    }

    public abstract Double calcularSalario(); /*Deixar para ser implementado nas classes filhas.*/

    public abstract void info(); /*Deixar para ser implementado nas classes filhas.*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
