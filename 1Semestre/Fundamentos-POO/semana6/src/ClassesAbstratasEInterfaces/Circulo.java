package ClassesAbstratasEInterfaces;

public class Circulo extends Forma{
    private static final double PI = 3.1415;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return PI * raio * raio;
    }

    public double getPerimetro() {
        return 2 * PI * raio;
    }
}
