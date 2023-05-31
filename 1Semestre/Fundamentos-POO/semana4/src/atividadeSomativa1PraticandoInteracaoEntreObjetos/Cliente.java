package atividadeSomativa1PraticandoInteracaoEntreObjetos;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    private int idCliente;
    private List<Conta> contas;

    public Cliente(String nome, int idade, String cpf, int idCliente) {
        super(nome, idade, cpf);
        this.idCliente = idCliente;
        this.contas = new ArrayList<>();
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "IdCliente: " + getIdCliente() + ", Nome: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf();
    }

    public void adicionarConta(Conta conta) {
            contas.add(conta);

    }

    public void removerConta(Conta conta) {
        if (!contas.contains(conta)) {
            contas.remove(conta);
        }
    }

    public void exibirContas() {
        System.out.println("Contas do cliente " + getNome() + ":");
        for (Conta conta : contas) {
            if (conta != null) {
                System.out.println("Número da conta: " + conta.getNumeroConta() + ", Saldo: " + conta.getSaldo());
            }
        }
    }
//    public void mostrarDados() {
//        System.out.println("Dados do cliente:");
//        System.out.println("IdCliente: " + getIdCliente()+ ", Nome: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf());
//    }

}
