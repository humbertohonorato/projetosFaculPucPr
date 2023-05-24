import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // EXEMPLO 1
        System.out.println(" EXEMPLO 1");

        System.out.println("linha1\tcoluna1\nlinha2\tcoluna2");

        // EXEMPLO 2
        System.out.println(" EXEMPLO 2");

        // Exemplos de declaração e atribuição de variável
        int    numero;
        float  altura = 1.70f;
        String nome;

        // Exemplos de declaração e atribuição de constante
        final float  PI          = 3.1416F;
        final String NOME_PAGINA = "home";

        // declaração de variáveis inteiras: x e y
        int x, y;

        // declaração de outra variável inteira X (ex. de case sensitive)
        int X;
        // não é boa prática começar nome de variável com maiúscula!

        // declaração de variável lógica
        boolean p, q;
        // declaração de variável do tipo float, que já recebe valor;
        float a = 10.5f;
        // atribuição de valor à variável
        x = 10;
        // atribuição do valor de - 28 para a variável
        y = x - 38;
        // X recebe o resultado da operação, que é igual a 1.
        X = 9 % 2;
        // p recebe o valor de false
        p = (3 >= 5);
        // q recebe o valor de true
        q = (true || false);
        // imprime x = 10 na console
        System.out.println("x = " + x);
        // imprime y = -28 na console
        System.out.println("y = " + y);
        // imprime X = 1 na console
        System.out.println("X = "+ X);
        // imprime p = false na console
        System.out.println("p = " + p);
        // imprime q = true na console
        System.out.println("q = " + q);
        // imprime a = 31,5 na console
        System.out.printf ("a = %.2f", a*3);

        // EXEMPLO 3
        System.out.println("\n EXEMPLO 3");

        Scanner leitor = new Scanner(System.in);

        int x3, y3, z3;

        System.out.println("Entre com o valor de x3 (inteiro): ");
        x3 = leitor.nextInt();

        System.out.println("Entre com o valor de y3 (inteiro): ");
        y3 = leitor.nextInt();

        z3 = x3 + y3;

        System.out.println("Soma de x3 + y3 = " + z3);
        System.out.println("fim");
        leitor.close();

    }

}