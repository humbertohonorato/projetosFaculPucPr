package Encapsulamento;

class B {
    static void f() {
        System.out.println("Método f (sem modificador)");
        A.g();
        int x = A.k;
        System.out.println("Valor de x = " + x);
        A.k = 10;
        System.out.println("Valor de k = " + A.k);
    }

    public static void main(String args[]) {
        f();
    }
}
