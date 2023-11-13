package serialVersionUID;

import java.io.Serializable;
public class Pessoa implements Serializable { // Classe comum, mas serializável!

    // Adiciona um ID de versão serial padrão a classe.
    private static final long serialVersionUID = 1L;

    private String nome;
    private String sobrenome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String firstName) {
        this.nome = firstName;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String lastName) {
        this.sobrenome = lastName;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int age) {
        this.idade = age;
    }
    public String toString() {
        // Agrupa o valor dos atributos em uma String
        StringBuilder builder = new StringBuilder();
        builder.append(nome);
        builder.append("\n");
        builder.append(sobrenome);
        builder.append("\n");
        builder.append(idade);
        builder.append("\n");
        return builder.toString();
    }
}