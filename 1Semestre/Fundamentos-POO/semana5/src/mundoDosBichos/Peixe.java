package mundoDosBichos;

public class Peixe extends Pet { // Associação: meuDono é uma referência
    public Peixe(String nome, String raca, int idade, String corEscama) {
        super(nome, raca, idade, new CaudaEscamas(corEscama));
    }
}