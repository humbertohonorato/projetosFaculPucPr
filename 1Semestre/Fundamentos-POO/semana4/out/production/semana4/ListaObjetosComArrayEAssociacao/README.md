Crie os arquivos com os códigos fonte das classes dependente, contribuinte e ReceitaFederal, conforme o indicado.
Observe que contribuinte tem um atributo do tipo ArrayList de objetos da classe dependentes, atributo chamado de dep: private ArrayList <Dependente> dep;
Observe que a instância dep é criada no método construtor da classe contribuinte: dep = new ArrayList <Dependente>();
Observe que para manipular pets e acessar cada um dos seus objetos, usamos um iterador fo tipo for-each:
for (Dependente d : dep) {

                  d.imprimir();

      }          

Execute o projeto a partir da classe ReceitaFederal.
Altere a classe ReceitaFederal:
Acrescente um novo contribuinte Pedro, sem dependente. Imprima o total de dependentes de Pedro (zero dependentes).
Acrescente um novo contribuinte João, com uma única dependente Ana. Imprima o total de dependentes de Pedro (uma dependente).