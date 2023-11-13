Métodos de Pesquisa e Ordenação em Estruturas de Dados
UNIDADE 01
Estrutura de Dados: Vetor e Matriz
Nesta unidade, estudaremos o conteúdo das estruturas de dados de vetor e matriz para que possamos dar início aos estudos de estrutura de dados. Vetores e matrizes são estruturas de dados muito simples que podem nos ajudar quando temos muitas variáveis do mesmo tipo e que precisamos referenciar apenas por uma única variável. Seu acesso por indexação, nos ajudará a entender melhor os métodos de indexação de outras estruturas de dados mais complexas que ainda vamos ver nesta disciplina.
Vetor e Matriz
Primeiramente vamos estudar o conteúdo de vetor e matriz, pois será a partir destes conceitos que vamos dar início às estruturas de dados desta disciplina [1]. 
Então o que seria um vetor (Figura 1)? 
Um conjunto ordenado finito de elementos homogêneos. [1]
	• Ordenado: porque os elementos de um vetor estão dispostos de forma que há um primeiro, um segundo etc. [1] 
	• Finito: porque todo vetor precisa ter especificado o seu tamanho. [1] 
	• Homogêneo: porque todos os elementos de um vetor possuem o mesmo tipo de dado. [1] 

Figura 1: Estrutura de dados, vetor

Fonte: O autor (2021).
Os índices representam as posições do vetor, que sempre vão iniciar na posição 0 (zero).  
A sintaxe de um vetor tem diferentes formatos. A declaração direta ou representação literal é aquela em que o vetor é representado pelos símbolos de colchetes. Veja a sintaxe na Figura 2. 
Figura 2: Vetor em Java

Fonte: O autor (2021).
No caso da Figura 1, o vetor novoVetor foi apenas declarado, mas não possui nenhum elemento/valor. Para isso, precisaremos adicionar novos valores a este vetor. Isso pode ser feito de duas maneiras, diretamente na declaração com valores separados por vírgula dentro de chaves (Figura 3), ou definindo manualmente o tamanho do vetor na declaração e atribuindo os valores após a declaração (Figura 4). 

Figura 3: Vetor em Java – declaração 1

Fonte: O autor (2021).

Figura 4: Vetor em Java – declaração 2

 Fonte: O autor (2021).
Para imprimir os valores de um vetor, será necessário utilizar um laço de repetição, como pode ser visualizado na Figura 5. 

Figura 5: Mostra dados do vetor

Fonte: O autor (2021).
Também temos os vetores bidimensionais, que são chamados de matriz. Os tipos de dados de um vetor, pode ser outro vetor, formando assim, uma matriz [1], como pode ser visualizado na Figura 6. 
Figura 6: Matriz em Java

Fonte: O autor (2021).
No caso da Figura 6, a matriz  foi apenas declarada, mas não possui nenhum elemento/valor. Para isso, precisaremos adicionar novos valores a esta matriz. Isso pode ser feito de duas maneiras, diretamente na declaração com valores separados por vírgula, onde cada elemento será outro valor separado por chave (Figura 7), ou definindo manualmente o tamanho da matriz na declaração e atribuindo os valores após a declaração (Figura 8). 

Figura 7: Matriz em Java – declaração 1

Fonte: O autor (2021).

Figura 8: Matriz em Java – declaração 2

Fonte: O autor (2021).
Para mostrar os dados de uma matriz, é necessário que faça 2 (dois) laços de repetição, pois a matriz é bidimensional e assim, será necessário percorrer duas vezes a matriz para que todos os dados possam ser mostrados em tela, como por ser visto na Figura 9. 

Figura 9: Mostrar dados da matriz

 Fonte: O autor (2021).
Para um melhor entendimento, a construção de vetores e matrizes em Java, podem ser vistos na videoaula, onde será apresentado a lógica do funcionamento de vetor e matriz em Java. Será demonstrado com o código como criar os dois exemplos.
Conclusão
Nesta unidade, revisamos o conteúdo das estruturas de dados vetor e matriz, já que será a partir destes dois tipos que daremos inícios as estruturas de dados desta disciplina.
Referências bibliográficas
[1] TENENBAUM, A. M. Estrutura de Dados usando C. Editora MAKRON Books. São Paulo, 1995.

© PUCPR - Todos os direitos reservados.
Créditos | Privacidade e Proteção de Dados

De <https://materiaisonline.pucpr.br/v3/> 


ATIVIDADE DIAGNÓSTICA: Vetor de números inteiros
A moda de um vetor de números inteiros é o número que é repetido mais vezes. Se há mais de um número com mais repetições do que os outros então não há moda. Escreva um algorítimo que receba o vetor de inteiros abaixo e retorne a moda do vetor. Caso a moda não exista, então informe o usuário. 
int[] vetor = {1, 5, 2, 3, 1, 3, 1}; 

De <https://eadpucpr.blackboard.com/webapps/blackboard/content/listContentEditable.jsp?content_id=624909&course_id=_5905_1&semana=0> 

Resolução:
 
     int numeroVezes;
        int numeroVezesAnterior = 0;
        int moda = 0;
        int[] vetor = {1, 5, 2, 3, 1, 3, 1};
 
        for (int i = 0; i < vetor.length; i++) {
            numeroVezes = 1;
 
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    numeroVezes++;
                }
            }
            if (numeroVezes > numeroVezesAnterior) {
                moda = vetor[i];
                numeroVezesAnterior = numeroVezes;
            }
        }
 
        System.out.println("Moda: " + moda);
