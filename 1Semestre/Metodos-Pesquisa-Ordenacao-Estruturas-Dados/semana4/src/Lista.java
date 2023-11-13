public class Lista {

    private No primeiro;

    public Lista(){
        this.primeiro = null;
    }

    public boolean vazia(){
        return primeiro == null;
    }

    public void inserePrimeiro(int info){
        No auxiliar = new No();
        auxiliar.setInformacao(info);
        auxiliar.setProximo(primeiro);
        primeiro = auxiliar;
    }

    public void insereDepois(No no, int info){

        if (no == null) {
            System.out.println("Nó de referência é nulo, não é possível inserir depois");
            return;
        }

        No novo = new No();
        novo.setInformacao(info);
        novo.setProximo(no.getProximo());
        no.setProximo(novo);
    }

    public void insereUltimo(int info){
        if (vazia()){
            inserePrimeiro(info);
        } else {
            No auxiliar = primeiro;

            while (auxiliar != null && auxiliar.getProximo() != null){
                auxiliar = auxiliar.getProximo();
            }

            if (auxiliar.getProximo() == null){
                No novo = new No();
                novo.setInformacao(info);
                auxiliar.setProximo(novo);
            }
        }
    }

    public No removePrimeiro() {
        if (vazia()) {
            System.out.println("A lista está vazia. Não é possível remover o primeiro elemento.");
            return null;
        }

        No removido = primeiro;
        primeiro = primeiro.getProximo();
        removido.setProximo(null);
        return removido;
    }

    public No removeUltimo() {
        if (vazia()) {
            System.out.println("A lista está vazia. Não é possível remover o último elemento.");
            return null;
        }

        No auxiliar = primeiro;
        No anterior = null;

        while (auxiliar.getProximo() != null) {
            anterior = auxiliar;
            auxiliar = auxiliar.getProximo();
        }

        if (anterior == null) {
            // Só há um elemento na lista
            primeiro = null;
        } else {
            anterior.setProximo(null);
        }

        return auxiliar;
    }

    public No remove(No no) {
        if (vazia()) {
            System.out.println("A lista está vazia. Não é possível remover o elemento.");
            return null;
        }

        if (no == null) {
            System.out.println("Nó de referência é nulo. Não é possível remover.");
            return null;
        }

        No auxiliar = primeiro;
        No anterior = null;

        while (auxiliar != null && auxiliar != no) {
            anterior = auxiliar;
            auxiliar = auxiliar.getProximo();
        }

        if (auxiliar == null) {
            System.out.println("O nó informado não foi encontrado na lista.");
            return null;
        }

        if (anterior == null) {
            // Nó a ser removido é o primeiro da lista
            primeiro = auxiliar.getProximo();
        } else {
            anterior.setProximo(auxiliar.getProximo());
        }

        auxiliar.setProximo(null);
        return auxiliar;
    }

    public void mostrar(){
        No auxiliar = primeiro;
        System.out.print("lista : ");
        while (auxiliar != null){
            System.out.print(auxiliar.getInformacao() + ", ");
            auxiliar = auxiliar.getProximo();
        }
    }

    public No buscar(int o) {
        No p = this.primeiro;
        while ((p != null) && (p.getInformacao() != o))
            p = p.getProximo();
        return p;

    }
}
