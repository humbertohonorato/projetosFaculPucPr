UNIDADE 04
Estrutura de Dados: Lista
Nesta unidade, será apresentado o conteúdo de lista, uma importante estrutura de dados usadas frequentemente para simular situações do mundo real. Será examinado esta estrutura de dados e verificaremos por que ela desempenha esse proeminente papel nas áreas de programação e de linguagens de programação. Definiremos o conceito abstrato de uma lista, além de suas diversas operações associadas.
Estrutura de dados: Lista
Uma Lista é uma estrutura de dados dinâmica, onde o número de nós de uma lista pode variar consideravelmente à medida que são inseridos e removidos os elementos [1]. Cada elemento de uma lista encadeada (nó) é constituído de dois campos: 
• Item: contém a informação que é armazenada no nó; 
• Próximo: contém o endereço (referência) do próximo elemento na lista. 
O campo próximo do último elemento da lista contém um valor nulo que denota final da lista. Para que um elemento possa ser acessado em uma lista encadeada, é necessário que o endereço inicial da lista seja conhecido. A Figura 1 demonstra uma lista, onde cada elemento (nó) possui uma informação e um apontamento para o próximo elemento (lista encadeada). Diferentemente da fila, que pode ser de tipos primitivos (String, int, float, double, etc.), uma lista necessita que seja uma coleção de objetos, onde cada elemento da lista é um objeto chamado nó. 


Figura 1: Estrutura de dados, Lista

Fonte: O autor (2021).

Lista em Java
A implementação da lista encadeada pode ser realizada de duas formas:  
• Estática: utiliza vetores;  
• Dinâmica: utiliza ponteiros (referências); 
A Figura 2 e 3 demonstram a implementação em Java de uma lista estática. 

Figura 2: Nó da Lista estática: Classe em Java


Fonte: O autor (2021).

Figura 3: Lista estática: Classe em Java

Fonte: O autor (2021).
A Figura 4 e 5 demonstram a implementação em Java de uma lista dinâmica.

Figura 4: Nó da Lista dinâmica: Classe em Java

Fonte: O autor (2021).

Figura 5: Lista dinâmica: Classe em Java

Fonte: O autor (2021).
Mas você deve estar se perguntando, já que existem as duas possibilidades de implementação (estática e dinâmica), qual a melhor opção? Abaixo eu te apresento um comparação entre as duas opções e assim poderá entender a diferença entre as duas podendo escolher a estrutura de dados que mais se adequa ao problema que está tentando resolver. 
• Facilidade de implementação
• Desempenho
• Consumo de memória
• Estimativa de tamanho
• Limite de tamanho
• Próximo elemento
Para um melhor entendimento, na videoaula você verá a lógica do funcionamento de uma lista em Java, sua construção com todas as operações necessárias, a partir do exemplo demonstrado com o código, tanto da lista estática quanto da dinâmica. 
Conclusão
Nesta unidade, foi desdobrado o conteúdo de Lista, que é uma importantes estrutura de dados para a computação. Foi visto não somente o funcionamento desta estrutura, mas também pseudocódigos que facilitam o entendimento, e assim, pudemos aprender como adicionar e remover elementos, além de todas as outras operações necessárias para a sua construção, tanto de maneira teórica, quanto prática. 
Referências bibliográficas
[1] TENENBAUM, A. M. Estrutura de Dados usando C. Editora MAKRON Books. São Paulo, 1995. 



De <https://materiaisonline.pucpr.br/v3/> 





