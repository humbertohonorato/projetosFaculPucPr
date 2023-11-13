package ClassesAbstratasEInterfaces;

import java.util.*;

public class Main {
    public static void imprimir(List<Forma> formas) {
        for (Forma forma : formas) {
            System.out.printf("Area: %.2f Perimetro: %.2f%n",
                    forma.getArea(), forma.getPerimetro());
        }
    }

    public static void main(String[] args) {
        var formas = new ArrayList<Forma>();
        formas.add(new Retangulo(2, 2));
        formas.add(new Circulo(3));
        formas.add(new Retangulo(4, 3));
        formas.add(new Circulo(1.5));
        imprimir(formas);
    }
}