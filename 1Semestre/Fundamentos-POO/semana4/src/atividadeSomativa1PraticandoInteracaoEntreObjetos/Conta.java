package atividadeSomativa1PraticandoInteracaoEntreObjetos;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente titular;
    private Gerente gerenteResponsavel;

    public Conta(int numeroConta, double saldo, Cliente titular, Gerente gerenteResponsavel) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public Gerente getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(Gerente gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public void mostrarDados() {
        System.out.println("Dados da Conta:");
        System.out.println("Numero Conta: " + getNumeroConta()+ ", Saldo: " + getSaldo() + ", Titular: " + getTitular().getNome() + ", Gerente Responsavel: " + getGerenteResponsavel().getNome());
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
}
