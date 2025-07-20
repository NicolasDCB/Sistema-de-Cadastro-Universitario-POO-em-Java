package Controlador;

import Sistema.Departamento;
import Sistema.Funcionario;
import Sistema.Universidade;
import java.util.ArrayList;

public class Controlador {
    private Universidade universidade;

    public Controlador(String nomeUniversidade) {
        this.universidade = new Universidade(nomeUniversidade);
    }


public String relatorioGeral() {
    StringBuilder sb = new StringBuilder();
    Departamento[] departamentos = universidade.getDepartamentos();
    for (Departamento d : departamentos) {
        if (d != null) {
            sb.append("Departamento: ").append(d.getNome()).append("\n");
            Funcionario[] funcionarios = d.getFuncionarios();
            double total = 0;
            for (Funcionario f : funcionarios) {
                if (f != null) {
                    sb.append(f).append("\n");
                    total += f.calcularSalario();
                }
            }
            sb.append("Gasto Total: R$ ").append(total).append("\n");
            sb.append("----------------------\n");
        }
    }
    return sb.toString();
}



public String[] resumoDepartamentos() {
    Departamento[] departamentos = universidade.getDepartamentos();
    java.util.List<String> lista = new java.util.ArrayList<>();
    for (Departamento d : departamentos) {
        if (d != null) {
            int qtde = d.quantidadeFuncionarios();
            double gasto = d.gastoTotal();
            lista.add("Dep: " + d.getNome() + ", Qtde: " + qtde + ", Gasto: R$ " + gasto);
        }
    }
    return lista.toArray(new String[0]);
}


    // 3. Resumo com faixa de gasto
    public void resumoPorFaixaDeGasto(double min, double max) {
        for (Departamento d : universidade.getDepartamentos()) {
            if (d != null) {
                double gasto = d.gastoTotal();
                if (gasto >= min && gasto <= max) {
                    System.out.println("Dep: " + d.getNome() + ", Qtde: " + d.quantidadeFuncionarios() + ", Gasto: R$ " + gasto);
                }
            }
        }
    }

    public void funcionariosPorFaixaSalarial(double min, double max) {
        for (Departamento d : universidade.getDepartamentos()) {
            if (d != null) {
                for (Funcionario f : d.getFuncionarios()) {
                    if (f != null) {
                        double sal = f.calcularSalario();
                        if (sal >= min && sal <= max) {
                            System.out.println(f);
                        }
                    }
                }
            }
        }
    }

    // 5 a 9. Filtragem por tipo
   public String exibirTodosFuncionarios() {
    return listarPorTipo(null);
}


public String exibirTecnicos() {
    return listarPorTipo("Tecnico");
}

public String exibirDocentes() {
    return listarPorTipo("Docente");
}

public String exibirEfetivos() {
    return listarPorTipo("Efetivo");
}

public String exibirSubstitutos() {
    return listarPorTipo("Substituto");
}


    private String listarPorTipo(String tipoDesejado) {
    StringBuilder sb = new StringBuilder();
    for (Departamento d : universidade.getDepartamentos()) {
        if (d != null) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f != null) {
                    if (tipoDesejado == null || f.getClass().getSimpleName().equalsIgnoreCase(tipoDesejado)) {
                        sb.append(f.toString()).append("\n");
                    }
                }
            }
        }
    }
    return sb.toString();
}


public String relatorioPorDepartamento(String codigo) {
    Departamento d = universidade.buscarDepartamentoPorCodigo(codigo);
    if (d != null) {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento: ").append(d.getNome()).append("\n");
        for (Funcionario f : d.getFuncionarios()) {
            if (f != null) sb.append(f).append("\n");
        }
        sb.append("Gasto total: R$ ").append(d.gastoTotal()).append("\n");
        return sb.toString();
    } else {
        return null;
    }
}


public String buscarFuncionarioPorCodigoReturn(String codigo) {
    Funcionario f = universidade.buscarFuncionarioPorCodigo(codigo);
    return (f != null) ? f.toString() : null;
}

public String buscarFuncionarioPorNomeReturn(String nome) {
    Funcionario f = universidade.buscarFuncionarioPorNome(nome);
    return (f != null) ? f.toString() : null;
}


    public void adicionarDepartamento(Departamento d) {
        universidade.adicionarDepartamento(d);
    }

    public void adicionarFuncionario(String codigoDepartamento, Funcionario f) {
        Departamento d = universidade.buscarDepartamentoPorCodigo(codigoDepartamento);
        if (d != null) {
            d.adicionarFuncionario(f);
        } else {
            System.out.println("Departamento não encontrado para adicionar funcionário.");
        }
    }
    
    public String funcionariosPorFaixaSalarialReturn(double min, double max) {
    StringBuilder sb = new StringBuilder();
    for (Departamento d : universidade.getDepartamentos()) {
        if (d != null) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f != null) {
                    double sal = f.calcularSalario();
                    if (sal >= min && sal <= max) {
                        sb.append(f).append("\n");
                    }
                }
            }
        }
    }
    return sb.toString();
}
    
    public String[] resumoPorFaixaDeGastoReturn(double min, double max) {
    ArrayList<String> lista = new ArrayList<>();
    for (Departamento d : universidade.getDepartamentos()) {
        if (d != null) {
            double gasto = d.gastoTotal();
            if (gasto >= min && gasto <= max) {
                lista.add("Dep: " + d.getNome() + ", Qtde: " + d.quantidadeFuncionarios() + ", Gasto: R$ " + gasto);
            }
        }
    }
    return lista.toArray(new String[0]);
}

}
 