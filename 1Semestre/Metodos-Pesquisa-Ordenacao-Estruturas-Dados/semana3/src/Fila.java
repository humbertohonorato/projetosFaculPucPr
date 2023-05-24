public class Fila {
    int inicio;
    int fim;
    int tamanho;
    int qtdElementos;
    int fila[];

    public Fila(){
        inicio = fim = -1;
        tamanho  = 6;
        fila = new int[tamanho];
        qtdElementos = 0;
    }

    public boolean estaVazia(){
        if (qtdElementos == 0){
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if (qtdElementos == tamanho -1){
            return true;
        }
        return false;
    }

    public void adicionar(int e){
        if (!estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            fila[fim] = e;
            qtdElementos++;
        }
    }

    public void remover(){
        if (!estaVazia()){
            inicio++;
            qtdElementos--;
        }
    }

    public void mostrar(){
        String elementos = "";
        for (int i = inicio; i <= fim; i++){
            elementos += fila[i]+",";
        }
        System.out.println("Elementos da Fila = " + elementos);
    }

}
