import java.util.Date;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salariobase;
    private String dataAdmissao;

    public Funcionario(String nome, String matricula, double salarioBase, String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }

    public double getsalarioBase(){
        return salariobase;
    }

    public double calcularSalario(){
        return salariobase;
    }

    public double calcularDesconto(){
        return salariobase * 0.08;
    }

    @Override
    public String toString() { double liquido = calcularSalario() - calcularDesconto();
        return String.format( "%s [%s] - Salário: R$ %.2f | Desconto:\n" + "R$ %.2f | Líquido: R$ %.2f", nome, matricula, calcularSalario(), calcularDesconto(), liquido );
    }
}
