package fatorial;

public class Fatorial {

    public int fatorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }

    public int fatorialIterativo(int n){
        int fat = 1;
        for (int i = 2; i <= n; i++)
            fat = fat * i;
        return fat;
    }

    public static void main(String[] args) {

        Fatorial fat = new Fatorial();
        System.out.println(fat.fatorialIterativo(5));

        System.out.println(fat.fatorialRecursivo(5));
    }

}
