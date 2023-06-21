package interfaceGraficaComPersistenciaDeDados;

public class Gato extends Mamifero {

    public String soar() {
        return "Faz miados";
    }

    public Gato(String nome, int idade, String dono) {
        super(nome, idade, dono);
        this.especie = "Gato";
    }
}