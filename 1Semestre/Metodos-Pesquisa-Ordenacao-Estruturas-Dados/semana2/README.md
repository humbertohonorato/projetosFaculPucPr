Métodos de Pesquisa e Ordenação em Estruturas de Dados
UNIDADE 02
Estrutura de Dados: Pilha
Nesta unidade, será visto o conteúdo de pilha, que é um dos conceitos mais úteis da computação. Será examinado essa estrutura de dados simples e verificaremos por que ela desempenha esse proeminente papel nas áreas de programação e de linguagens de programação. Definiremos o conceito abstrato de uma pilha e provaremos como esse conceito pode ser transformado numa ferramenta concreta e valiosa para a solução de problemas.
O que seria uma estrutura de dados? Pois bem, uma estrutura de dados mantém os dados organizados seguindo alguma lógica e disponibiliza operações para o usuário manipular os dados [1]. 
É importante NÃO misturar dados e estrutura de dados na implementação! Um dado é uma informação armazenada e estrutura de dados é quem administra os dados. O ideal é que uma estrutura de dados seja o mais independente possível dos dados que ela vai armazenar. Desta forma, pode-se aproveitar a mesma estrutura de dados para diversos tipos de dados [1]. 
Existem diversos tipos de estrutura de dados, entre eles, a pilha. 
Uma pilha é uma coleção ordenada de itens na qual os itens podem ser inseridos e retirados a partir da última posição, chamada topo da pilha. Podemos ilustrar uma pilha como a da Figura 1. 

Figura 1: Estrutura de dados, Pilha

Fonte: O autor (2021).
Ao contrário do que acontece com o vetor, a definição da pilha compreende a inserção e a eliminação de itens, de modo que uma pilha é um objeto dinâmico, constantemente mutável. Desta forma, surge então a pergunta: como uma pilha muda? A definição específica que uma única extremidade da pilha é designada como o topo da pilha. Novos itens podem ser colocados no topo da pilha, ou os itens que estiverem no topo da pilha poderão ser removidos. As Figuras 2 e 3 abaixo demonstram como que manipula uma pilha inserindo e removendo dados. 

Figura 2: Pilha: Inserir dados

Fonte: O autor (2021).

Figura 3: Pilha: Remover dados

Fonte: O autor (2021).

Pilha em Java
A definição de uma estrutura para pilha necessita de apenas dois membros, um campo chamado topo e um campo onde as informações são armazenadas representado por um vetor chamado dados. O campo topo é do tipo inteiro e representa o índice do topo no vetor, como pode ser observado na Figura 4. 

Figura 4: Pilha: Classe em Java

Fonte: O autor (2021).[/legenda
Apenas três operações podem ser realizadas: empilhamento, desempilhamento e uma eventual consulta do elemento que está no topo da pilha. Também há necessidade de verificar se a pilha está vazia, pois assim, não há como desempilhar dados, pois a pilha estará vazia. 

Como verificar se a pilha está vazia?
Inicialmente o índice topo é inicializado com o valor -1. Isto indica que a pilha está vazia. Desta forma, pode-se implementar um teste para verificar se a pilha está vazia da seguinte forma (Figura 5). 

Figura 5: Pilha vazia

Fonte: O autor (2021).

Como empilhar um dado (inserção)?
Ao empilhar, deve-se verificar antes se a pilha não está cheia, sendo assim, não será possível empilhar nenhum novo dado (Figura 6). 

Figura 6: Pilha: Empilhar

Fonte: O autor (2021).

Como desempilhar um dado (remoção)?
Ao desempilhar, deve-se verificar antes se a pilha não está vazia, sendo assim, não será possível desempilhar nenhum dado (Figura 7). 

Figura 7: Pilha: Desempilhar

Fonte: O autor (2021).

Pilha cheia?
É importante verificar a realização do teste de “overflow” antes de efetivamente inserir o elemento na pilha. Este teste pode ser implementado da seguinte forma (Figura 8). 

Figura 8: Pilha cheia

Fonte: O autor (2021).
Para um melhor entendimento da lógica do funcionamento do empilhamento e desempilhamento a partir de um código em Java pronto assista a videoaula. Este vídeo não irá mostrar o código pronto, e sim, demonstrar o funcionamento de pilha a partir de uma aplicação pronta. 



Conclusão
Nesta unidade, foi desdobrado o conteúdo de pilha, uma importante estrutura de dados para a computação. Foi visto não somente o funcionamento de pilha, mas também pseudocódigos que facilitam tanto o entendimento, quanto a implementação desta estrutura de dados. 

Referências bibliográficas
[1] TENENBAUM, A. M. Estrutura de Dados usando C. Editora MAKRON Books. São Paulo, 1995. 

© PUCPR - Todos os direitos reservados.
Créditos | Privacidade e Proteção de Dados

De <https://materiaisonline.pucpr.br/v3/> 

Unidade 02: Estrutura de Dados: Pilha
Olá, nesta semana, será apresentado o conteúdo de pilha, a primeira estrutura de dados que será apresentado nesta disciplina. Será necessário que tenha a disposição um IDE (Ambiente Integrado de Desenvolvimento) para que possa realizar os exercícios da semana. 

CODIGO DA ATIVIDADE

Public class Pilha {

public int[] pilha;
public int posicaoPilha;

public Pilha() {
    This.pilha = new int[10];
    This.posicaoPilha = -1;
}

public void empilhar (int valor) {
    If(this.posicaoPilha < this.pilha.length-1) {
        This.posicaoPilha++;
        This.pilha[this.posicaoPilha] = valor;
    }
}

//mostra a pilha na posição onde o valor no topo é o primeiro valor  inserido na pilha
public void mostraPilha () {
    For (int i = 0; i < this.pilha.length; i++) {
    System.out.println("|" + this.pilha[i] + "|");
    }
}

//mostra a pilha na posição onde o valor no topo é o último valor inserido na pilha, e não exibe os valores vazios
public void mostraPilha () {
    For (int i =  this.pilha.length-1; i >=0; i--) {
        If(this.pilha[i] != 0) {
            System.out.println("|" + this.pilha[i] + "|");
        }
    }
}

}

Public class App {
Public static void main(String[] args) throw Exception {
    
    Pilha. P = new Pilha();
    p.empilhar(10);
    p.empilhar(20);
    p.empilhar(30);
    p.empilhar(40);
    
    p.mostraPilha();

}
}
