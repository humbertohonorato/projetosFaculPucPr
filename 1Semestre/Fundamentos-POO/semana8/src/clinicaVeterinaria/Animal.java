package clinicaVeterinaria;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    protected String nome;
    protected String especie;
    private String dono;

    public Animal(String nome, String dono) {
        this.nome = nome;
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", dono='" + dono + '\'' +
                ", alimentacao ='" + alimentacao() + '\'' +
                ", cuidados proprios =" + cuidadosProprios() + '\'' +
                '}';
    }

    public abstract String alimentacao();
    public abstract String cuidadosProprios();


}
