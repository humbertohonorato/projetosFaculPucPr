package funcionario;

public class Temporario extends Funcionario {
    private int mesesContrato;

    public Temporario(double salarioBase, int mesesContrato) {
        super(salarioBase);
        this.mesesContrato = mesesContrato;
    }

    @Override
    protected double getGratificacao() {
        return 100.0 * mesesContrato;
    }
}