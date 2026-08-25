public class FuncionarioCLT extends Funcionario {
    public double valeTransporte;

    public double valeAlimentação;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentação) {
        super(nome, matricula, salarioBase, dataAdmissao)
        this.valeTransporte = valeTransporte;
        this.valeAlimentação = valeAlimentação;

    }
}
