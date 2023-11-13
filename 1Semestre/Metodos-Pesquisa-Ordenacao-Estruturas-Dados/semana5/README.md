Métodos de Pesquisa e Ordenação em Estruturas de Dados
UNIDADE 05
Estrutura de Dados: Recursividade
Nesta unidade, será apresentado a recursividade, uma das ferramentas de programação mais poderosos e menos entendidas pelos principiantes em programação. Definiremos a recursividade, introduziremos seu uso em Java e apresentaremos exemplos. Examinaremos também uma implementação da recursividade na função de fatorial.
Estrutura de dados em Java: Recursividade
Na matemática, vários objetos são definidos apresentando-se um processo que os produz [1]. Por exemplo, a função fatorial, que desempenha um papel importante na matemática e na estatística, pode ser calculada recursivamente. Dado um inteiro positivo n, o fatorial de n é definido como o produto de todos os inteiros entre n e 1. Por exemplo, o fatorial de 5 é 5 multiplicado por 4 que multiplica por 3... assim por diante, e o fatorial de 3 é 3 multiplicado por 2 que multiplica por 1. O fatorial de 0 é definido como 1. Na matemática, o ponto de exclamação (!) é frequentemente usado para indicar a função fatorial (Figura 1).
Figura 1: Fatorial de 5

Fonte: O autor (2021).
Sendo assim, o fatorial de um número n (número qualquer) é definido como (Figura 2):
Figura 2: Fatorial de 5 (detalhado)

Fonte: O autor (2021).
Recursividade em Java
A função fatorial pode ser resolvida de forma iterativa usando a linguagem Java, como é demonstrado na figura 3.
Figura 3: Fatorial iterativo em Java

Fonte: O autor (2021).
A recursividade trabalha de forma similar a um laço de repetição, utilizando uma pilha para armazenar as chamadas de funções. Na computação, a recursividade é uma técnica de programação na qual métodos ou funções chamam a si próprios. A figura 4 demostra a mesma função fatorial, mas agora de forma recursiva em Java.

Figura 4: Fatorial recursivo em Java

Fonte: O autor (2021).
Se analisar a Figura 4, poderá observar que o código da função fatorialRecursivo(int n) será executado diversas vezes, até que n seja igual a 0. Toda vez que n é diferente de 0, será executado a função novamente, porém agora, com o valor de n – 1. Assim, o valor de n será decrementado a cada vez que a função for chamada, até que seu valor seja 0 e pare a recursão. Desta forma, será calculado o mesmo valor da função iterativa, mas agora utilizando a recursividade.
Conclusão
Nesta unidade, foi desdobrado o conteúdo de recursividade, que é uma ferramenta muito importante e poderosa computacionalmente. Foi visto não somente o conceito desta ferramenta, mas também códigos completos que facilitam o entendimento, e assim, pudemos aprender como elaborar uma função, não somente de forma interativa, mas também recursiva.
Referências bibliográficas
[1] TENENBAUM, A. M. Estrutura de Dados usando C. Editora MAKRON Books. São Paulo, 1995.
© PUCPR - Todos os direitos reservados.
Créditos | Privacidade e Proteção de Dados

De <https://materiaisonline.pucpr.br/v3/> 


ATIVIDADE FORMATIVA: Recursividade
A sequência Fibonacci é uma sequência de números inteiros, começando normalmente por 0 e 1, na qual cada número seguinte, corresponde à soma dos dois anteriores, por exemplo: 



Para essa atividade você deverá implementar uma nova Classe em java que imprima a sequência Fibonacci recursivamente.

De <https://eadpucpr.blackboard.com/webapps/blackboard/content/listContent.jsp?content_id=_624913_1&course_id=_5905_1> 


public class Fibonacci {
int fibo(int n) {
    if(n < 2){
        return n;
    } 
    else {
        return fibo(n - 1) + fibo(n - 2);
    }
}
}


public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    for (int i = 0; i < 30; i++) {
        System.out.print(f.fibo(i) + " ");
    }
}




publicintfatorialRecursivo(intn){
if(n==0){
return1;
}
returnn*fatorialRecursivo(n-1);
}

publicintfatorialIterativo(intn){
intfat=1;
for(inti=2;i<=n;i++)
fat=fat*1;
returnfat;
}


