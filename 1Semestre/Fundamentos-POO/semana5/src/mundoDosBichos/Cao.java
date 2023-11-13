package mundoDosBichos;

public class Cao extends Pet { // Associação: meuDono é uma referência
    private String genero;
    public Cao(String nome, String raca, String genero,
               int idade, String forma, String tipoPelo) {
        super(nome, raca, idade, new CaudaPelo(forma, tipoPelo));
        this.genero = genero;
    }
    @Override
    public void print() {
        super.print();
        System.out.println(" Gênero: " + this.genero);
    }
}
