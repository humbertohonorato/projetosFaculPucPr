package atividadeSomativa1PraticandoInteracaoEntreObjetos;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Pessoa {
    private int idGerente;
    private List<Conta> contas;

    public Gerente(String nome, int idade, String cpf, int idGerente) {
        super(nome, idade, cpf);
        this.idGerente = idGerente;
        this.contas = new ArrayList<>();
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
            contas.add(conta);
    }

    public void removerConta(Conta conta) {
        if (!contas.contains(conta)) {
            contas.remove(conta);
        }
    }

    @Override
    public String toString() {
        return "IdCliente: " + getIdGerente() + ", Nome: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf();
    }

    private void exibirContas() {
        System.out.println("Contas gerenciadas pelo gerente " + getNome() + ":");
        for (Conta conta : contas) {
            if (conta != null) {
                System.out.println("Número da conta: " + conta.getNumeroConta() + ", Titular: " + conta.getTitular());
            }
        }
    }

    public void mostrarDados() {
        System.out.println("Dados do Gerente:");
        System.out.println("IdGerente: " + getIdGerente());
        exibirContas();
    }
}
