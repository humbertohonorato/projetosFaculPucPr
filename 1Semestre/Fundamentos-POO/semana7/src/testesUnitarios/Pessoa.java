package testesUnitarios;

public class Pessoa {
    private int idade;

    public void setIdade(int idade) {
        //PRÉ-CONDIÇÃO
        assert(idade < 80);

        if (idade <= 0 || idade >= 120) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        }
        this.idade = idade;
    }
}