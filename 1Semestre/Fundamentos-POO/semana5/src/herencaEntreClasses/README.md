
EXERCÍCIOBuscando similaridades
Vamos trabalhar nos exemplos passados na Figura 1, para ver como esses conceitos são traduzidos em código Java.

Crie um projeto com as classes carro, moto e main  no mesmo pacote default, como indicado.
Execute o projeto a partir da classe main.
Após isso:
Quais métodos e atributos idênticos as classes moto e carro possuem?
Existe algum método em comum, cuja implementação não seja idêntica? Reflita: o significado do método é o mesmo em ambos os casos?
Agora, observe a classe main. Há trechos de códigos realizando praticamente as mesmas operações? Quais são eles?
O que aconteceria na classe main se mais classes fossem inseridas?

RCÍCIOGeneralizando o código
Neste exercício, melhoraremos o código de exemplo da Figura 3, agrupando as classes similares em uma superclasse, chamada veiculo. Faremos isso por meio da palavra-chave extends, que cria relações de herança.

Crie uma nova classe, chamada veiculo.
Em seguida, faça as seguintes alterações no código, como indicado:
Copie os métodos e atributos que são idênticos na classe carro e moto para a classe veiculo e altere os construtores conforme o código a seguir.
Altere a declaração das classes moto e veiculo para incluir a instrução extends veiculo.
Exclua os métodos idênticos das classes carro e moto.
Crie uma terceira classe onibus.
Adicione a ela os atributos do número de passageiros e se é ou não articulado.
Não esqueça também do método imprimir.
E de criar alguns ônibus na classe main.

XERCÍCIOMembros protected
Conforme já vimos na Unidade 3, um atributo protected é visível e acessível por qualquer classe filha ou classes no mesmo pacote.

Altere a visibilidade do atributo marca para protected e do atributo motor para default, como no modelo.
Em seguida, altere o método imprimir da classe moto para utilizar os atributos diretamente, sem a palavra-chave this.
Altere também o método da classe carro para utilizar os atributos, mas prefixe-os com a palavra-chave this.
Crie um pacote motos, mova a classe moto para lá e reflita: Por que um problema ocorreu?
Uma das formas de eliminar esse problema seria trocar o atributo motor para public. Mas essa seria uma solução correta?

Sobrescrita (override) é um recurso que permite a uma subclasse, ou classe filha, redefinir a implementação de um método herdado de uma de suas superclasses ou classes pai.
Método sobrescrito é um método em uma classe filha que tem a mesma assinatura (mesmo nome, mesmos parâmetros e o mesmo tipo de retorno) desse mesmo método definido em uma de suas classes pai.

EXERCÍCIOMétodos sobrescritos
Teste você mesmo esse comportamento:

Adicione o método imprimir() à classe veiculo, como descrevemos, e em seguida, rode o programa. Você verá que ele continua executando exatamente igual rodava antes.
Então, exclua o método imprimir de uma das classes filhas (ex.: moto) e teste novamente. O que acontece?