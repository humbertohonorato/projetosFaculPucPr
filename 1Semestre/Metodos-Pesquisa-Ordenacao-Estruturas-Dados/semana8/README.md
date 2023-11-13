UNIDADE 08
Estrutura de Dados: Métodos de Ordenação

Nesta unidade, examinaremos diversos métodos de ordenação, como bublesort, mergesort e selectionsort. Existem diversas aplicabilidades para métodos de ordenação, não somente em Java, mas no mundo computacional como um todo. Existem diversos métodos, alguns mais rápidos e outros nem tanto.
Estrutura de dados: Métodos de ordenação
Algoritmos de ordenação são algoritmos que implementam operações capazes de ordenar sequências de dados recebidas como entrada [1]. Por exemplo, dado um vetor com 15 valores de números inteiros aleatórios, um método de ordenação deve ordenar estes valores conforme a especificação. A Figura 1 demonstra um vetor com 7 valores aleatórios de forma não ordenada. Já a Figura 2 demonstra o mesmo vetor, porém agora mostrando os dados de forma ordenada após passar por um método de ordenação.
Figura 1: Vetor não ordenado

Fonte: O autor (2021).
Figura 2: Vetor ordenado

Fonte: O autor (2021).
Existe uma série de aplicações que necessitam de dados ordenados, por exemplo o resultado das pesquisas em sites de busca, são mostrados aos usuários, ordenados de acordo com algum parâmetro, tais como importância ou interesses. Há diversos tipos de métodos de ordenação, entre eles temos o bubblesort, mergesort e selectionsort.
• Bubblesort
Segue uma lógica bem particular, em relação aos demais. Este método de ordenação é um dos métodos mais simples existente na computação. Para explicar sua lógica, primeiro precisaremos de um vetor com valores numéricos não ordenado (Figura 3).
Figura 3: Bubblesort: Vetor não ordenado

Fonte: O autor (2021).
Com este vetor, será analisado cada um de seus valores. Onde será feita uma computação com um valor, iniciando na posição 0 (zero) com o valor da posição posterior, posição 1 (um). Se o valor que está na posição 0 (zero) for maior que o valor que está na posição 1 (um), deverá ser feita uma troca de valores, trazendo para a posição 0 (zero) o menor valor entre os dois. Após essa comparação e possivelmente a troca ser realizada, é feita a mesma comparação do valor da posição 1 (um) com o valor da posição 2 (dois), caso o valor da posição 1 (um) for menor que o valor da posição 2 (dois), deverá ser feita uma troca de valores, trazendo para a posição 1 (um) o menor valor entre os dois. A Figura 4 demonstra a lógica do bubblesort.
Figura 4: Bubblesort: lógica de ordenação

Fonte: O autor (2021).
Este processo da Figura 4, deve se repetir desde o início do vetor diversas vezes, até que não tenha mais trocas, mesmo que seja necessário recomeçar as comparações do início do vetor novamente.
• Mergesort
Também possui uma lógica bem específica. No caso dele, será necessário utilizar a recursividade para realizar o método de ordenação. Primeiro, deve-se dividido o vetor pela metade, separando assim em outros dois vetores, estes outros dois vetores, deverão ser divididos novamente em outros vetores e isso deve ocorrer até que se tenha valores individuais. A Figura 5 demonstra essa lógica.
Figura 5: Mergesort: primeira etapa

Fonte: O autor (2021).
A partir desta etapa, onde temos todos os valores individualmente, precisamos voltar a recursão e fazer a ordenação de cada conjunto. Para isso, a cada retorno, todos os vetores deverão ser ordenados, até que se tenha um único vetor ordenado por completo. A Figura 6 demonstra essa lógica.
Figura 6: Mergesort: segunda etapa

Fonte: O autor (2021).
• Selectionsort
Segue uma lógica mais simples que o mergesort e até mais eficiente que o bubblesort. Para isso, serão necessários dois laços de repetição, onde o primeiro irá percorrer uma posição de cada vez. A cada posição é feita uma varredura por todos os valores que vem depois deste valor e obtido o menor valor entre eles. Caso o valor que está sendo percorrido seja menor do que o menor valor que vem depois dele, será feita uma troca. Isso deverá ocorrer até que termine o vetor. A Figura 7 demonstra essa lógica.
Figura 7: Selectionsort: lógica de ordenação

Fonte: O autor (2021).
Conclusão
Nesta unidade, foi desdobrado o conteúdo de métodos de ordenação. Compreendemos a lógica de funcionamento de três métodos de ordenação muito importantes para a computação, e assim, pudemos aprender com estes exemplos da unidade e videoaula a como ordenar vetores numéricos.
Referências bibliográficas
[1] TENENBAUM, A. M. Estrutura de Dados usando C. Editora MAKRON Books. São Paulo, 1995.

