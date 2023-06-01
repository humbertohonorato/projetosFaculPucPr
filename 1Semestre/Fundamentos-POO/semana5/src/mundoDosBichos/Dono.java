package mundoDosBichos;

public class Dono {
    private String nome;
    private Pet pet; // Dono está associado com seu Pet
    public Dono(String nome) {
        this.nome = nome;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Pet getPet() {
        return this.pet;
    }
    public void alimentar() {
        pet.realizarRefeicao();
    }
    public void receberFesta() {
        System.out.println(this.nome + " está recebendo festa de " +
                this.pet.getNome());
    }

    public static void main(String[] args) {
        Dono maria = new Dono("Maria");

        System.out.println("\n*** Cão de " + maria.nome);
        Cao pipoca = new Cao("Pipoca", "Beagle", "Fêmea", 3,
                "Enrolada", "Pêlo curtinho");
        maria.setPet(pipoca); // Torna Pipoca o Pet de Maria
        pipoca.setMeuDono(maria); // Associa Pipoca com Maria
        maria.getPet().print();
        maria.alimentar(); // Maria alimenta o seu cão Pipoca
        pipoca.agradarDono(); // Pipoca agrada sua dona Maria

        System.out.println("\n*** Gata de " + maria.nome);
        Gato mel = new Gato("Mel", "Siamesa", "Fêmea", 2, "Lisa", "Pêlo liso");
        maria.setPet(mel); // Troca o Pet de Maria para a gata Mel
        mel.setMeuDono(maria); // Associa Mel com Maria
        maria.getPet().print();
        maria.alimentar(); // Maria alimenta Mel
        mel.agradarDono(); // Mel agrada sua dona Maria

        System.out.println("\n*** Peixe de " + maria.nome);
        Peixe nemo = new Peixe("Nemo", "Peixe Palhaço", 1, "Laranja");
        maria.setPet(nemo); // Troca o Pet de Maria para o peixe Nemo
        nemo.setMeuDono(maria); // Associa Nemo com Maria
        maria.getPet().print();
        nemo.agradarDono(); // Nemo agrada sua dona Maria
    }
}