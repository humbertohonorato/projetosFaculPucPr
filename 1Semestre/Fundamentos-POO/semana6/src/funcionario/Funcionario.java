package funcionario;

public abstract class Funcionario {
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalario() {
        return salarioBase + getGratificacao();
    }

    protected abstract double getGratificacao();
}
