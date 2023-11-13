UNIDADE 07
Tratamento de Exceção
Nesta unidade, abordaremos a manipulação e tratamento de erros. Entretanto, não estamos nos referindo a achar erros de código, o que a IDE poderia encontrar facilmente. Mesmo quando programamos profissionalmente e dominamos a linguagem, há várias situações legítimas em que problemas podem ocorrer. Além disso, o ideal também é sermos preventivos, para que um erro de lógica seja imediatamente identificado e corrigido.
No Java, esse tratamento é realizado por meio do mecanismo de exceções, que pode ser usado para:
• 1. Proteger
• 2. Tratar
• 3. Registrar
• 4. Gerenciar recursos
Podemos utilizar o mecanismo de exceções para garantir que recursos utilizados pela aplicação sejam corretamente finalizados. Por exemplo, pode ser necessário fechar um arquivo aberto, ou encerrar uma conexão de redes.
Tudo isso adicionará um grau adicional de robustez em nossas aplicações, tornando nosso código defensivo e evitando que problemas ainda maiores se propaguem ao longo do tempo.
Lidando com as mensagens de erro
1. Execute o código indicado no modelo e responda:
    1. Qual é o problema do código?
    2. Qual é a sua saída?
EXERCÍCIO
Exceções
Figura 1 – Exercício: exceções

publicclassExemplo{staticvoidrealizarConta(){int x =0;int y =10;int z =y/x;System.out.println(z);}publicstaticvoidmain(String[]args){realizarConta();}}

• Resolução do exercício
Fonte: Autores (2021).
Esse exercício, apesar de simples, nos mostra um exemplo do uso do mecanismo de exceção. Perceba que o código em questão possui um erro, uma vez que tem duas variáveis inteiras, sendo a variável x com valor 0. A divisão de y por x é, portanto, impossível. E como o Java sinaliza esse problema? Ele irá disparar uma exceção. Como nesse código não fizemos qualquer tratamento especial desse problema, o método main foi encerrado e o Java imprimiu em sua saída de erro (System.err) a descrição do erro, conhecida como stack trace. A figura a seguir ajudará você a entender em detalhes essa mensagem.
Figura 2 – Exercício: stack trace explicado

Fonte: Autores (2021).
Aqui já nos deparamos com uma excelente característica do mecanismo: os erros são extremamente descritivos. Observe que:
1. O erro possui uma mensagem descritiva, que explica o problema ocorrido
2. Além da mensagem, o erro é um objeto e, portanto, possui uma classe. Essa classe normalmente possuirá um nome que permite-nos entender o erro quanto a sua natureza. Neste caso, trata-se de uma ArithmeticException, uma vez que foi uma operação aritmética que causou o problema.
3. Por fim, há o stack trace propriamente dito. Trata-se da descrição do ponto exato do código em que o erro ocorreu. O Java inicia pelo ponto mais específico e lista, linha a linha, todas os arquivos e métodos que foram chamados para que o código chegasse até ali. Por isso, temos duas linhas descritas na mensagem: a da função realizarConta e a do próprio método main. Isso permite que rastreemos não só o ponto em que o erro ocorreu, mas tenhamos uma boa noção do seu contexto. Afinal, um mesmo método pode ser chamado de diferentes locais no código.
Não se assuste com o tamanho do texto da exceção, pois é perfeitamente normal que ela atinja várias linhas. Aprenda a ler o stacktrace e use-o a seu favor.
Tratamento de erros
Pode parecer bastante fácil corrigir esse código: basta informar um valor correto para y, não é? Agora, o que poderíamos fazer caso y não fosse diretamente definido, mas sim, lido do teclado? Nesse caso, o erro poderia ocorrer apenas algumas vezes, quando nosso usuário digitasse o valor 0. Vamos explorar algumas formas diferentes para realizar esse tratamento.
Utilizando condicionais
A primeira forma que possuímos para tratar erros é utilizar condicionais que testem o problema antes que ele ocorra, por exemplo:

staticvoidrealizarConta(int x,int y){if(x ==0){System.out.println("Divisão por zero");}else{System.out.println(y/x);}}