• ENTREGA DA ATIVIDADE SOMATIVA 1: Estrutura de Dados em Java: Lista
ATENÇÃO!!!
Esta atividade será realizada em grupo de até 5 integrantes, sendo obrigatório a inscrição em algum grupo para a entrega das atividades somativas (avaliativas). Sem a inscrição em um grupo, o sistema não aceita a entrega da atividade.
ENUNCIADO:
Uma Lista é uma estrutura de dados dinâmica, onde o número de nós de uma lista pode variar consideravelmente à medida que são inseridos e removidos os elementos. Cada elemento de uma lista encadeada (nó) é constituído de dois campos: valor e próximo elemento. Conforme foi apresentado na semana 4 a estrutura de dados, lista, elabore em grupo (não esqueça de se inscrever na semana 3), uma lista dinâmica de números inteiros em Java. A lista deverá possuir um objeto Nó (classe No) e ter os métodos listados abaixo.
boolean vazia()
void inserePrimeiro(int info)
void insereDepois(No no, int info)
void insereUltimo(int info)
No removePrimeiro()
No removeUltimo()
No remove(No no)
void mostrar()
ENTREGA:
○ Deverá comprimir a pasta src do projeto em .zip e realizar a entrega no Blackboard.
○ Somente um integrante do grupo deve enviar a atividade com o nome de todos que participaram.
○ IMPORTANTE! Junto com o arquivo (código fonte), sugerimos enviar um vídeo de no máximo 2 minutos, apresentando/demonstrando o funcionamento do seu trabalho. Ele deverá ser publicado no Youtube como não listado e o link encaminhado junto com a postagem do código fonte. Esse material extra é interessante, pois demonstra o funcionamento do seu código. Porém, o código fonte é obrigatório e ele será avaliado na atividade.
○ Lembramos que é de sua responsabilidade a integridade e execução do arquivo. Caso o arquivo entregue esteja corrompido ou impossibilitado de execução o mesmo não será aceito.
O que será avaliado na atividade:
Nó:  
○ Deverá possuir uma variável inteira e um objeto do mesmo tipo da classe, além dos métodos de get, set e próximo elemento.
Lista:
○ Deverá ter um objeto com o endereço do primeiro elemento da lista.
○ Método vazia: deverá verificar se a lista está vazia ou não.
○ Método inserePrimeiro: deverá inserir um valor no início da lista.
○ Método insereDepois: deverá inserir um valor depois de um nó específico da lista, deverá passar este nó como parâmetro na chamada do método.
○ Método insereUltimo: deverá inserir um valor no fim da lista.
○ Método removePrimeiro: deverá remover o primeiro nó da lista.
○ Método removeUltimo: deverá remover o último nó da lista.
○ Método remove: deverá remover qualquer nó da lista, deverá passar este nó como parâmetro na chamada do método.
○ Método mostrar: deverá mostrar no console todos os itens da lista.
Realizado
Encontro on-line com professor-tutor - Gravação
Olá, estudantes! 
Espero que estejam bem! 
Seguem links para acesso a gravação do Encontro on-line realizado no dia 23/05/2023. Acabou ficando em 2 partes, pois tive um problema durante a primeira parte.
Parte 1 -  https://us-lti.bbcollab.com/recording/042bab6b407544f58d07fcd48fb0f40b
Parte 2 -  https://us-lti.bbcollab.com/recording/4198d3a73449469d86f405332b10fccc
Aproveito também para deixar o código para o método buscar apresentado no vídeo, segue abaixo:
public Node buscar(int o) {
Node p = this.primeiro;
while ((p != null) && (p.getDado() != o))
p = p.getProximo();
return p;

}
Bons estudos!

De <https://eadpucpr.blackboard.com/webapps/blackboard/content/listContentEditable.jsp?content_id=624912&course_id=_5905_1&semana=3> 






public class Lista {
private No primeiro;
public Lista(){
    this.primeiro = null;
}
public boolean vazia(){
    return primeiro == null;
}
public void inserePrimeiro(int info){
    No auxiliar = new No();
    auxiliar.setInformacao(info);
    auxiliar.setProximo(primeiro);
    primeiro = auxiliar;
}
public void insereDepois(No no, int info){
    if (no == null) {
        System.out.println("Nó de referência é nulo, não é possível inserir depois");
        return;
    }
    No novo = new No();
    novo.setInformacao(info);
    novo.setProximo(no.getProximo());
    no.setProximo(novo);
}
public void insereUltimo(int info){
    if (vazia()){
        inserePrimeiro(info);
    } else {
        No auxiliar = primeiro;
        while (auxiliar != null && auxiliar.getProximo() != null){
            auxiliar = auxiliar.getProximo();
        }
        if (auxiliar.getProximo() == null){
            No novo = new No();
            novo.setInformacao(info);
            auxiliar.setProximo(novo);
        }
    }
}
public No removePrimeiro() {
    if (vazia()) {
        System.out.println("A lista está vazia. Não é possível remover o primeiro elemento.");
        return null;
    }
    No removido = primeiro;
    primeiro = primeiro.getProximo();
    removido.setProximo(null);
    return removido;
}
public No removeUltimo() {
    if (vazia()) {
        System.out.println("A lista está vazia. Não é possível remover o último elemento.");
        return null;
    }
    No auxiliar = primeiro;
    No anterior = null;
    while (auxiliar.getProximo() != null) {
        anterior = auxiliar;
        auxiliar = auxiliar.getProximo();
    }
    if (anterior == null) {
        // Só há um elemento na lista
        primeiro = null;
    } else {
        anterior.setProximo(null);
    }
    return auxiliar;
}
public No remove(No no) {
    if (vazia()) {
        System.out.println("A lista está vazia. Não é possível remover o elemento.");
        return null;
    }
    if (no == null) {
        System.out.println("Nó de referência é nulo. Não é possível remover.");
        return null;
    }
    No auxiliar = primeiro;
    No anterior = null;
    while (auxiliar != null && auxiliar != no) {
        anterior = auxiliar;
        auxiliar = auxiliar.getProximo();
    }
    if (auxiliar == null) {
        System.out.println("O nó informado não foi encontrado na lista.");
        return null;
    }
    if (anterior == null) {
        // Nó a ser removido é o primeiro da lista
        primeiro = auxiliar.getProximo();
    } else {
        anterior.setProximo(auxiliar.getProximo());
    }
    auxiliar.setProximo(null);
    return auxiliar;
}
public void mostrar(){
    No auxiliar = primeiro;
    System.out.print("lista : ");
    while (auxiliar != null){
        System.out.print(auxiliar.getInformacao() + ", ");
        auxiliar = auxiliar.getProximo();
    }
}
public No buscar(int o) {
    No p = this.primeiro;
    while ((p != null) && (p.getInformacao() != o))
        p = p.getProximo();
    return p;
}
}






