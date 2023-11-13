UNIDADE 06
Estrutura de Dados em Java: Árvore Binária
Nesta unidade, examinaremos uma estrutura de dados útil para diversas aplicações: árvore. Definiremos várias formas dessa estrutura de dados e mostraremos como elas podem ser representadas em Java. Como acontece com as listas, trataremos as árvores basicamente como estrutura de dados em vez de como tipo de dados, ou seja, vamos focar basicamente no entendimento do que é uma árvore, na implementação, e não na definição matemática.
Estrutura de dados em Java: árvore
Assim como uma lista, uma árvore binária consiste em um conjunto de nós [1], como pode ser visualizado na Figura 1.
Figura 1: Estrutura de dados, árvore binária

Fonte: O autor (2021).
Existem três componentes em uma árvore binária: a raiz, uma subárvore esquerda e uma subárvore direita, como pode ser visualizado na Figura 2. Cada subárvore também é uma árvore binária e pode ou não estar vazia. Além disso, subárvores esquerda e direita são conjuntos disjuntos de nós [1].
Figura 2: Estrutura de dados, árvore binária e seus componentes

Fonte: O autor (2021).
O elemento da raiz de uma subárvore é chamado nó pai.A raiz de sua subárvore esquerda é chamada filho esquerdo e a raiz da subárvore direita é chamado filho direito. Um determinado nó que não possui filhos (subárvores esquerda e direita são vazias) é chamado de nó folha. Sendo assim, de acordo com a Figura 2, o nó A é o pai, os nós B e C são filhos de A. Os nós D, G, H e I são nós folhas.
Estas árvores são binárias, ou seja, possuem estritamente dois filhos, este filho possui apenas 1 pai. A Figura 3 e 4 ilustram algumas árvores não binárias.
Figura 3: Árvore não binária – exemplo 1

Fonte: O autor (2021).
Figura 4: Árvore não binária – exemplo 2

Fonte: O autor (2021).
Embora as árvores naturais cresçam com suas raízes fincadas na terra e suas folhas no ar, na computação retratam quase universalmente as estruturas de dados em árvore com a raiz no topo e as folhas no chão. O sentido da raiz para as folhas é “para baixo” e o sentido oposto é “para cima”. Quando você percorre uma árvore a partir das folhas na direção da raiz, diz-se que você está “subindo” a árvore, e se partir da raiz para as folhas, você está “descendo” a árvore.
Dois nós são ditos irmãos se são filhos do mesmo nó-pai e a altura de um nó é dada da seguinte forma: a raiz tem altura 0 e a altura de qualquer outro nó é dado pela distância do nó até a raiz da árvore. A altura de uma árvore é dada pela maior altura obtida dentre o conjunto de nós folha da árvore. A Figura 4 demonstra que cada “caminho” possui o valor 1 e a cada caminho de um nó subindo para o seu nó pai, é somado + 1, até que se chegue ao nó raiz. Sendo assim, soma-se por exemplo o valor do caminho I -> F, F -> C e C -> A, com um total de 3, desta forma, a altura da árvore é 3.
Figura 5: Altura de uma árvore binária

Fonte: O autor (2021).
Em uma Lista encadeada, a única forma de pesquisar seus elementos é percorrer a lista sequencialmente, em ordem linear. Porém, em uma árvore existem diversas estratégias de pesquisa. Todas as estratégias de pesquisa em uma árvore envolvem a visita ao nó raiz e as suas subárvores esquerda e direita em uma determinada ordem.
As três estratégias mais simples de travessia em uma árvore binária são as formas: pré-ordem, in-ordem e pós-ordem [1].
Pré-ordem: (Figura 6)
1. visite a raiz da árvore;
2. percorra a subárvore esquerda;
3. percorra a subárvore direita.
Figura 6: Árvore binária – Pré-ordem

Fonte: O autor (2021).
In-ordem: (Figura 7)
1. percorra a subárvore esquerda;
2. visite a raiz da árvore;
3. percorra a subárvore direita.
Figura 7: Árvore binária – In-ordem

