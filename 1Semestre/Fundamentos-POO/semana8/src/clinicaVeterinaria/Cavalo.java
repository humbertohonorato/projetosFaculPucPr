package clinicaVeterinaria;

public class Cavalo extends Animal {

    private boolean adestrado;
    private String crina;

    public Cavalo(String nome, String dono, boolean adestrado) {
        super(nome, dono);
        this.especie = "Cavalo";
        this.adestrado = adestrado;
        this.crina = "lisa";
    }

    @Override
    public String alimentacao() {
        return "ração, aveia, alfafa...";
    }

    @Override
    public String cuidadosProprios() {
        return realizaCorrida() + ", + pode realizar trote, ter cuidados nos cascos...";
    }

    @Override
    public String toString() {
        return super.toString() +
                " crina ='" + crina + '\'' +
                ", adestrado ='" + adestrado;
    }

    private String realizaCorrida() {
        return "O cavalo " + nome + " está realizando uma corrida no momento." ;
    }
}
