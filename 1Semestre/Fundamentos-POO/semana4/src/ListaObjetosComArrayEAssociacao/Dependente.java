package ListaObjetosComArrayEAssociacao;

public class Dependente {
    private String nome;

    public Dependente(String nome) {
        this.nome = nome;
    }
    public void imprimir() {
        System.out.println ("Dependente: " + nome);
    }
}
