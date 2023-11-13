public class No {
    private Integer informacao;
    private No proximo;

    public No(){
        informacao = null;
        proximo = null;
    }

    public Integer getInformacao() {
        return informacao;
    }

    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return ": " + getInformacao() ;
    }
}