public class No {
private Integer informacao;
private No proximo;
public No(){
    informacao = null;
    proximo = null;
}
public Integer getInformacao() {
    return informacao;
}
public void setInformacao(Integer informacao) {
    this.informacao = informacao;
}
public No getProximo() {
    return proximo;
}
public void setProximo(No proximo) {
    this.proximo = proximo;
}
@Override
public String toString() {
    return ": " + getInformacao() ;
}
}





import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Lista l = new Lista();
    System.out.println("O que você deseja fazer no sistema?");
    var loop = true;
    while (loop){
        System.out.println("\nDIGITE 0 para:Inserir Primeiro elemento na lista \n" +
                        "DIGITE 1 para: Inserir Ultimo elemento na lista \n" +
                        "DIGITE 2 para: Inseir elemento na lista depois de outro elemento especifico \n" +
                        "DIGITE 3 para: Remover Primeiro elemento da lista \n" +
                        "DIGITE 4 para: Remover Ultimo elemento da lista \n" +
                        "DIGITE 5 para: Remover um elemento especifico da lista \n" +
                        "DIGITE 6 para: Mostrar elementos da lista \n" +
                        "DIGITE qualquer outro valor para sair do programa \n");
        try {
            var valorDigitado = leitor.nextInt();
            switch (valorDigitado) {
                case 0:
                    System.out.print("Qual valor você quer inserir?  ");
                    valorDigitado = leitor.nextInt();
                    l.inserePrimeiro(valorDigitado);
                    l.mostrar();
                    break;
                case 1:
                    System.out.print("Qual valor você quer inserir?  ");
                    valorDigitado = leitor.nextInt();
                    l.insereUltimo(valorDigitado);
                    l.mostrar();
                    break;
                case 2:
                    System.out.print("Depois de qual elemento você quer inserir?  ");
                    valorDigitado = leitor.nextInt();
                    No noReferencia = l.buscar(valorDigitado);
                    if (noReferencia == null) {
                        System.out.println("Esse elemento não existe na lista");
                        break;
                    }
                    System.out.print("Qual valor você quer inserir depois do elemento " + noReferencia + " ?  ");
                    valorDigitado = leitor.nextInt();
                    var novaInformacao = valorDigitado;
                    l.insereDepois(noReferencia, novaInformacao);
                    l.mostrar();
                    break;
                case 3:
                    System.out.print("Primeiro elemento removido!  ");
                    l.removePrimeiro();
                    l.mostrar();
                    break;
                case 4:
                    System.out.print("Ultimo elemento removido!  ");
                    l.removeUltimo();
                    l.mostrar();
                    break;
                case 5:
                    System.out.print("Qual elementos você quer remover?  ");
                    valorDigitado = leitor.nextInt();
                    noReferencia = l.buscar(valorDigitado);
                    if (noReferencia == null) {
                        System.out.println("Esse elemento não existe na lista");
                        break;
                    }
                    l.remove(noReferencia);
                    l.mostrar();
                    break;
                case 6:
                    l.mostrar();
                    break;
                default:
                    loop = false;
                    System.out.println("Finalizando!");
                    break;
            }
        }catch (Exception e){
            System.out.println("Programa só aceita valores inteiros... Finalizando!");
            break;
        }
    }
}
}