Fonte: O autor (2021).
Pós-ordem: (Figura 8)
1. percorra a subárvore esquerda;
2. percorra a subárvore direita
3. visite a raiz da árvore;
Figura 8: Árvore binária – Pós-ordem

Fonte: O autor (2021).
Árvore binária em Java
Em Java, para a criação de uma árvore binária, é necessário a criação de duas classes, a primeira para o Nó (Figura 9) e uma para a ArvoreBinaria (Figura 10).
Figura 9: Classe Nó

Fonte: O autor (2021).
Figura 10: Classe da Árvore Binária

Fonte: O autor (2021).
Existem diversas operações que são necessárias para a construção de uma árvore, como inserir um novo nó.  Para isso, primeiramente precisamos criar uma árvore. Com a árvore criada, podemos perceber que o Nó raiz estará com o valor nulo, pois não foi instanciado. Sendo assim, caso o Nó raiz seja nulo, isso significa que a árvore está vazia, como pode ser visto na Figura 10.
Figura 11: Árvore Binária - vazia

Fonte: O autor (2021).
Desta forma, vamos inserir o valor 10 na árvore. Para isso, devemos seguir pseudocódigo abaixo. Em cor amarela é o código executado. A Figura 12 representará a árvore com o valor 10 inserido.
se Nó Atual for igual a nulo, então...
    Nó Atual receberá um novo objeto Nó com o valor 10

senão se 10 for maior ou igual ao valor do Nó Atual, então...
    se Nó da direita do Nó Atual for nulo, então...
        Nó da direita do Nó Atual receberá um novo nó com o valor 10
    senão se
        faz tudo de novo com o nó da direita (recursividade)

senão se 10 for menor do que o valor do Nó Atual, então...
    se Nó da esquerda do Nó Atual for nulo, então...
        Nó da esquerda do Nó Atual receberá um novo nó com o valor 10
    senão se
        faz tudo de novo com o nó da esquerda (recursividade)

Figura 12: Árvore Binária - insere valor 10

Fonte: O autor (2021).
Agora, vamos inserir o valor 20 na árvore. Para isso, devemos seguir pseudocódigo abaixo. Em cor amarela é o código executado. A Figura 13 representará a árvore com o valor 20 inserido.
se Nó Atual for igual a nulo, então...
    Nó Atual receberá um novo objeto Nó com o valor 20

senão se 20 for maior ou igual ao valor do Nó Atual, então...
    se Nó da direita do Nó Atual for nulo, então...
        Nó da direita do Nó Atual receberá um novo nó com o valor 20
    senão se
        faz tudo de novo com o nó da direita (recursividade)

senão se 20 for menor do que o valor do Nó Atual, então...
    se Nó da esquerda do Nó Atual for nulo, então...
        Nó da esquerda do Nó Atual receberá um novo nó com o valor 20
    senão se
        faz tudo de novo com o nó da esquerda (recursividade)

Figura 13: Árvore Binária - insere valor 20

Fonte: O autor (2021).
Agora, vamos inserir o valor 5 na árvore. Para isso, devemos seguir pseudocódigo a seguir. Em cor amarela é o código executado. A Figura 14 representará a árvore com o valor 5 inserido.
se Nó Atual for igual a nulo, então...
    Nó Atual receberá um novo objeto Nó com o valor 5

senão se 5 for maior ou igual ao valor do Nó Atual, então...
    se Nó da direita do Nó Atual for nulo, então...
        Nó da direita do Nó Atual receberá um novo nó com o valor 5
    senão se
        faz tudo de novo com o nó da direita (recursividade)

senão se 5 for menor do que o valor do Nó Atual, então...
    se Nó da esquerda do Nó Atual for nulo, então...
        Nó da esquerda do Nó Atual receberá um novo nó com o valor 5
    senão se
        faz tudo de novo com o nó da esquerda (recursividade)

Figura 14: Árvore Binária - insere valor 5

