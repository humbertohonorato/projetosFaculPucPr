package fibonacci;

public class SequenciaFibonacci {
    public static class Fibonacci {
        int fibo(int n) {
            if(n < 2){
                return n;
            }
            else {
                return fibo(n - 1) + fibo(n - 2);
            }
        }
    }


    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 30; i++) {
            System.out.print(f.fibo(i) + " ");
        }
    }

}
