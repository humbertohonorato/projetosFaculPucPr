package polimorfismo;

public class Carro extends Veiculo {
    private int portaMalas;

    public Carro(String marca, String motor, int portaMalas) {
        super(marca, motor);
        this.portaMalas = portaMalas;
    }

    public int getPortaMalas() {
        return portaMalas;
    }

    @Override
    public String imprimir() {
        return super.imprimir() +
                " Porta malas: " + getPortaMalas() + " litros.";
    }
}