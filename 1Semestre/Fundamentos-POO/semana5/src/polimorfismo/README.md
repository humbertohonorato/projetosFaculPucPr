
Herança: mecanismo que permite que uma subclasse estenda uma classe pai, ou superclasse, provendo reuso de código (atributos e métodos), que pode ser incrementado e/ou alterado.
Polimorfismo (polis = muitas, morphos = formas): na POO, o polimorfismo permite enviar uma mesma mensagem (invocação de método) para diferentes objetos de classes herdeiras da mesma superclasse (herança), e fazê-los responder de maneira diferente, ou seja, da forma mais apropriada para cada objeto.

Conversões de tipos
Como vimos, uma referência pode conter tipos de sua classe filha sem qualquer problema. Esse comando sempre será válido:

Veiculo v = new Carro(); //O carro é um Veículo

Entretanto, a operação contrária não é permitida. Afinal, qualquer carro certamente será um veículo, mas nem todo veículo será um carro (ele pode ser uma moto, onibus etc.).

Em Java, podemos testar o tipo do objeto apontado por uma referência por meio do operador instanceof. Ele retornará verdadeiro caso a variável indicada do lado esquerdo seja do tipo da classe indicado do lado direito, ou sua filha, direta ou indiretamente (ou seja, se é a mesma classe, ou uma classe acima na hierarquia, independentemente de sua altura).

A partir do momento em que temos essa certeza, podemos utilizar a operação de type casting para converter a referência em um tipo inferior da hierarquia. Por exemplo:

//A variável v é um Carro?

        if (v instanceof Carro) {

            //Em caso positivo, convertemos

            Carro carro = (Carro)v; //Down casting – cast “para baixo”

            //E agora podemos utiliza-la

            System.out.println("Capacidade do porta malas:" +

                    carro.getPortaMalas());

        }

Você já usou type casting antes, lembra? Ele também é necessário quando você converte um número de ponto flutuante (float, double) em um número inteiro. Ele é o operador para conversões perigosas (no caso dos números, pode ser que haja casas decimais que seriam descartadas).

E o que ocorre se a conversão do objeto v não for possível? O Java disparará um erro do tipo ClassCastException.

Por fim, é importante ressaltar que esse tipo a operação de instanceof é relativamente raro. Normalmente, o polimorfismo e a hierarquia de tipos tornarão esse tipo de conversão desnecessária, resolvendo problemas com muita elegância. Desconfie do seu código caso você esteja fazendo esse tipo de testes o tempo todo.

EXERCÍCIOPolimorfismo e sobrescrita
O que será impresso pelo código a seguir? Explique.

Figura 11 – Exercício, sobrescrita e polimorfismo
class Foo {
public void a() {
System.out.println("a");
}

    public void b() {
        System.out.println("b");
    }
    
    void print() {
        a();
        b();
    }
}

class Bar extends Foo {
public void a() {
System.out.println("A");
}

    public static void main(String[] args) {
        Foo f = new Bar();
        f.print();
    }
}
Fonte: Autores (2021).
Resolução do exercício

O tipo da variável de referência é foo, porém, ela aponta para um objeto bar. Graças ao polimorfismo, devemos levar em consideração esse objeto ao avaliar os métodos.

Na linha 23, print() é chamado. O objeto bar não possui esse método, por isso, chama o método de foo.

Na linha 11, o método print() chamará o método a(). Como o objeto é do tipo bar, e este possui uma sobrescrita do método (linha 17), sua versão será chamada imprimindo “A”.

Em seguida, na linha 12, o método b() será chamado. Não há sobrescrita, por isso, o valor “b” será impresso.

Resultado: “Ab”.