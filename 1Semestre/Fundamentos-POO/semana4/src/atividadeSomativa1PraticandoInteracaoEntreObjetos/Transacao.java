package atividadeSomativa1PraticandoInteracaoEntreObjetos;

import java.text.DecimalFormat;

public class Transacao {
    private static DecimalFormat decimalFormat = new DecimalFormat("#0.00");

    public static void depositar(Conta conta, double valor) {
        conta.depositar(valor);
        System.out.println("Depósito de R$" + decimalFormat.format(valor) + " realizado na conta " + conta.getNumeroConta() + ". Novo saldo: R$" + decimalFormat.format(conta.getSaldo()));
    }

    public static void sacar(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            conta.sacar(valor);
            System.out.println("Saque de R$" + decimalFormat.format(valor) + " realizado na conta " + conta.getNumeroConta() + ". Novo saldo: R$" + decimalFormat.format(conta.getSaldo()));
        } else {
            System.out.println("Saldo na conta " + conta.getNumeroConta() + " insuficiente para saque.");
        }
    }

    public static void transferir(Conta origem, Conta destino, double valor) {
        if (origem.getSaldo() >= valor) {
            origem.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + decimalFormat.format(valor) + " realizada da conta " + origem.getNumeroConta() + " para a conta " + destino.getNumeroConta() + ". Novo saldo da conta de origem: R$" + decimalFormat.format(origem.getSaldo()));
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
