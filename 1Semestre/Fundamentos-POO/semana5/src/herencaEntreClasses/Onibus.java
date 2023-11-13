package herencaEntreClasses;

public class Onibus extends Veiculo {
    private int passageiros;
    private boolean articulado;

    public Onibus(String marca, String motor, int passageiros, boolean articulado) {
        super(marca, motor);
        this.passageiros = passageiros;
        this.articulado = articulado;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public boolean isArticulado() {
        return articulado;
    }

    public String imprimir() {
        return super.imprimir() +
                " Passageiros: " + getPassageiros() +
                " Articulado: " + (isArticulado() ? "sim" : "não");
    }

}