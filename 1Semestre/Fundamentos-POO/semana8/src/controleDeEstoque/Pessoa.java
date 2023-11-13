package controleDeEstoque;

import java.io.Serializable;
import java.util.UUID;

public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    protected UUID codigo;
    private String nome;
    private String documento;
    private String telefone;

    public Pessoa(UUID  codigo, String nome, String documento, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public String toString() {
        String retorno = "";
        retorno += "Codigo: " + this.codigo + " \n";
        retorno += "Nome: " + this.nome + " \n";
        retorno += "Documento: " + this.documento + " \n";
        retorno += "Telefone: " + this.telefone + "\n";
        return retorno;
    }

    public abstract void adicionar();
}
