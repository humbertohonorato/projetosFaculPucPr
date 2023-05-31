EXERCÍCIOAssociação
Vamos trabalhar nos exemplos passados, para ver como esses conceitos são traduzidas em código Java.

Crie um projeto com as classes dono, cão e cauda, no mesmo pacote default, como indicado.
Execute o projeto a partir da classe dono.
Observe que dono e cão têm uma relação de associação: a classe dono tem um atributo da classe cão: pet; a classe dono cão tem um atributo da classe dono: meuDono
Observe que cão têm uma relação de composição com a classe cauda: uma cauda não existe sem seu cão.
Altere a classe dono para ter mais um cão: pet2. Garanta que pet2 seja alimentado e agrade sua dona Maria.
Será necessário alterar apenas a classe dono: mais um atributo pet2.
Duplique os métodos getter e setter, para pet2.
No método alimentarCao(), acrescente a linha de código para alimentar pet2.
Altere também o método main da classe Dono, para criar mais uma instância de cão.


Resolução do exercício

veja as alterações e acréscimos ao código da questão 4:
private String nome;
private Cao    pet;    // Dono está associado com seu Cão
private Cao    pet2;  // Dono está associado com seu Cão
...
public void setPet (Cao pet) {  this.pet = pet;  }
public Cao getPet () { return this.pet; }

public void setPet2 (Cao pet) {  this.pet2 = pet;  }
public Cao getPet2 () { return this.pet2; }
…
public void alimentarCao() { pet.realizarRefeicao();  pet2.realizarRefeicao();  }
public void receberFesta() {
System.out.println(this.nome + " está recebendo festa de " + this.pet.getNomeCao());
System.out.println(this.nome + " está recebendo festa de " + this.pet2.getNomeCao());
}
…
Cao   bruce  = new Cao  ("Bruce", "Pug", "Macho", 2, "Caracol", "Pêlo curtinho");
...
bruce.setMeuDono    (maria);  // associa Bruce com Maria
...
maria.getPet2().printCao();
...
bruce.agradarDono();   // Bruce agrada sua dona Maria