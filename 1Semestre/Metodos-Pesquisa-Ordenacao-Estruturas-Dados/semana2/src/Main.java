public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(2);
        pilha.mostraPilha();
        pilha.desempilhar();
        pilha.mostraPilha();
    }
//LIFO - Last in, first out
}