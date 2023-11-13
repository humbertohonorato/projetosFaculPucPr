UNIDADE 07
Estrutura de Dados: Árvore Binária – remover e buscar
Nesta unidade, examinaremos uma estrutura de dados útil para diversas aplicações: árvore. Definiremos várias formas dessa estrutura de dados e mostraremos como elas podem ser representadas em Java. Como acontece com as listas, trataremos as árvores basicamente como estrutura de dados em vez de como tipo de dados, ou seja, vamos focar basicamente na implementação do método de remover e buscar um valor de uma árvore.

Estrutura de dados em Java: Árvore
Como já foi visto na Unidade da semana passada, uma árvore binária consiste em um conjunto de nós [1], como pode ser visualizado na Figura 1.
Figura 1: Estrutura de dados, árvore binária

Fonte: O autor (2021).
Além das funcionalidades vistas na Unidade anterior, como inserir e mostrar, também podemos remover e buscar um valor dentro de uma árvore.
Árvore binária em Java
Em Java, para a criação de uma árvore binária, é necessário a criação de duas classes, a primeira para o No (Figura 2) e uma para a ArvoreBinaria (Figura 3).
Figura 2: Classe Nó

Fonte: O autor (2021).
Figura 3: Classe da Árvore Binária

Fonte: O autor (2021).
Existem diversas operações que são necessárias para a construção de uma árvore, dentre eles, temos também a de remover um valor já existente dentro de uma árvore.  Para isso, precisamos ter uma árvore com pelo menos um nó não-nulo inserido e executar a lógica abaixo.
se o valor do nó que queremos remover for igual ao valor do nó percorrido, então
    se o nó que queremos remover for um nó folha, simplesmente, então...
        devemos apagá-lo.

    se o nó que queremos remover tiver somente um filho à direita, então...
        se o nó que queremos remover é à direita de seu pai, então...
            substitua o nó à direita do nó que queremos remover à direita do seu pai.
        senão se o nó que queremos remover é à esquerda de seu pai, então...
            substitua o nó à direita do nó que queremos remover à esquerda do seu pai.

    se o nó que queremos remover tiver somente um filho à esquerda, então...
        se o nó que queremos remover é à direita de seu pai, então...
            substitua o nó à esquerda do nó que queremos remover à direita do seu pai.
        senão se o nó que queremos remover é à esquerda de seu pai, então...
            substitua o nó à esquerda do nó que queremos remover à esquerda do seu pai.

    senão se o nó que queremos remover tiver dois filhos, então...
        devemos obter o maior à esquerda e...
        substituir o nó que queremos remover pelo maior à esquerda

se o valor do nó que queremos remover é maior ou igual ao valor do nó percorrido, então...
    faça tudo de novo com o nó da direita do nó percorrido (recursividade)

se o valor do nó que queremos remover é menor que valor do nó percorrido, então...
    faça tudo de novo com o nó da esquerda do nó percorrido (recursividade)
Para obter o maior à esquerda, devemos primeiro verificar se o nó à esquerda é diferente de nulo, caso seja, devemos percorrer todos os nós à direita sucessivamente até achar o maior. Este maior valor, será retornado e ocupará o espaço do nó removido da árvore.
A lógica demonstrada acima, faz com que possamos remover um nó de uma árvore, essa lógica é necessária, pois ao remover um nó, seus filhos não serão removidos consequentemente e sim remanejados em novas posições da árvore. A Figura 4 demonstra essa lógica.
Figura 4: Excluir valor da Árvore Binária

Fonte: O autor (2021).
Além de remover, também podemos verificar se um nó existe ou não na árvore através de uma simples busca. Esta busca consiste em analisar o valor desejado na árvore, se o valor desejado é maior do que o primeiro valor da árvore, então analise o nó da direita, caso contrário, analise o nó da esquerda. Está lógica pode ser observada no pseudocódigo abaixo.
se o nó percorrido não é nulo, então
    se o valor do nó percorrido é igual ao valor que sejamos encontrar, então...
        nó encontrado

    senão se o valor do nó percorrido é maior do que o valor que sejamos encontrar, então...
        faça tudo de novo com o nó da direita do nó percorrido (recursividade)

    senão se o valor do nó percorrido é menor do que o valor que sejamos encontrar, então...
        faça tudo de novo com o nó da esquerda do nó percorrido (recursividade)

senão
    nó não encontrado
Com os conhecimentos adquiridos até aqui, você verá, na videoaula, a lógica do funcionamento de uma árvore binária em Java, com a construção de alguns exemplos práticos, igualmente visto nos exemplos desta unidade.
Conclusão
Nesta unidade, foi desdobrado o conteúdo de árvore binária, que é uma estrutura de dados muito importante para a computação. Foi visto não somente o conceito desta estrutura, mas também diversos exemplos do funcionamento de uma árvore binária, e assim, pudemos aprender com estes exemplos da unidade e videoaula a como elaborar uma árvore binária e a visualizar de seus dados a partir de diversas ordens.
Referências bibliográficas
[1] TENENBAUM, A. M. Estrutura de Dados usando C. Editora MAKRON Books. São Paulo, 1995.

De <https://materiaisonline.pucpr.br/v3/> 





ATIVIDADE FORMATIVA: Árvore Binária – remove e procura
Uma árvore binária é um conjunto finito de elementos que está vazio ou é particionado em três subconjuntos distintos, o primeiro é a informação e os demais são ponteiros para os nós filhos, à direita e à esquerda respectivamente. Construa uma árvore binária em Java com os métodos de remover um filho e procurar um determinado valor dentro da árvore.

De <https://eadpucpr.blackboard.com/webapps/blackboard/content/listContent.jsp?content_id=_624915_1&course_id=_5905_1> 


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

public Node search(Integer value) {
    return search(root, value);
}

private Node search(Node node, Integer value) {
    if (node != null) {
        if (node.info() == value) {
            System.out.println("Node encontrado!");
            return node;
        } else if (value >= node.info()) {
            return search(node.right(), value);
        } else {
            return search(node.left(), value);
        }
    } else {
        System.out.println("Node não encontrado!");
        return null;
    }
}

public Node remove(BinaryTree bt, Integer value) {
    Node balancing = remove(bt, root, value, null);
    return balancing;
}

private Node remove(BinaryTree bt, Node node, Integer value, Node father) {
    if (node != null) {
        if (node.info() == value) {
            if (node.left() == null && node.right() == null) {  //Sem filhos
                if(father == null) {
                    bt.root = null;
                }
                else if (node.info() >= father.info()) {
                    father.setRight(null);
                } else {
                    father.setLeft(null);
                }
                return node;
            } else if (node.left() == null) {                   //Somente um filho na direita
                if (node.info() >= father.info()) {
                    father.setRight(node.right());
                } else {
                    father.setLeft(node.right());
                }
                node.setLeft(null);
                return node;
            } else if (node.right() == null) {                  //Somente um filho na esquerda
                if (node.info() >= father.info()) {
                    father.setRight(node.left());
                } else {
                    father.setLeft(node.left());
                }
                node.setLeft(null);
                return node;
            } else {        
                int minor = minorLeft(node).info();  
                int removeinfo = remove(bt, minor).info();                         //Dois filhos
                node.setInfo(removeinfo);
                return node;
            }
        }
        if (value >= node.info()) {
            return remove(bt, node.right(), value, node);
        } else {
            return remove(bt, node.left(), value, node);
        }
    }
    return null;
}

private Node minorLeft(Node node) {
    if (node.left() != null) {
        node = node.left();
        while (node.right() != null) {
            node = node.right();
        }
    }
    return node;
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

