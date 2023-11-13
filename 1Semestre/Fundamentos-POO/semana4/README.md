ADE 04
Interação entre Objetos
Olá! Nesta Unidade, vamos explorar a associação entre objetos, com o objetivo de verificar como o trabalho conjunto das classes traz os benefícios mais significativos. Faremos isso explorando com maior detalhamento a interação entre os objetos, que é proporcionada pela associação entre classes.
Associação entre classes e ligação entre objetos
No dia a dia, verificamos que existem vários objetos diferentes no mundo real que se associam e trabalham em conjunto. Veja os exemplos apresentados na Figura 1.
Considere  as diferenças e similaridades entre os objetos da classe dono, cão e cauda. Conseguimos identificar as seguintes relações:
• Donos alimentam seus cães e cães agradam seus donos (associação).
• Caudas são parte de cão, ou o cão possui cauda (agregação/composição).
Explicando os conceitos de associação, agregação e composição:
• Associação: se duas classes precisam se comunicar, deve haver uma ligação entre elas, e isso pode ser representado por uma associação (conector).
• Agregação e composição são casos específicos da associação; em ambas, o objeto de uma classe "possui" objeto de outra classe, em um relacionamento parte-todo. Mas há uma diferença sutil.
   ○ Agregação é um relacionamento em que a parte pode existir independentemente do todo, como no exemplo: turma (todo)  e aluno (parte da turma). Exclua a turma e os alunos ainda existirão.
   ○ Composição é um relacionamento em que a parte não existe sem o todo. Exemplo: casa (todo) e quarto (parte). Os quartos não existem sem sua casa.
Figura 1 – Tipos de relação entre objetos

Fonte: Autores (2020).
EXERCÍCIO
Associação
Vamos trabalhar nos exemplos passados, para ver como esses conceitos são traduzidas em código Java.
1. Crie um projeto com as classes dono, cão e cauda, no mesmo pacote default, como indicado.
2. Execute o projeto a partir da classe dono.
3. Observe que dono e cão têm uma relação de associação: a classe dono tem um atributo da classe cão: pet; a classe dono cão tem um atributo da classe dono: meuDono
4. Observe que cão têm uma relação de composição com a classe cauda: uma cauda não existe sem seu cão.
5. Altere a classe dono para ter mais um cão: pet2. Garanta que pet2 seja alimentado e agrade sua dona Maria.
   a. Será necessário alterar apenas a classe dono: mais um atributo pet2.
   b. Duplique os métodos getter e setter, para pet2.
   c. No método alimentarCao(), acrescente a linha de código para alimentar pet2.
   d. Altere também o método main da classe Dono, para criar mais uma instância de cão.
Figura 2 – Exercício para associação das classes dono, cão e cauda


