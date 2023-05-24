public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println("Fila Vazia = " + fila.estaVazia());
        System.out.println("Fila Cheia = " + fila.estaCheia());
        fila.adicionar(1);
        fila.adicionar(2);
        fila.adicionar(3);
        fila.adicionar(4);
        fila.adicionar(5);
        fila.mostrar();
        System.out.println("Fila Vazia = " + fila.estaVazia());
        System.out.println("Fila Cheia = " + fila.estaCheia());
        fila.remover();
        fila.mostrar();
    }
}