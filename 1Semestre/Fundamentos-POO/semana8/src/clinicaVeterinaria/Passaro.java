package clinicaVeterinaria;

public class Passaro extends Animal{

    private boolean canta;
    private String cor;


    public Passaro(String nome, String dono, boolean canta, String cor) {
        super(nome, dono);
        this.especie = "Passaro";
        this.canta = canta;
        this.cor = cor;
    }

    @Override
    public String alimentacao() {
        return "alpiste, frutas...";
    }

    @Override
    public String cuidadosProprios() {
        return "abrigo, estímulos...";
    }

    @Override
    public String toString() {
        return super.toString() +
                " cor ='" + cor + '\'' +
                ", canta ='" + canta();
    }

    private String canta() {
        return (canta == true ? "O passaro " + nome + " está cantando." : "O passaro " + nome + " quieto.");
    }

}
