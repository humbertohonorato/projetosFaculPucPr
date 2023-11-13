Métodos de Pesquisa e Ordenação em Estruturas de Dados
UNIDADE 03
Estrutura de Dados: Fila

Nesta unidade, será apresentado o conteúdo de fila, uma importante estrutura de dados usada frequentemente para simular situações do mundo real. Será examinado esta estrutura de dados e verificaremos por que ela desempenha esse proeminente papel nas áreas de programação e de linguagens de programação. Definiremos o conceito abstrato de uma fila, além de suas diversas operações associadas.
A estrutura de dados fila, funciona exatamente como uma fila que temos no mundo real (Figura 1). A primeira pessoa a ser atendida (sair da fila), é a que está em primeiro, a última a ser atendida (última a sair) é a que está por último. Caso uma nova pessoa chegue, ela obrigatoriamente deverá ir para o final da fila (última posição da fila). 
Figura 1: Estrutura de dados, Fila

Fonte: O autor (2021).
Dentro do universo das estruturas de dados, fila funciona exatamente igual ao exemplo anterior, sendo assim, fila é uma coleção ordenada de itens na qual itens podem ser retirados pela posição frontal, chamada primeiro, e elementos podem ser inseridos na última posição, chamada último [1]. A Figura 2 ilustra uma fila contendo elementos, A, B e C. A é o início da fila e C é o final. 
Figura 2: Estrutura de dados, Fila

Fonte: O autor (2021).
É possível também retirar elementos da estrutura de dados. Os elementos só podem ser eliminados a partir do início da fila, ou seja, A é removido e B passa a ocupar o início da fila (Figura 3). 
Figura 3: Estrutura de dados, Fila

Fonte: O autor (2021).
Para inserir itens na estrutura de dados esse processo deverá ocorrer no final da fila. No exemplo abaixo (Figura 4) vemos que D foi inserido antes de E e logo ele será removido em primeiro lugar. O primeiro elemento inserido numa fila é o primeiro a ser removido. Por esta razão, uma fila é ocasionalmente chamada de fifo (first-in, first-out – o primeiro que entra é o primeiro a sair). 

Figura 4: Estrutura de dados, Fila

Fonte: O autor (2021).

Fila em Java
A definição de uma estrutura para fila necessita de apenas três membros, um campo chamado primeiro, último e um campo onde as informações são armazenadas representado por um array chamado dados. O campo primeiro e último são do tipo inteiro e representam os respectivos índices na array, como pode ser visualizado na Figura 5. 

Figura 5: Fila: Classe em Java

Fonte: O autor (2021).
Um fila possui diversas operações que são necessárias para o seu funcionamento, como a verificação se a fila está vazia, se está cheia, além de uma operação para adicionar um elemento, entre outras. Abaixo, é descrito as operações necessárias para a construção de uma fila em Java. 
Operações de uma Fila: 
• cheia(): verificar se a fila está cheia; 
• vazia(): verificar se a fila está vazia; 
• insere(E): insere o elemento E na fila; 
• remove(): remove um elemento da fila; 
• imprime(): imprime todos os elementos da fila, do primeiro ao último. 
Nesta videoaula com os conhecimentos adquiridos até aqui, você verá  a lógica do funcionamento de fila em Java, sua construção com todas as operações citadas, a partir do exemplo demonstrado com o código. 



Conclusão
Nesta unidade, foi desdobrado o conteúdo de Fila, que é uma importante estrutura de dados para a computação. Foi visto não somente o funcionamento desta estrutura, mas também pseudocódigos que facilitam o entendimento. 

Referências bibliográficas
[1] TENENBAUM, A. M. Estrutura de Dados usando C. Editora MAKRON Books. São Paulo, 1995. 

De <https://materiaisonline.pucpr.br/v3/> 






Agora que você já estudou sobre o tema da semana chegou a hora de praticar. Elabore uma fila de números inteiros em Java. A fila deverá ser um vetor de números inteiros e deverá possuir os seguintes métodos: 
boolean estaVazia() 
boolean estaCheia() 
void adicionar(int valor) 
void remover() 
void mostrar()

De <https://eadpucpr.blackboard.com/webapps/blackboard/content/listContentEditable.jsp?content_id=624911&course_id=_5905_1&semana=2> 


class Fila{
int inicio;
int fim;
int tamanho;
int qtdeElementos;
int fila[];

public Fila(){
    inicio = fim = -1;
    tamanho = 100;
    fila = new int[tamanho];
    qtdeElementos = 0;
}

public boolean estaVazia(){
    if (qtdeElementos == 0){
        return true;
    }
    return false;
}

public boolean estaCheia(){
    if (qtdeElementos == tamanho - 1){
        return true;
    }
    return false;
}

public void adicionar(int e){
    if (! estaCheia()){
        if (inicio == -1){
            inicio = 0;
        }
        fim++;
        fila[fim] = e;
        qtdeElementos++;
    }
}

public void remover(){
    if (! estaVazia() ){
        inicio++;
        qtdeElementos--;
    }
}

public void mostrar(){
    String elementos = "";
        for (int i = inicio; i<=fim; i++) {
            elementos += f[i]+ ", ";
        }
        System.out.print(elementos);
        
}
}
}