Essa abordagem, porém, apresenta um grande problema. Nem sempre a função que trata o erro é a mesma função que realiza o cálculo. Por exemplo, poderíamos querer manter a função realizarConta somente com o cálculo e deixar no main a impressão do texto. Nesse caso, o ideal é capturar a exceção gerada pela divisão.
Capturando exceções
Quando uma exceção ocorre, ela abandona imediatamente o método que a gerou. Em seguida, ela é propagada para a função que chamou esse método e, caso haja um tratamento, essa propagação é interrompida. Caso não haja, ela fará com que esse método também seja abandonado, e esse ciclo pode continuar até que ela deixe o main, finalizando o programa e encerrando a aplicação.
Utilizamos o comando try...catch para fazer esse tratamento. Primeiramente, vamos verificar como esse esquema de try (tente) e catch (capture) funciona, conforme a figura a seguir.
Observe os blocos de comandos try e catch:
• Se ocorrer uma exceção dentro do bloco try, o código é desviado para o bloco catch correspondente.
• Pode haver mais de um bloco catch, cada um pegando uma exceção diferente e realizando o código que trata dessa exceção.
• Para saber qual desvio ou bloco catch deve ser executado, precisamos identificar a classe da exceção e nomear um objeto da exceção, conforme indicado na figura.
• Se não ocorrer uma exceção dentro do bloco try, a execução pula os blocos de catch e finaliza
Figura 3 – Organização dos blocos de comando para try...catch

Fonte: Autores (2021).
Agora, vamos verificar como esse esquema é implementado, conforme apresentado no exemplo a seguir.
Observe que a classe da exceção é a ArithmeticException e o objeto da classe se chama e, neste exemplo.
Figura 4 – Uso de try...catch

publicclassExemplo{staticint realizarConta(int x,int y){returny /x;}publicstaticvoidmain(String[]args){try{int z =realizarConta(0,10);System.out.println(z);}catch(ArithmeticException e){System.out.println("Divisão por zero");}System.out.println("FIM");}}


Fonte: Autores (2021).
Iniciamos o método main com o comando try. Em seu interior, inserimos todo o código que poderia disparar um erro. Caso um erro ocorra, ele será imediatamente disparado para o comando catch da linha 10. A variável e, do tipo ArithmeticException, irá conter a descrição do erro gerado. Como a exceção foi capturada e tratada, o programa irá então interromper sua propagação e continuar para a linha após o catch. É por isso que, mesmo com o erro, o texto “FIM” da linha 13 ainda é impresso.
E se nenhum erro ocorrer? O programa executará o println da linha 9 e então pulará o bloco catch, executando também a linha 13.
Múltiplos blocos de catch
Vimos que dentro do bloco try, podemos colocar mais de uma linha de código. Mas e se nessas linhas, exceções diferentes forem disparadas? Podemos utilizar múltiplos blocos de catch, conforme demonstrado a seguir.
Execute o programa a seguir e confira se você consegue gerar a exceção ArithmeticException.
Figura 5 – Exercício: uso de múltiplos blocos de catch

publicclassExemplo{staticint realizarConta(int x,int y){returny /x;}publicstaticvoidmain(String[]args){try{int z =realizarConta(2,10);System.out.println(z);String x =null;System.out.println(x.length());}catch(ArithmeticException e){System.out.println("Divisão por zero");}catch(NullPointerException e){System.out.println(e.getMessage());}System.out.println("FIM");}}

Fonte: Autores (2021).
Observe que o código só é desviado para o catch em que a exceção ocorreu. Os demais blocos de catch não serão executados. Além disso, observe que dessa vez utilizamos o objeto “e” recebido por parâmetro. Ele permite acessar dados da exceção, como sua mensagem. Esta mensagem é a mesma que sairia no stack trace, caso deixássemos a exceção sair do bloco main (tente testar isso você mesmo). Além do getMessage(), você pode mandar imprimir o stack trace completo, tal como ocorre quando o código sai do main, com o comando: e.printStackTrace().
Multi-catch
Muitas vezes, um grupo de exceções apresenta tratamento idêntico, tal como mostrar a mensagem de erro, ou ignorá-la para que o usuário possa repetir a ação. Nesse caso, você pode especificar um grupo de exceções a serem capturadas por meio do operador de |, como apresentado no exemplo a seguir.
Execute o programa a seguir e confira se você consegue gerar a exceção ArithmeticException.
Figura 6 – Exercício: uso de multi-catch

