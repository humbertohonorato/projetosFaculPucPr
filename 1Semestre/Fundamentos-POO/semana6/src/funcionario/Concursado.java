package funcionario;

public class Concursado extends Funcionario {
    private int anosTrabalho;

    public Concursado(double salarioBase, int anosTrabalho) {
        super(salarioBase);
        this.anosTrabalho = anosTrabalho;
    }
    @Override
    protected double getGratificacao() {
        return 0.2 * (anosTrabalho / 5) * salarioBase;
    }
}