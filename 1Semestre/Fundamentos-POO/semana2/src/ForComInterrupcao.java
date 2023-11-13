public class ForComInterrupcao {
    public static void main(String[] args) {
        // i começa em 1 e aumenta de 3 em 3 até <= 20
        for (int i = 1; i <= 20; i+=3) { // 1, 4, 7, 10, 13, 16, 19
            if (i % 2 == 1) { // se é número ímpar: resto de i por 2 = 1
                continue;      // interrompe e vai para a condição
            }
            System.out.println(i + " ");
        }
        System.out.println("Fim 1\n\n");

        // i começa em 1 e aumenta de 3 em 3 até <= 20
        for (int i = 1; i <= 20; i+=3) { // 1, 4, 7, 10, 13, 16, 19
            if (i % 5 == 0) { // se múltiplo de 5: resto de i por 5 = 0
                break;         // interrompe e sai da repetição
            }
            System.out.println(i + " ");
        }
        System.out.println("Fim 2");
    }
}
