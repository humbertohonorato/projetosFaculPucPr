Implemente o programa a seguir, conforme indicado.
Observe a sobrecarga (overload) do método somar, na classe soma: existem três implementações diferentes.
O compilador decide qual método somar será invocado, dependendo da forma com que são chamados. Veja essas diferenças nas invocações ao método somar, realizadas no método main.

Veja mais um exemplo: poderíamos ter um método estático na classe carro para criar um conjunto de carros baseado em seus modelos. Os modelos poderiam ser passados como parâmetro em um array de strings:

public static List<Carro> criar(String ... modelos) {
var carros = new ArrayList<Carro>();
for (var modelo : modelos) {
carros.add(new Carro(modelo, "1.0", 250));
}
return carros;
}
Mas, e se quiséssemos que o método também funcionasse com uma lista de modelos passada por parâmetro? Nesse caso, poderíamos sobrecarregá-lo:

public static List<Carro> criar(List<String> modelos) {
//o método toArray() copia a lista em um vetor
return criar(modelos.toArray(new String[0]));
}
Há algumas regras, entretanto, que devem ser observadas ao utilizar métodos sobrecarregados:

1. O tipo da lista não pode ser utilizado como parâmetro para fazer sobrecarga. Isso ocorre porque o Java transforma a lista em um List<Object> durante a compilação, uma propriedade chamada de type erasure. Ou seja, dois métodos com assinatura metodo(List<String>) e metodo(List<Carro>) após a compilação, ficam com a mesma assinatura.

2. O Java determina qual versão do método utilizar durante a compilação. Ou seja, em uma sobrecarga em que um dos tipos é filho de outro, será levado em conta o tipo da referência, e não do objeto instanciado. Em seguida, o Java procurará a versão mais específica para fazer a chamada. Por exemplo, suponha a existência das classes avo, pai e filho:

public static void main(String args[]){
Avo obj = new Filho();        
teste(obj);  // Chama teste(Avo avo), já que a o variável obj é do tipo Avo
teste(new Filho()); // Chama teste(Pai avo) já que a sobrecarga mais específica  
//para o tipo Filho é Pai
}
3. O tipo do retorno, sozinho, não pode ser usado para gerar uma sobrecarga.

