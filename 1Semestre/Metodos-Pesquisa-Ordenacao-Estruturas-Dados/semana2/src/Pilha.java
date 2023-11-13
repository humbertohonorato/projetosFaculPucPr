public class Pilha {

    public int[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new int[1000];
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public void desempilhar() {
        if (pilhaVazia()) {
            System.out.println("Pilha Vazia");
        }
        this.pilha[this.posicaoPilha--] = 0;
    }

    public void empilhar(int valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.posicaoPilha++;
            this.pilha[this.posicaoPilha] = valor;
        }
    }

    public void mostraPilha() {
        for (int i = this.pilha.length - 1; i >= 0; i--) {
            if (this.pilha[i] != 0) {
                System.out.println(this.pilha[i]);
            }
        }
    }

}