package atividadeSomativa1PraticandoInteracaoEntreObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacaoBancaria {
    public static void main(String[] args) {
        // Criando gerente, cliente e conta
        Gerente gerente1 = new Gerente("Ana", 30, "12345678900", 1);

        Cliente cliente1 = new Cliente("Joao", 18, "12345678900", 1);
        Cliente cliente2 = new Cliente("Maria", 19, "12345678900", 2);
        Cliente cliente3 = new Cliente("Lucas", 19, "12345678900", 3);

        Conta contaCliente1 = new Conta(123456, 20, cliente1, gerente1);
        Conta contaCliente2 = new Conta(654321, 50, cliente2, gerente1);
        Conta novaContaCliente2 = new Conta(864321, 10, cliente2, gerente1);
        Conta contaCliente3 = new Conta(00000, 50, cliente3, gerente1);

        // Vinculando conta a genrete e cliente
        gerente1.adicionarConta(contaCliente1);
        gerente1.adicionarConta(contaCliente2);
        gerente1.adicionarConta(contaCliente3);

        cliente1.adicionarConta(contaCliente1);
        cliente2.adicionarConta(contaCliente2);
        cliente2.adicionarConta(novaContaCliente2);
        cliente3.adicionarConta(contaCliente3);

        // Mostrar
        gerente1.mostrarDados();
        cliente1.exibirContas();
        cliente2.exibirContas();
        cliente3.exibirContas();

        // Remover vinculo de conta de cliente e gerente
        gerente1.removerConta(contaCliente3);
        cliente2.removerConta(novaContaCliente2);

        // Realizando transação nas contas
        Transacao.sacar(contaCliente1, 100);
        Transacao.sacar(contaCliente1, 10);

        Transacao.depositar(contaCliente1, 100);

        Transacao.transferir(contaCliente1, contaCliente2, 30);
        Transacao.transferir(contaCliente1,contaCliente2,500);

    }
}