De <https://materiaisonline.pucpr.br/v3/> 


ATIVIDADE SOMATIVA 2: Métodos de ordenação
A entrega desta atividade, ocorrerá no mesmo grupo anterior. Caso precisem mudar por algum motivo, entrem em contato o quanto antes no fale com a gente.
Chegou o momento de efetivar a entrega da sua atividade.  
Fique atento ao prazo final desta atividade.   
IMPORTANTE: Este link ficará indisponível após a conclusão do prazo. Ou seja, não será possível visualizar a entrega aqui. Para consultar seu feedback e nota, acesse a área Minhas Notas no menu lateral.  
- Ao salvar o arquivo para entrega, atente-se à extensão dele. O ambiente virtual aceita apenas as seguintes extensões de arquivo: .doc; .xls; .pdf; .jpeg; .png; .zip e .rar (no caso de arquivos compactados). Confira os tipos de arquivos aceitos em cada atividade.
- Lembramos que é de sua responsabilidade a integridade e execução do arquivo. Caso o arquivo entregue esteja corrompido ou impossibilitado de execução o mesmo não será aceito.
Para entregar a atividade, clique no título desta atividade > Pesquisar meu Computador > insira seu arquivo > e após em Enviar.  
Pronto! Sua entrega foi efetivada, aguarde a correção e feedback do professor-tutor. 
1. O Selection Sort segue uma rotina bem simples e direta: encontrar o menor elemento e colocá-lo na primeira posição. Isso é feito com cada um dos elementos do vetor. Com base no que foi estudando na unidade da semana, elabore em grupo, o algorítimo do Selection Sort e faça a ordenação do vetor abaixo. Deverá comprimir a pasta src do projeto em .zip e realizar a entrega no Blackboard.
int[] vetor = {3,6,8,1,4,9,0};
2. O Bubble Sort é um algorítimo de ordenação por flutuação, de forma bem simples. Com base no que foi estudando na unidade da semana 5 e 8, elabore em grupo, o algorítimo do Bubble Sort recursivamente e faça a ordenação do vertor abaixo. Deverá comprimir a pasta src do projeto em .zip e realizar a entrega no Blackboard.
int[] vetor = {3,6,8,1,4,9,0};
3. Grave um vídeo mostrando o funcionamento e explicando seu código (no máximo 3 minutos) - um único vídeo para os itens 1 e 2. Junto com a entrega do código fonte, poste o link do vídeo (poste no youtube como "não listado").
A entrega será do código fonte + link do vídeo com os nomes dos participantes do grupo.


De <https://eadpucpr.blackboard.com/webapps/blackboard/content/listContentEditable.jsp?content_id=624916&course_id=_5905_1&semana=7> 



publicclassMain{
publicstaticvoidmain(String[]args){

System.out.println("Arrayantesdaordenação:");
int[]array={3,6,8,1,4,9,0};
Sort.printArray(array);

System.out.println("Arraydepoisdaordenaçãocombolha:");
Sort.bubbleSort(array);
Sort.printArray(array);

System.out.println("Arrayantesdaordenação:");
int[]array2={3,6,8,1,4,9,0};
Sort.printArray(array2);

System.out.println("Arraydepoisdaordenaçãocomseleção:");
Sort.selectionSort(array2);
Sort.printArray(array2);
}
}


publicclassSort{

//BubbleSort-Algoritmodeordenaçãoporbolhadeformarecursiva
privatestaticvoidrecursiveBubbleSort(int[]array,intn){
if(n==1){
return;
}

for(inti=0;i<n-1;i++){
if(array[i]>array[i+1]){
swap(array,i,i+1);
}
}
recursiveBubbleSort(array,n-1);
}

publicstaticvoidbubbleSort(int[]array){
recursiveBubbleSort(array,array.length);
}

//SelectionSort-Algoritmodeordenaçãoporseleção
publicstaticint[]selectionSort(int[]array){
intn=array.length;

for(inti=0;i<n-1;i++){
intminIndex=i;

for(intj=i+1;j<n;j++){
if(array[j]<array[minIndex]){
minIndex=j;
}
}
//Trocaoselementosdeposição
swap(array,i,minIndex);
}
returnarray;
}

//Trocadoiselementosdeposiçãonoarray
privatestaticvoidswap(int[]array,inti,intj){
inttemp=array[i];
array[i]=array[j];
array[j]=temp;
}

//Imprimeoarraynatela
publicstaticvoidprintArray(int[]array){
for(inti=0;i<array.length;i++){
System.out.print(array[i]+"");
}
System.out.println();
}
}

