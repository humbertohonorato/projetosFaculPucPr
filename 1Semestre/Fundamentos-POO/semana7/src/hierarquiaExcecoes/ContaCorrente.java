package hierarquiaExcecoes;

import hierarquiaExcecoes.exceptions.ContaCorrenteException;
import hierarquiaExcecoes.exceptions.SaldoInsuficienteException;

public class ContaCorrente {
    private double saldo;
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
    // Declaração do o método retirar, que pode lançar uma exceção
    // mais genérica: ContaCorrenteException
    public void retirar(double valor) throws ContaCorrenteException {
        // Em erro específico, lança exceção específica:
        // SaldoInsuficienteException, filha de ContaCorrenteException
        if (saldo - valor <= 0)
            throw new SaldoInsuficienteException(String.format(
                    "O saldo R$ %.2f é insuficiente para sacar o valor R$ %.2f",
                    saldo, valor)
            );
        else
            this.saldo -= valor;
    }
    public double getSaldo() {
        return saldo;
    }
}