publicclassExemplo{staticint realizarConta(int x,int y){returny /x;}publicstaticvoidmain(String[]args){try{int z =realizarConta(2,10);System.out.println(z);String x =null;System.out.println(x.length());}catch(ArithmeticException |NullPointerException e){// 2 tipos de System.out.println(e.getMessage());// exceção // tratados da }// mesma formaSystem.out.println("FIM");}}

Fonte: Autores (2021).
Captura hierárquica
Por fim, é importante saber que as exceções também fazem parte de uma hierarquia de classes. Isso torna possível capturá-las de maneira hierárquica, como se em cada catch houvesse um teste de instanceof. Todas as exceções derivam da classe exception, o que nos permitirá reescrever o catch como:

    }catch(Exception e){System.out.println(e.getMessage());}

É possível até mesmo combinar as três abordagens, desde que as regras mais abrangentes fiquem por último e as mais específicas, por primeiro. O try entrará no primeiro catch que encontrar, sem executar os demais. Discutiremos mais sobre exceções hierárquicas e sua importância em breve, no tópico disparando exceções.
Cláusula finally
Em algumas situações, podemos querer que um trecho de código seja sempre executado, independentemente de uma exceção ter disso disparada ou não. Para esses casos, podemos associar ao try a cláusula finally. Veja um exemplo a seguir.
Execute o programa a seguir e confira se você consegue apresentar a mensagem, conforme tela apresentada.
Figura 7 – Exercício: cláusula finally

publicclassExemplo{staticint realizarConta(int x,int y){returny /x;}publicstaticvoidmain(String[]args){try{int z =realizarConta(2,10);if(z ==5)return;System.out.println(z);String x =null;System.out.println(x.length());}catch(Exception e){System.out.println(e.getMessage());}finally{System.out.println("Sempre executado!");}System.out.println("FIM");}}


Fonte: Autores (2021).
Note que o código dentro do finally foi executado mesmo com a presença do return da linha 9! Como exercício, teste outros valores para o método realizar conta e observe como o finally sempre será executado – não importando se uma exceção foi disparada, se houve um return, ou mesmo, se o método executou até o final. Por fim, um último detalhe: blocos try...finally, sem nenhum catch, também são permitidos!
Criando e disparando exceções
O mecanismo de exceções também permite que você crie e dispare suas próprias exceções. Além disso, ele fornece um conjunto de classes padrão de exceção, que facilitam o trabalho nos casos comuns, e facilitam a classificação das exceções nos demais casos.
Tipos de exceções
Primeiramente, é importante saber que existem diferentes tipos de exceções. A hierarquia de classes das exceções começa com quatro classes importantes.
Figura 8 – Classes básicas de exceção

Fonte: Autores (2021).
A classe throwable representa qualquer coisa que possa ser disparada como exceção e capturada na cláusula catch. Destacamos três métodos importantes:
• getMessage: observe que o Java especifica que todas as exceções devem possuir uma mensagem descritiva de erro. Mesmo quando criamos nossas exceções, devemos nos preocupar em escrever um texto descritivo do problema ocorrido.
• getCause: em algumas situações, pode ser interessante capturar uma exceção específica e gerar outra mais abrangente. Por exemplo, em um método que faz a carga dos dados da sua aplicação de diferentes locais, você pode querer capturar a exceção específica das várias fontes de dados (SQLException, IOException etc.) e disparar uma exceção mais geral. Nesse caso, é possível incluir a exceção original como causadora
• printStackTrace: imprime o stack trace da exceção.
Entretanto, quando formos criar nossas próprias exceções, jamais as criaremos como filhas diretas de throwable. No lugar, o Java fornece as classes exception e RuntimeException para isso. Elas representam os dois tipos de exceção da linguagem:
• Exceções verificadas (filhas de exception): devem ser obrigatoriamente capturadas pelo programador. No caso delas, a cláusula try...catch será obrigatória, ou o método terá de sinalizar que dispara aquela exceção. Geralmente representam problemas comuns, relacionados à situação sendo modelada. Por exemplo, as classes que carregam arquivos no Java disparam uma exceção verificada do tipo IOException. Isso ocorre porque há vários problemas comuns na carga de arquivos (arquivo não existir, estar corrompido, não ter permissão de leitura etc.).
• Exceções não verificadas (filhas de RuntimeException): não precisam ser tratadas pelo programador. Geralmente, representam problemas de programação, que poderiam ser prevenidos de outra forma. A exceção que vimos no exemplo, ArithmeticException, é um tipo de exceção desse tipo.
E a classe error? Ela também irá disparar exceções não verificadas, porém, representam erros graves, cujo tratamento não é possível. Frequentemente, ela só é capturada para fins de registro. Elas geralmente são disparadas pela Virtual Machine. Um exemplo de erro é a falta de memória. Não há o que a aplicação fazer caso um OutOfMemoryError seja disparado.
Disparando exceções não verificadas
Para disparar uma exceção, utilizamos a cláusula throw, com o objeto da exceção a ser disparado. O Java possui uma série de classes padrão de exceção para problemas comuns, veja alguns exemplos na tabela a seguir.
Figura 9 – Exceções comuns


Fonte: Autores (2021).
Vejamos um exemplo: digamos que você está programando o método setIdade, da classe pessoa. Sabemos que pessoas não possuem idades negativas e não podem viver centenas de anos. Então, poderíamos implementar o método da forma apresentada a seguir.
Figura 10 – Exemplo: método setIdade

publicclassPessoa{privateint idade;...publicvoidsetIdade(int idade){if(idade <=0||idade >=130){thrownewIllegalArgumentException("Idade inválida: "+idade);}this.idade =idade;}}

Fonte: Autores (2021).
Observe o uso da cláusula throw na linha 6. Ela foi seguida da criação do objeto da exceção, o que pode ser visto com o uso do new. Como essa linha abandonará o método setIdade imediatamente caso seja atingida, não é necessário colocar o restante do código em um else.
Note que usamos a exceção padrão, não verificada, IllegalArgumentException, para essa situação. Afinal, geralmente o programa não permitirá que uma idade inválida seja fornecida (isso será barrado na interface gráfica) e, portanto, passar um parâmetro inválido está mais próximo de um erro de programação do que realmente de uma situação natural que deva ser testada o tempo todo.
Testar parâmetros dessa forma é uma boa prática, e tem até um nome: código de guarda (code guard).
IMPORTANTE
Procure sempre programar de maneira preventiva, isso evita que um erro como o da Figura 10 se propague. Acredite: vai ser bem mais fácil diagnosticar e corrigir um problema se uma exceção for disparada no ponto exato em que ele foi gerado, do que o descobrir dias depois, pois há valores errados em seu banco de dados!
Disparando exceções verificadas
Algumas exceções sinalizam problemas legítimos, que deveriam ser constantemente verificados pelo programador. Por exemplo, numa classe ContaCorrente, poderíamos querer sinalizar a possibilidade de não haver saldo no momento do saque – situação que tornaria o saque impossível.
Para esses casos, utilizamos as exceções verificadas, ou seja, àquelas que são filhas de exception, mas não de RuntimeException. Embora não seja uma regra absoluta, é comum também que as exceções verificadas sejam de tipos criados por nós, já que elas validam regras de negócio mais específicas, e não problemas comuns de programação.
Como implementaríamos então o método sacar? Veja o exemplo a seguir.
Execute o programa-exemplo.
Figura 11 – Exemplo: exceção verificada SaldoInsuficienteException

publicclassSaldoInsuficienteExceptionextendsException{publicSaldoInsuficienteException(String msg){super(msg);}}


publicclassContaCorrente{privatedouble saldo;publicvoidsacar(double valor)throws SaldoInsuficienteException {if(saldo -valor <=0){thrownewSaldoInsuficienteException(String.format("O saldo %.2f é insuficiente para sacar o valor %.2f",saldo,valor));}this.saldo -=valor;}}

Fonte: Autores (2021).
Observe que, inicialmente, fizemos a criação da classe SaldoInsuficienteException, filha de exception. Fizemos a chamada ao construtor da classe-pai para repassar a mensagem de erro.
Na classe ContaCorrente, iniciamos com o código de guarda, como fizemos no método setIdade, testando se o saldo seria suficiente para o saque. Caso não seja, criamos a exceção e a disparamos com o throws. Porém, observe que tomamos o cuidado de gerar uma mensagem bastante descritiva. Isso nos auxiliará a entender em detalhes em que situação o problema ocorreu, caso ele venha a acontecer.
Observe também que há mais um detalhe nesse código: na declaração do método sacar, na linha 4, agora encontramos a cláusula throws e o nome da exceção. Isso indica que esse método dispara essa exceção verificada e que ela deve ser obrigatoriamente tratada. Nesse caso, o programador que chamar o método sacar tem duas opções:
• Adicionar um bloco try...catch que capture e trate a exceção, impedindo que ela se propague.
• Indicar que o método que usa o método sacar não trata essa exceção e, portanto, também pode dispará-la. Nesse caso, esse método também terá que conter a cláusula throws.
Isso tem um impacto importante: observe que, se uma nova exceção verificada for adicionada a um método, o Java exigirá que todos os pontos que chamam aquele método sejam modificados.
Felizmente, a cláusula throws também é hierárquica. Por isso, é interessante criarmos uma hierarquia de exceções em nosso sistema. Por exemplo, a exceção SaldoInsuficienteException poderia ser filha de ContaCorrenteException, que por sua vez poderia ser filha de BancoException – essa sim, mãe de todas as exceções de nosso sistema. Poderíamos então reorganizar o método sacar para ter em sua cláusula throws uma ContaCorrenteException, mesmo que seu throw interno ainda dispare a exceção específica.
Execute o programa-exemplo.
Hierarquia de exceções: a exceção SaldoInsuficienteException é filha de ContaCorrenteException, que por sua vez é filha de BancoException – a mãe de todas as exceções de nosso sistema.
Figura 12 – Exemplo: hierarquia de exceções


publicclassContaCorrente{privatedouble saldo;publicvoidsacar(double valor)throws ContaCorrenteException {if(saldo -valor <=0){thrownewSaldoInsuficienteException(String.format("O saldo %.2f é insuficiente para sacar o valor %.2f",saldo,valor));}this.saldo -=valor;}}

Fonte: Autores (2021).
Observe que isso faz bastante sentido. Normalmente, quem faz catch no método sacar irá querer pegar qualquer problema relacionado ao saque (saldo insuficiente, limite insuficiente, conta encerrada etc.). Ou seja, estamos indicando na cláusula throws que o ContaCorrenteException é o nível ideal para a captura. Porém, ainda fornecemos exceções mais específicas, para caso seja necessário tratar um dos problemas maneira especial. Da mesma forma, lembre-se: o programador que utiliza o método sacar ainda tem a liberdade de capturar uma exceção ainda mais alta (como BancoException), caso queira, pois a cláusula catch também é hierárquica.
Organize cuidadosamente a hierarquia de classes de exceção do seu sistema.
Vamos trabalhar mais nesse exemplo. Realize o exercício a seguir da Figura 13.
EXERCÍCIO
Exceção SaldoInsuficienteException
Observe o diagrama de classes do programa para tratamento de exceção verificada, que está em uma estrutura hierárquica.
Figura 13 – Exercício: exceção SaldoInsuficienteException

Execute o programa, verificando como é o seu funcionamento passo a passo (faça a depuração do código.o debug).
Responda:
1. Por que o método retirar() da classe ContaCorrente está declarado para lançar (throws) a exceção ContaCorrenteException, contudo em caso de erro, lança de fato (throw new) a exceção SaldoInsuficienteException?
2. Se o método retirar() da classe ContaCorrente executar o comando “throw new  SaldoInsuficienteException());” qual será o valor do saldo da conta corrente após esse comando?​
3. Na classe banco, na execução da linha 13, foi gerada exceção? Por quê?
4. Na classe banco, linha 23, de que classe é a instância de exceção “e” tratada?
5. No método main da classe banco, seria possível retirar os comando try-catch? Por quê?​
6. No método main da classe banco, os comando try-catch envolvem o método sacar(). Por quê?
7. Na classe banco, qual o valor apresentado pela execução do bloco finally da linha 24? Por que esse valor é apresentado?

// Exceção mais genéricapublicclassContaCorrenteExceptionextendsException{publicContaCorrenteException(String message){super(message);}}


// Exceção mais específicapublicclassSaldoInsuficienteExceptionextendsContaCorrenteException{publicSaldoInsuficienteException(String message){super(message);}}


publicclassContaCorrente{privatedouble saldo;publicContaCorrente(double saldo){this.saldo =saldo;}// Declaração do o método retirar, que pode lançar uma exceção// mais genérica: ContaCorrenteException publicvoidretirar(double valor)throws ContaCorrenteException {// Em erro específico, lança exceção específica: // SaldoInsuficienteException, filha de ContaCorrenteException  if(saldo -valor <=0)thrownewSaldoInsuficienteException(String.format("O saldo R$ %.2f é insuficiente para sacar o valor R$ %.2f",saldo,valor));elsethis.saldo -=valor;}publicdouble getSaldo(){returnsaldo;}}


publicclassBanco{// Método sacar DELEGA o tratamento de exceção genérica  // (ContaCorrenteException), pois não fará o seu tratamentoprivatestaticvoidsacar(ContaCorrente c,double valor)throws   
    ContaCorrenteException {c.retirar(valor);}publicstaticvoidmain(String[]args){ContaCorrente cta =newContaCorrente(1000);try{sacar(cta,200);}catch(ContaCorrenteException e){System.out.println("Erro: "+e.getMessage());}finally{System.out.println("Saldo Conta: R$ "+cta.getSaldo());}try{cta.retirar(2000);}catch(ContaCorrenteException e){System.out.println(e.getMessage());}finally{System.out.println("Saldo Conta: R$ "+cta.getSaldo());}}}

Fonte: Autores (2021).
• Resolução do exercício
Testes unitários
Obviamente, queremos que nossos sistemas sejam robustos e livres de erros. Podemos utilizar o mecanismo de captura de erros a nosso favor, testando por potenciais problemas ou validando situações em vários pontos do código. De fato, há ferramentas inteiras dedicadas aos testes de sistemas, como o JUnit. A linguagem Java fornece uma instrução simples com o este objetivo, chamada assert. 
O comando assert também testará uma condição e disparará uma exceção, similar ao que ocorre com os códigos que geramos até agora. Porém, há uma diferença: ele só fará isso caso passemos um comando específico para a JVM na hora de executar nossa aplicação. Veja como ativar as exceções do assert, habilitando essa verificação na JVM (no Eclipse e no IntelliJ).
Comando assert: apenas dispara exceção caso passemos um parâmetro específico na hora de executar nossa aplicação na Virtual Machine (VM).
• No Eclipse: botão direito sobre classe → Run As → Run Configurations... → Arguments → VM Arguments: -ea.​
• No IntelliJ:  Run → Edit Configurations → Application → VM options: -ea.
Então, para que utilizamos? Para validar pressupostos de programação, ou seja, para escrever testes que validem nosso próprio código (testes unitários), em uma destas situações:
1. Pré-condições: situações que devem ser verdadeiras quando o método foi invocado.
2. Pós-condições: situações que devem ser verdadeiras quando o método foi finalizado.
3.  Invariantes: situações que permanecem inalteradas em todo programa. Geralmente, testada ao fim de métodos públicos.
Que tal observarmos um exemplo prático?
Figura 14 – Exemplo: carrinho de compras com asserções

classCarrinhoDeCompras{privatestaticint maximo =10;privatestaticint quantidade =0;privatestaticint inseridos =0;privatestaticint removidos =0;privatestaticdouble preco_unitario =10.00;publicstaticvoidinserir(){assert(quantidade <maximo);//PRE-CONDICAOquantidade++;inseridos++;assert(quantidade ==inseridos -removidos);// INVARIANTE}publicstaticvoidremover(){assert(quantidade >0);// PRE-CONDICAOquantidade--;removidos++;assert(quantidade >=0);//POS-CONDICAOassert(quantidade ==inseridos -removidos);// INVARIANTE}

Fonte: Autores (2021).
Esse código possui as seguintes asserções:
• Pré-condições: na inserção, o carrinho não deveria ter mais itens do que a quantidade máxima. Na remoção, há a necessidade de haver pelo menos um item.
• Pós-condições: o método remover jamais poderá deixar o carrinho com uma quantidade negativa de itens. Isso só ocorrerá na presença de um erro de programação. Por isso, deixamos esse pressuposto explícito.
• Invariantes: observe que indiferentemente se inserimos ou removemos, a quantidade total de itens do carrinho precisará ser igual à quantidade de itens inseridos subtraído dos itens removidos. Testes de invariantes são bastante úteis quando testamos redundâncias de informação em nossas classes, ou seja, informações que podem ser obtidas de duas formas diferentes – como no exemplo.
Asserções e exceções
Você pode estar se perguntando: no caso das pré-condições, não seria melhor utilizar exceções no lugar das pré-condições?
A resposta é: depende. Quando analisar se deve ou não utilizar uma asserção, questione:
1. O que está sendo testado é uma regra de negócio? Ou você está se prevenindo como programador de um erro seu? Se for o primeiro caso, prefira exceções.
2. O que está sendo testado é uma situação comum? Ou é algo que só ocorrerá no caso de bugs? Se for o primeiro caso, prefira exceções.
3. Se você remover o teste, valores incorretos poderão ser inseridos no sistema? Se a resposta for positiva, prefira exceções.
Refletindo a respeito, o que você deduz sobre o carrinho de compras? Sim, o sistema estaria mais bem modelado com exceções e códigos de guarda nessas condições.
Mas voltemos ao caso do método setIdade, visto no exemplo da Figura 10, item “disparando exceções não verificadas”. Obviamente, uma idade negativa é um problema, mas será que deveríamos testar a idade máxima com tanto rigor? Podemos usar uma asserção para sinalizar uma situação estranha, enquanto mantemos o teste para o que certamente é o fruto de um problema.
Figura 15 – Exemplo: Método setIdade com asserção

publicclassPessoa{privateint idade;publicvoidsetIdade(int idade){//PRÉ-CONDIÇÃOassert(idade <80);if(idade <=0||idade >=120){thrownewIllegalArgumentException("Idade inválida: "+idade);}this.idade =idade;}}

Fonte: Autores (2021).
Observe que a exceção se manteve, mas com um parâmetro menos rigoroso do que a asserção. Afinal, a pessoa mais velha do mundo em 2021, fez 118 anos em janeiro – mais do que isso, obviamente, é um erro de cadastro. Menos, pode até ser uma situação possível, embora pouco provável. Se não há uma regra de negócios explicitamente mapeada indo contra essa situação, esse cadastro deveria ser possível.
Por outro lado, a asserção está testando um pré-condição que o time de programação considerou quando elaborou esse sistema: tal situação é tão improvável que eles acham que não irá acontecer. Isso pode ter implicações importantes, como uma caixa de textos do sistema não ser larga o suficiente para um usuário com três dígitos em sua idade, ou mesmo não ter uma opção para data tão antiga caso um calendário seja apresentado.
Isso permitirá que o sistema sinalize um problema no desenvolvimento, se futuramente essa regra for violada.
Pratique, no exercício da Figura 16, os conceitos de asserção: como ativar essa exceção e situações de uso.
EXERCÍCIO
Asserção
Execute o programa a seguir, para verificar as situações.
1. O programa original não aponta erro, pois a JVM não foi habilitada para pegar erros de assert: observe o valor a pagar negativo e o total de itens no carrinho também negativo:
Figura 16 – Exercício: asserção

2. Habilite a JVM para pegar erros de assert. Agora é possível verificar os erros pegos pelo assert: veja que tentamos incluir seis itens, contudo o carrinho comporta apenas cinco itens.

3. Altere o código do programa para obter os erros de:
a. Carrinho vazio, quanto tentamos remover itens de um carrinho vazio.

b. Valor insuficiente, quando não há valor em carteira suficiente para pagar pelos itens do carrinho.

c. Compra bem-sucedida, quando todas as restrições são atendidas e Maria consegue levar os itens comprados no carrinho.


packageCarrinho;publicclassCarrinho{privateint     qtdMaxima;privateint     quantidade =0;privateint     inseridos =0;privateint     removidos =0;privatedouble	precoUnitario;publicCarrinho(int qtdMaxima,double precoUnitario){this.qtdMaxima =qtdMaxima;this.precoUnitario =precoUnitario;}publicvoidprintCarrinho(){System.out.println("  - Qtd. máxima de itens no carrinho = "+qtdMaxima);System.out.printf("  - Preço unitário de cada item      = R$ %.2f\n",precoUnitario);}publicvoidinserir(){assert(quantidade <qtdMaxima ):String.format("Inclusão: carrinho cheio, já com %d itens.\n",quantidade);//PRE CONDICAOquantidade++;inseridos++;assert(quantidade ==inseridos -removidos );// INVARIANTE}publicvoidremover(){assert quantidade >0:"Remoção: carrinho vazio, não é possível retirar mais itens.";// PRE CONDICAOquantidade--;removidos++;assert quantidade ==inseridos -removidos :"quantidade != inseridos - removidos";// INVARIANTE}publicint getQuantidade(){returnquantidade;}publicdouble totalizar(double precoMaximo){double precoTotal =precoUnitario *quantidade;assert(precoTotal <=precoMaximo ):String.format("Valor insuficiente: R$%.2f para gastar foi ultrapassado\n",precoMaximo);// POS CONDICAOreturnprecoTotal;}}


packageCarrinho;publicclassComprador{privateString nome;privatedouble valorTotalCarteira;privateCarrinho carrinho;publicComprador(String nome,double valorTotalCarteira,int qtdCarrinho,double precoUnitario){this.nome =nome;this.valorTotalCarteira =valorTotalCarteira;this.carrinho =newCarrinho(qtdCarrinho,precoUnitario);}publicdouble getValorTotalCarteira(){returnvalorTotalCarteira;}publicvoidprintComprador(){System.out.println("Nome comprador(a): "+nome);System.out.printf("Valor para gastar: R$ %.2f\n",valorTotalCarteira);carrinho.printCarrinho();System.out.println("----------------------");}publicstaticvoidmain(String[]args){int totalInclusao =6;int totalRemocao  =8;Comprador maria =newComprador("Maria",10.0,5,15.0);maria.printComprador();try{for(int i=0;i<totalInclusao ;i++)// insere // "totalInclusao" de itens no carrinhomaria.carrinho.inserir();System.out.println("Itens no carrinho, após inclusão = "+maria.carrinho.getQuantidade());for(int i=0;i<totalRemocao  ;i++)// insere  // "totalRemocao" de itens no carrinhomaria.carrinho.remover();System.out.println("Itens no carrinho, após remoção  = "+maria.carrinho.getQuantidade());System.out.printf("Valor a pagar: R$ %.2f\n",maria.carrinho.totalizar(maria.getValorTotalCarteira()));}catch(AssertionError e){System.out.println("Erro - "+e.getMessage());}}}

Fonte: Autores (2021).
• Resolução do exercício
Referências
GODOY, V. Programação orientada a objetos I. Curitiba: IESDE, 2019.
HORSTMANN, C. S.; CORNELL, G. Core Java – Volume I. 8. ed. São Paulo: Pearson, 2010. 
SCHILDT, H. Java para iniciantes. Porto Alegre: Bookman, 2015.
© PUCPR - Todos os direitos reservados.
Créditos | Privacidade e Proteção de Dados

De <https://materiaisonline.pucpr.br/v3/> 