publicclassCao{// Associação: meuDono é uma referência da privateDono   meuDono;// classe Dono e também atributo da classe CãoprivateString nomeCao;privateString raca;privateString genero;privateint    idade;privateCauda  minhaCauda;// Composição: Cão possui CaudapublicCao(String nome,String raca,String genero,int idade,String forma,String tipoPelo){this.nomeCao =nome;this.raca =raca;this.genero =genero;this.idade =idade;// Composição: a cauda faz parte do cãothis.minhaCauda =newCauda(forma,tipoPelo);}publicvoidsetMeuDono(Dono meuDono){this.meuDono =meuDono;}publicString getNomeCao(){returnnomeCao;}publicvoidprintCao(){System.out.println("  Nome:   "+this.nomeCao);System.out.println("  Raça:   "+this.raca);System.out.println("  Gênero: "+this.genero);System.out.println("  Idade:  "+this.idade);minhaCauda.printCauda();System.out.println();}publicvoidrealizarRefeicao(){System.out.println(this.nomeCao +" fazendo sua refeição.");}publicvoidagradarDono(){this.meuDono.receberFesta();// Invoca método da classe Dono}}


publicclassCauda{privateString forma;privateString tipoPelo;publicCauda(String forma,String tipoPelo){this.forma =forma;this.tipoPelo =tipoPelo;}publicvoidprintCauda(){System.out.println("  Cauda:  "+this.forma +" com "+this.tipoPelo);}}


publicclassDono{privateString nome;privateCao    pet;// Dono está associado com seu CãopublicDono(String nome){this.nome =nome;}publicvoidsetPet(Cao pet){this.pet =pet;}publicCao getPet(){returnthis.pet;}publicvoidalimentarCao(){pet.realizarRefeicao();}publicvoidreceberFesta(){System.out.println(this.nome +" está recebendo festa de "+this.pet.getNomeCao());}publicstaticvoidmain(String[]args){Dono  maria  =newDono("Maria");Cao   pipoca =newCao("Pipoca","Beagle","Fêmea",3,"Enrolada","Pêlo curtinho");maria.setPet(pipoca);// associa Maria com Pipocapipoca.setMeuDono(maria);// associa Pipoca com MariaSystem.out.println("Cãozinho de "+maria.nome);maria.getPet().printCao();maria.alimentarCao();// Maria alimenta o seu cão Pipocapipoca.agradarDono();// Pipoca agrada sua dona Maria	}}

Fonte: Autores (2020).
• Resolução do exercício
Diagrama de classes da associação
O código-exemplo da Figura 2 pode ser representado em um modelo específico, dado por seu diagrama de classes, conforme apresentado na Figura 3.
A especificação em Unified Modeling Language1 (UML), das classes do Exercício 1, dono, cão e cauda, é apresentada a seguir:
1.  Todos os atributos são privados (encapsulamento, com modificador -).
2. Todos os métodos são públicos (com modificador +, são a interface das classes).
3. Os atributos de outras classes aparecem nas ligações (conectores), também como privados (modificador -), na extremidade com flecha do conector.
4. O “x” no conector significa que não há visibilidade entre as classes no sentido oposto ao da flecha.
5. Este diagrama foi gerado pela ferramenta ASTAH2, a partir do código Java do exercício 1.
Figura 3 – Diagrama das classes dono, cão e cauda

Fonte: Autores (2020).
1Linguagem Unificada de Modelagem, que modela aplicações orientada a objetos
2http://astah.net é uma ferramenta de diagramação e modelagem de aplicações
Observe que na Figura 3, o diagrama da UML coloca os atributos de outras classes nas extremidades da ligação (conector) entre as classes, e não dentro da notação de retângulo que representa a classe, em que há uma divisão apenas para os atributos. Essa é a forma que a UML usa para destacar a associação entre os objetos de classes, e é uma boa prática de modelagem.
Observe o detalhe a seguir de como o diagrama da Figura 3 é traduzido para Java, da Figura 2:

publicclassCao{// Associação: meuDono é uma referência da privateDono   meuDono;// classe Dono e atributo da classe CãoprivateString nomeCao;privateString raca;privateString genero;privateint    idade;privateCauda  minhaCauda;// Associação do tipo Composição: Cão // possui Cauda

Utilização de objeto e referência de objeto
Recapitulando: um objeto é uma instância de uma classe e uma classe pode ter vários objetos, ou várias instâncias. Quando precisamos acessar esses objetos, utilizamos sua referência, que é o nome da variável do objeto que instanciamos, nos nossos códigos.
Para instanciar uma classe, ou criar um objeto, em Java, usamos a palavra-chave new, como demostrado a seguir, em que o objeto da classe dono tem o nome de variável, ou referência, igual a maria:

Dono  maria  =newDono("Maria");// maria é referência à instância de Dono

Em Java, um objeto existe apenas quando é instanciado com a palavra-chave new.
Podemos e devemos utilizar os objetos e suas referências de diferentes formas. Vejam como fazemos isso, com base nos exemplos já passados nas Figura 2 e Figura 3.
Objeto utilizado como atributo
Começando na Figura 2, na classe cao, observamos que na Linha 2 temos o atributo meuDono, do tipo classe dono. Da mesma forma, na linha 7, temos o atributo minhaCauda, do tipo classe cauda.
O nome dos atributos meuDono e minhaCauda também são referências a esses objetos. Isso significa que um objeto da classe cao faz referência a objetos das classes dono e cauda:

Objeto utilizado como variável local
Para que um objeto de cao fique completo, precisamos instanciar dono e cauda. Isso é feito na classe dono, nas linhas 22 a 27, da classe dono na Figura 2:

Observe que as variáveis maria e pipoca, que são referências a objetos das classes dono e cao, respectivamente, também são variáveis locais, pois existem apenas dentro do método main, que vai das linhas 22 a 34 na classe dono.
Variáveis locais apenas são acessíveis, ou visíveis, dentro do escopo em que foram criados, como dentro dos limitadores {  e  } de um método.
Objeto utilizado como parâmetro (argumento)
Novamente, na Figura 2, classe dono, vemos o método Dono.setPet que espera receber um objeto da classe cao como argumento ou parâmetro:

publicvoidsetPet(Cao pet){// argumento = petthis.pet =pet;// atributo recebe o argumento}

Da mesma forma, na Figura 2, classe cao, o método Cao.setMeuDono espera receber um objeto da classe dono como argumento ou parâmetro:

publicvoidsetMeuDono(Dono meuDono){// argumento = meuDonothis.meuDono =meuDono;// atributo recebe o argumento }

Esses métodos Dono.setPet e Cao.setMeuDono apenas podem ser invocados se existirem os objetos  que serão usados como parâmetros. Vejam suas invocações no exemplo da classe dono na Figura 2, nas linhas 26 e 27, em que os objetos de classes dono e cao são usados como parâmetros (ou argumentos) de método:

Observação: primeiramente, instanciamos maria e pipoca, para depois utilizá-los como parâmetros.
Objeto utilizado como retorno de método
Mais um exemplo da Figura 2, classe cao: vemos o método Cao.sgetNomeCao retorna o valor do atributo nomeCao, que é do tipo string – recordando que string no Java é uma classe, logo, nomeCao faz referência a um objeto da classe string.

publicString getNomeCao(){returnnomeCao;

Recapitulando: um método tem a sua assinatura definida como (mais detalhes na Unidade 2).
tipo nomeMetodo (tipo parametro1, tipo parametro2, ..., tipo parametroN) {
   // corpo do método
}
Antes no nome do método, temos o tipo de dado que o método retorna, que neste exemplo é uma instância (objeto) da classe string. Logo, o método tem que ter obrigatoriamente a palavra-chave return, seguido do valor que será retornado pela invocação (chamada do método).
Coleção de objetos: vetores e listas
Em algumas soluções computacionais, precisamos que um objeto mantenha várias instâncias de outros objetos. Fizemos isso no Exercício 1 - Associação, no qual solicitamos a criação de outro pet para Maria, de forma que ele tivesse dois cães, ou dois objetos da classe cao:

publicclassDono{privateString nome;privateCao    pet;// Dono está associado com seu Cão 1privateCao    pet2;// Dono está associado com seu Cão 2...}

Contudo, essa não é a melhor forma de manter vários objetos da mesma classe! Uma solução mais flexível deve ser usada para resolver os casos em que precisamos de uma coleção de objetos. O Java oferece algumas alternativas para criar essas coleções, como veremos a seguir com as soluções dadas por vetores e lista de objetos.
EXERCÍCIO
Vetores
Em Java, um vetor, ou array, é um objeto que mantém um número fixo de valores de um único tipo de dado. Portanto, comprimento do vetor (array length) é fixo, pois é definido no momento de sua criação, ou instanciação (precisamos usar a palavra-chave new) e não pode ser alterado.
Para acessar cada elemento do vetor precisamos usar um índice, como apresentado na Figura 4 a seguir.

Código Java correspondente:
Figura 4 – Exercício com vetor (array)

int[]meuVetor =newint[5];meuVetor[0]=33;meuVetor[1]=47;meuVetor[2]=78;meuVetor[3]=5;meuVetor[4]=18;for(int i=0;i<meuVetor.length;i++)System.out.println("meuVetor["+i +"] = "+meuVetor[i]);// meuVetor.length = comprimento do vetor = 5 inteiros mantidos no vetor

Fonte: Autores (2020).
Na Figura 5 a seguir, apresentamos a alteração necessária para que o exemplo da Figura 2 possa manter um vetor de objetos da classe cao.
EXERCÍCIO
1. Mantendo os arquivos das classes cao e cauda, da Figura 2, crie uma classe dono conforme o indicado.
2. Observe que dono agora tem um atributo do tipo vetor de objetos da classe cao, atributo chamado de pets.
3. Observe que para manipular o vetor pets e acessar todos os seus objetos, usamos uma variável inteira index que aponta o objeto que queremos de pets, como no exemplo: this.pets[index] = pet;
4. Execute o projeto a partir da classe dono.
5. Responda:
a. O que acontece quando alteramos linha 9 e acrescentamos a linha 52?
   linha 9       pets = new Cao[4];
   linha 52    maria.getPet(3).printCao();
b. O que acontece quando alteramos na linha 38 o valor do índice que pipoca deve ter no vetor pets, para 20:      maria.addPet      (20, pipoca); ?
Figura 5 – Exercício com vetor de objetos da classe cão

publicclassDono{privateString nome;privateCao[]pets;// Dono está associado a um vetor pets de cãespublicDono(String nome){this.nome =nome;// Cria uma instância do vetor;pets =newCao[3];// vetor preparado para receber até 3 cães}publicvoidaddPet(int index,Cao pet){// inclui um objeto de cãothis.pets[index]=pet;// no vetor pets}publicCao getPet(int index){// obtém uma instância de Caoreturnthis.pets[index];// na posição index do vetor pets}publicvoidalimentarCaes(){for(int i=0;i<3;i++)// Invoca realizarRefeicaopets[i].realizarRefeicao();// de cada objeto de pets}publicvoidreceberFesta(){// Invoca o método receberFestafor(int i=0;i<3;i++)// de cada objeto de petsSystem.out.println(this.nome +" está recebendo festa de "+this.pets[i].getNomeCao());}publicvoidlistarCaes(){// lista todos os cães do vetor petsfor(int i=0;i<3;i++)this.getPet(i).printCao();}publicstaticvoidmain(String[]args){Dono  maria  =newDono("Maria");Cao   pipoca =newCao("Pipoca","Beagle","Fêmea",3,"Enrolada","Pêlo curtinho");Cao   bruce  =newCao("Bruce","Pug","Macho",2,"Caracol","Pêlo curtinho");Cao   jujuba =newCao("Jujuba","Maltês","Fêmea",1,"Enrolada","Pêlo longo");maria.addPet(0,pipoca);// Pipoca está na posição 0 de petsmaria.addPet(1,bruce);// Bruce  está na posição 1 de petsmaria.addPet(2,jujuba);// jujuba está na posição 2 de petspipoca.setMeuDono(maria);// associa Pipoca com Mariabruce.setMeuDono(maria);// associa Bruce com Mariajujuba.setMeuDono(maria);// associa Jujuba com Maria//Lista todos os cães de MariaSystem.out.println("Cãozinhos de "+maria.nome);maria.listarCaes();maria.alimentarCaes();// Maria alimenta todos os  cães maria.receberFesta();// Maria recebe festa de todos os cães}}

Fonte: Autores (2020).
• Resolução do exercício
EXERCÍCIO
Listas de objetos com ArrayList
A classe ArrayList provê um objeto do tipo vetor, porém com comprimento variável: diferentemente do vetor (array), o ArrayList não tem um comprimento fixo!
O ArrayList, que está na biblioteca java.util, precisa que seja declarada a classe dos objetos que serão mantidos na sua estrutura. Veja o exemplo da Figura 6.

Código Java correspondente:
Figura 6 – Exercício com ArrayList de objetos da classe string

importjava.util.ArrayList;publicclassListaCores{publicstaticvoidmain(String[]args){int i;// Declara a instancia o ArrayList coresArrayList<String>cores =newArrayList<String>();cores.add("Azul");// Inclui elemento no ArrayListcores.add("Verde");// Inclui elemento no ArrayListcores.add("Vermelho");// Inclui elemento no ArrayListcores.add("Amarelo");// Inclui elemento no ArrayList// Loop para varrer a lista, elemento por elementofor(i =0;i <cores.size();i++)// imprime cada elemento  System.out.println((i+1)+"º) "+cores.get(i));// ALTERA elemento da lista:cores.set(1,"Pink");// altera elemento na posição 1 para "Pink"i=0;System.out.println("----");// Loop for-each para varrer a lista, elemento por elementofor(String c :cores){// imprime cada elementoSystem.out.println((i+1)+"º) "+c);i++;}// REMOVE elemento da lista da posição 3: “Vermelho”cores.remove(3);i=0;System.out.println("----");// Loop for-each para varrer a lista, elemento por elementofor(String c :cores){// imprime elemento por elementoSystem.out.println((i+1)+"º) "+c);i++;}// LIMPA a lista: exclui todos os objetos de Stringcores.clear();System.out.println("----");System.out.println("Tamanho da lista = "+cores.size());}}

Fonte: Autores (2020).
A Figura 7 apresenta outros métodos da classe ArrayList, muito úteis e que tornam esse recurso poderoso, provendo muita flexibilidade para a manipulação de uma coleção de objetos.
Figura 7 – Métodos do ArrayList

Referência para consulta: https://www.w3schools.com/java/java_arraylist.asp.Fonte: Autores (2020).
Na Figura 8 a seguir, será possível realizar um exercício mais completo, em que criamos uma classe dependente, cujos objetos são mantidos pela classe contribuinte em um atributo de ArrayList. Vamos praticar!
EXERCÍCIO

1. Crie os arquivos com os códigos fonte das classes dependente, contribuinte e ReceitaFederal, conforme o indicado.
2. Observe que contribuinte tem um atributo do tipo ArrayList de objetos da classe dependentes, atributo chamado de dep: private ArrayList <Dependente> dep;
3. Observe que a instância dep é criada no método construtor da classe contribuinte: dep = new ArrayList <Dependente>();
4. Observe que para manipular pets e acessar cada um dos seus objetos, usamos um iterador fo tipo for-each:
for (Dependente d : dep) { 
               d.imprimir();
   }          
5. Execute o projeto a partir da classe ReceitaFederal.
6. Altere a classe ReceitaFederal:
   1. Acrescente um novo contribuinte Pedro, sem dependente. Imprima o total de dependentes de Pedro (zero dependentes).
   2. Acrescente um novo contribuinte João, com uma única dependente Ana. Imprima o total de dependentes de Pedro (uma dependente).
Figura 8 – Exercício com ArrayList de objetos da classe dependente

publicclassDependente{privateString nome;publicDependente(String nome){this.nome =nome;}publicvoidimprimir(){System.out.println("Dependente: "+nome);}}


importjava.util.ArrayList;publicclassContribuinte{privateString nome;privateArrayList <Dependente>dep;publicContribuinte(String nome){this.nome =nome;dep =newArrayList<Dependente>();}publicvoidligarDependente(Dependente d){dep.add(d);}publicvoidimprimir(){System.out.println("Contribuinte : "+this.nome);imprimirDependentes();}privatevoidimprimirDependentes(){for(Dependente d :dep){d.imprimir();}}publicint numeroDependentes(){returndep.size();}}


publicclassReceitaFederal{publicstaticvoidmain(String[]args){Contribuinte julia =newContribuinte("Julia");Dependente jorge =newDependente("Jorge");Dependente sandra =newDependente("Sandra");julia.ligarDependente(jorge);julia.ligarDependente(sandra);julia.imprimir();System.out.println("Numero de dependentes : "+julia.numeroDependentes()+"\n");Contribuinte leonardo =newContribuinte("Leonardo");Dependente marta =newDependente("Marta");Dependente diego =newDependente("Diego");Dependente claudia =newDependente("Claudia");leonardo.ligarDependente(marta);leonardo.ligarDependente(diego);leonardo.ligarDependente(claudia);leonardo.imprimir();System.out.println("Numero de dependentes: "+leonardo.numeroDependentes()+"\n");}}

Fonte: Autores (2020).
• Resolução do exercício
EXPERIMENTE
Referências
GODOY, V. Programação orientada a objetos I. Curitiba: IESDE, 2019.
HORSTMANN, C. S.; CORNELL, G. Core Java – volume I. 8. ed. São Paulo: Pearson, 2010. 
SCHILDT, H. Java para iniciantes. Porto Alegre: Bookman, 2015.

De <https://materiaisonline.pucpr.br/v3/> 



ATIVIDADE FORMATIVA: Entendendo e praticando como os objetos interagem
• Primeiramente, estude o material didático da Unidade 4 – Interação entre objetos, para então desenvolver as seguintes atividades:
1. Realize o item relativo à associação entre classes e ligação entre objetos, de acordo com as práticas indicadas no material didático, em:
1. Figura 2. Exercício para associação das classes Dono, Cão e Cauda.
2. Realize o item referente à utilização de objeto e referência de objeto, de acordo com as práticas indicadas no material didático. Neste caso, verificamos a utilização de objetos e suas referências nas práticas já realizadas em:
1. Figura 2. Exercício para associação das classes Dono, Cão e Cauda.
3. Realize o item relativo à coleção de objetos, de acordo com as práticas indicadas no material didático, em:
1. Figura 4. Exercício com vetor (array).
2. Figura 5. Exercício com um vetor de objetos da classe Cão.
3. Figura 6. Exercício com ArrayList de objetos da classe String.
4. Figura 8. Exercício com ArrayList de objetos da classe Dependente.

De <https://eadpucpr.blackboard.com/webapps/blackboard/content/listContent.jsp?content_id=_635055_1&course_id=_5984_1> 












































