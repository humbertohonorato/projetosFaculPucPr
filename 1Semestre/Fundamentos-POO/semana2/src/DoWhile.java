public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        do {
            soma = soma + i;// acumula o valor de i em soma
            i++;            // aumenta o valor de i de 1 em 1
        }while (i <= 3);
        System.out.println("Soma = " + soma); // 6 = 1 + 2 +
    }
}
