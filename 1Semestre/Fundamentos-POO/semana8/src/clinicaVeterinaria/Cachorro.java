package clinicaVeterinaria;

public class Cachorro extends Animal{

    private boolean bravo;
    private String raca;

    public Cachorro(String nome, String dono, boolean bravo, String raca) {
        super(nome, dono);
        this.especie = "Cachorro";
        this.bravo = bravo;
        this.raca = raca;
    }

    @Override
    public String alimentacao() {
        return "ração, carnes...";
    }

    @Override
    public String cuidadosProprios() {
        return "tosa, banho...";
    }

    @Override
    public String toString() {
        return super.toString() +
                " raca ='" + raca + '\'' +
                ", morde ='" + morde();
    }

    private String morde() {
        return (bravo == true ? "O cachorro " + nome + " está bravo e pode morder." : "O cachorro " + nome + " está calmo não morde.");
    }
}