Fonte: O autor (2021).
Desta forma, podemos criar uma árvore binária, inserindo diversos valores inteiros. Agora, precisamos fazer com que esta árvore tenha seus valores mostrados para o usuário. Para isso, podemos executar o pseudocódigo a seguir para mostrar os valores da árvore In-ordem, como visto anteriormente.
se Nó Atual for diferente de nulo, então...
    faz tudo de novo com o nó da direita do Nó Atual (recursividade)
    imprime o valor do Nó Atual
    faz tudo de novo com o nó da esquerda do Nó Atual (recursividade)

Com esta lógica, vamos percorrer toda árvore In-ordem e imprimir todos os seus valores.
Para um melhor entendimento, a construção destas classes e métodos em Java, além de outros métodos necessários para a construção de uma árvore, podem ser vistos na videoaula.
Para começar a construir uma árvore binária em Java, precisa-se elaborar alguns métodos, dentre eles, setRight (adicionar filho à direita) e setLeft (adicionar filho à esquerda). Estes métodos serão necessários para preencher toda a árvore binária.
Nesta videoaula com os conhecimentos adquiridos até aqui, você verá a lógica do funcionamento de uma árvore binária em Java, com a construção de alguns exemplos práticos, igualmente visto nos exemplos desta unidade. 
Conclusão
Nesta unidade, foi desdobrado o conteúdo de árvore binária, que é uma estrutura de dados muito importante para a computação. Foi visto não somente o conceito desta estrutura, mas também diversos exemplos do funcionamento de uma árvore binária, e assim, pudemos aprender a como elaborar uma árvore binária e a visualizar seus dados a partir de diversas ordens.
Referências bibliográficas
[1] TENENBAUM, A. M. Estrutura de Dados usando C. Editora MAKRON Books. São Paulo, 1995.


De <https://materiaisonline.pucpr.br/v3/> 



ATIVIDADE FORMATIVA: Árvore Binária – insere e mostra
Uma árvore binária é um conjunto finito de elementos que está vazio ou é particionado em três subconjuntos distintos, o primeiro é a informação e os demais são ponteiros para os nós filhos, à direita e à esquerda respectivamente. Construa uma árvore binária em Java com os métodos de inserir um filho e mostrar os valores, tanto em pré-ordem, in-ordem e pós-ordem. Deverá ser inserido os seguintes valores na árvore, na mesma ordem: 20, 25, 10, 15, 30, 23, 24, 35.
Pré-ordem: 20 10 15 25 23 24 30 35
In-ordem: 10 15 20 23 24 25 30 35
Pós-ordem: 15 10 24 23 35 30 25 20

De <https://eadpucpr.blackboard.com/webapps/blackboard/content/listContent.jsp?content_id=_624914_1&course_id=_5905_1> 


public class BinaryTree {
private Node root;

private void preOrder(Node node) {
    if (node != null) {
        System.out.print(node.info() + " ");
        preOrder(node.left());
        preOrder(node.right());
    }
}

public void preOrder() {
    preOrder(root);
}

private void inOrder(Node node) {
    if (node != null) {
        inOrder(node.left());
        System.out.print(node.info() + " ");
        inOrder(node.right());
    }
}

public void inOrder() {
    inOrder(root);
}

private void postOrder(Node node) {
    if (node != null) {
        postOrder(node.left());
        postOrder(node.right());
        System.out.print(node.info() + " ");
    }
}

public void postOrder() {
    postOrder(root);
}

public Node getRoot() {
    return root;
}

public void insert(Integer value) {
    insert(root, value);
}

private void insert(Node node, Integer value) {
    if (node == null)
        root = new Node(value);
    else if (value >= node.info())
        if (node.right() == null)
            node.setRight(new Node(value));
        else
            insert(node.right(), value);
    else if (node.left() == null)
        node.setLeft(new Node(value));
    else
        insert(node.left(), value);
}
}



public class Node {
private Integer info;
private Node left;
private Node right;

public Node(int info){
    this.info = info;
}

public Integer info() {
    return info;
}

public void setInfo(Integer info) {
    this.info = info;
}

public Node left() {
    return left;
}

public void setLeft(Node left) {
    this.left = left;
}

public Node right() {
    return right;
}

public void setRight(Node right) {
    this.right = right;
}
}
