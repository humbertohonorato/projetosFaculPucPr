package mundoDosBichos;

public class CaudaEscamas extends Cauda {
    private String cor;

    public CaudaEscamas(String cor) {
        this.cor = cor;
    }
    @Override
    public void print() {
        System.out.println(" Cauda com escamas de cor "
                + this.cor);
    }
}
