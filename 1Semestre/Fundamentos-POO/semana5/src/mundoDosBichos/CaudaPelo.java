package mundoDosBichos;

public class CaudaPelo extends Cauda {
    private String forma;
    private String tipoPelo;

    public CaudaPelo(String forma, String tipoPelo) {
        this.forma = forma;
        this.tipoPelo = tipoPelo;
    }
    @Override
    public void print() {
        System.out.println(" Cauda: " + this.forma + " com " +
                this.tipoPelo);
    }
}