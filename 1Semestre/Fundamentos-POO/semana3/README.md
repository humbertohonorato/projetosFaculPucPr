Fundamentos da Programação Orientada a Objetos
UNIDADE 03
Encapsulamento
Olá! Nesta Unidade, criaremos programas que ocultam os detalhes de implementação de uma classe, impedindo o acesso direto ao estado do objeto (atributos). Nesse caso, o acesso aos atributos ocultos pode ser feito apenas por meio de sua interface (métodos públicos), como ilustrado na Figura 1 a seguir.
Vamos recordar: abstrair é observar um todo, com o objetivo de isolar um elemento, ou um conceito, com o qual precisamos trabalhar, excluindo os demais.
Usamos um processo de abstração para realizar o encapsulamento das classes, que consiste em separar a visão do criador dos objetos da visão do usuário desses objetos. Para isso, o criador do objeto, ou programador, “esconde” a parte interna da classe (detalhes de lógica e atributos) da parte externa da classe, que é acessada pelos usuários dos objetos da classe. A visão externa da classe é chamada de interface da classe.
Figura 1 – Encapsulamento

Fonte: Autores (2021).
Modificador de acesso: público, privado e pacote
O Java utiliza algumas palavras-chave para ocultar os detalhes de implementação das classes, que são os modificadores de acesso. Eles são utilizados para especificar quais membros da classe (atributos ou métodos) podem ser visíveis ou acessíveis por outras classes.
O conjunto de métodos de uma classe especificados como acessíveis por outras classes constitui a interface dessa classe.
Na Figura 2 estão apresentados os modificadores de acesso público, privado e protegido. O modificador protegido será trabalhado novamente quando estivermos estudando a Unidade 5 – Hierarquia.
Modificador público em Java = public:
Indica que a classe, atributo ou método é visível por qualquer outra classe, em qualquer pacote.
Modificador default (padrão) em Java = não usa palavra-chave; vazio:
Indica que a classe, atributo ou método é apenas por classes que estejam no mesmo pacote (package) da classe em que foram declarados.
Modificador protegido em Java = protected:
Indica que o atributo ou método é visível apenas por classes que estejam no mesmo pacote (package) da classe em que foram declarados, ou em classes filhas (subclasse) de qualquer pacote*. 
Modificador privado em Java = private:
Indica que o atributo ou método é visível apenas dentro da própria classe em que foi declarado.
Figura 2 – Visibilidade x modificadores de acesso

Fonte: Autores (2021).
Para exemplificar, vamos pensar em uma solução computacional que é concebida a partir de um exercício de abstração, em que precisamos identificar os elementos que interessam a um determinado software.
Membros públicos
Como vimos, um membro (atributo ou método) público é visível e acessível por qualquer outra classe, logo:
• Um método público pode ser chamado de qualquer classe.
• Um atributo público pode ser lido ou escrito a partir de qualquer classe.
Figura 3 – Exemplo de atributos e métodos públicos

class A {   public static void g( ) // método A.g() é público   { … }   public static int k;     // atributo A.k é público}

class B {   static void f( ) // método B.f() é default   {      A.g();        // B.f() chama o método A.g()        int x = A.k;  // B.f() lê o atributo A.k      A.k = 10;     // B.f() escreve ou modifica o atributo A.k       }}
Fonte: Autores (2021).
Membros privados
Como vimos, um membro (atributo ou método) privado é visível e acessível apenas pela própria classe, logo:
• Um método privado pode ser chamado apenas dentro na própria classe, em que foi declarado.
• Um atributo privado pode ser lido ou escrito apenas dentro na própria classe, em que foi declarado.
Figura 4 – Exemplo de atributos e métodos privados

class A {   private static void g( ) // método A.g() é privado   { … }   private static int k;     // atributo A.k é privado    static void f( )          // método A.f() é default   {      g();       // método A.g() é chamado na própria classe, em A.f()      int x = k;      k = 10;    // atributo A.k é lido na própria classe, em A.f())    }}
Fonte: Autores (2021).
Membros de pacote
• Pacotes (packages) são usados para agrupar classes.
• Um membro (atributo ou método) de uma classe declarada dentro de pacote é visível e acessível por todas as classes desse mesmo pacote e somente por essas.
• Importante: quando o modificador não é especificado, a classe pertence ao pacote default (padrão).
Figura 5 – Exemplo de atributos e métodos no mesmo pacote

Fonte: Autores (2021).
Classes públicas
Uma classe pública é visível e acessível a partir de classes de outros pacotes.
Figura 6 – Exemplo de classes públicas

Fonte: Autores (2021).
EXERCÍCIO
Encapsulamento
Verifique a sua compreensão em relação à criação e utilização de objetos que utilizam encapsulamento – detalhes apresentados na Figura 7 a seguir.
1. Crie um projeto com as classes A e B no pacote P1, conforme indicado.
2. Observe que não são declarados modificadores de acesso. Logo, o modificador é default (padrão vazio).
3. Observe que o atributo A.k não tem valor declarado e, nesse caso, seu valor default é zero.
4. Observe que o método A.g() apenas apresenta o valor de A.k na tela.
5. Observe que a classe B tem acesso aos membros da classe A, pois o modificador dos seus membros é o default e ambas as classes estão no mesmo pacote P1.
6. Observe que o método B.f() consegue alterar o atributo A.k – tem permissão de acesso, pois o modificador de A.k é o default.
7. Verifique as questões a seguir no seu ambiente de desenvolvimento (IDE) e responda:
   1. É possível usar o modificador private antes da palavra-chave class, tanto na classe A quanto na classe B? O que acontece?
   2. É possível usar o modificador private nos métodos A.g () e B.f ()? Justifique.
   3. É possível usar o modificador protected nos métodos A.g () e B.f ()? Justifique.
Figura 7 – Exercício encapsulamento: classe A e classe B

package P1;class A{	static int k; // valor default = zero		static void g() {		System.out.println("------------------");		System.out.println("... Método A.g (sem modificador)");		System.out.println("... Valor de A.k = " + k);		System.out.println("------------------");	}}


package P1;class B {	static void f() {		System.out.println("Método f (sem modificador)");		A.g();		int x = A.k;		System.out.println("Valor de x = " + x);		A.k = 10;		System.out.println("Valor de k = " + A.k);	}		public  static void main (String args[]) {		f();	} }
Fonte: Autores (2021).
• Resolução do exercício
   1. Não é possível. Gera erro de compilação, pois a classe precisa ser pública ou default (vazio).
   2. O método A.g () não pode ter modificador private porque ele é utilizado nos objetos da classe B . O método B.f () poderia ter modificador private porque apenas é utilizado dentro da própria classe B.
   3. Poderíamos utilizar o modificador protected em ambos os métodos A.g () e B.f (), pois são classes que estão no mesmo pacote e, com esse modificador, os métodos estariam acessíveis entre as classes.
Método construtor
Vamos recordar o que já apresentamos na Unidade 2 – Classes e Objetos, sobre o método construtor. Em Java, esse é um método especial, usado para inicializar objetos. O construtor é chamado quando um objeto de uma classe é criado ou instanciado. Ele pode ser usado para definir valores iniciais para atributos de objeto, conforme exemplificado na Figura 8 a seguir.
1. Crie um projeto com a classe carro, conforme indicado.
2. Observe que carro tem um atributo privado: marca (string).
3. Observe o método construtor:
1. Tem o mesmo nome da classe carro.
2. É público.
3. Não declara tipo de retorno: o retorno é o próprio objeto de carro.
4. Sua chamada (ou invocação) é feita com a palavra-chave new.
5. É usado para iniciar o atributo marca.
4. Execute o programa e verifique o resultado.
Figura 8 – Exercício com método construtor

public class Carro {	private String  marca;  // atributo oculto (encapsulamento / privado)		public Carro(String marca) { // Método construtor		this.marca = marca;	}  	public void imprimir() { // Método que exibe o valor do atributo na tela		System.out.println("Marca:  " + this.marca);	}	public static void main(String[] args) {		Carro meuCarro = new Carro("Ford"); // instancia Carro		meuCarro.imprimir();    // método público para exibir dados                                      // privados / encapsulados de carro 	}}

Fonte: Autores (2021).
Métodos getter e setter
Quando o encapsulamento oculta atributos da classe, usando o modificador de acesso private, é possível permitir o acesso a esses atributos de uma maneira controlada. A prática mais comum para fazer isso é criar dois métodos padrão getter (que obtém ou retorna alguma coisa) e setter (que atribui ou modifica alguma coisa). Esses métodos compõem a interface da classe e visam a prover um acesso controlado a atributos encapsulados. Veja como são declarados:
1. Padrão do método getter – retorna o valor do atributo: getNomeAtributo.
2. Padrão do método setter – muda o valor do atributo: setNomeAtributo.
3. Padrão do método is – retorna o valor boolean do atributo: isAtributo . 
Verifique e execute os exemplos de getter e setter nas Figuras 9 e 10 a seguir.
1. Crie um projeto com a classe carro modificada, conforme indicado.
2. Observe que carro tem dois atributos privados: marca (string) e ligado (boolean).
3. Observe o padrão dos métodos getter e setter para esses atributos – esses padrões para nome de método são boas práticas de programação:
1. public String getMarca()                         – retorna valor do atributo privado “marca”;
2. public void setMarca(String marca)     – altera valor do atributo privado “marca”;
3. public boolean isLigado()                        – retorna valor do atributo privado “ligado”;
4. public void setLigado(boolean ligado)  – altera valor do atributo privado “ligado”;
4. Observe o operador ternário (veja novamente a Unidade 1 – Dados e Variáveis):
1. Segue o padrão (expressão booleana) ? código 1 : código 2;
2. Como no comando: meuCarro.isLigado()==true?"Ligado":"Desligado"
3. Assim, meuCarro.isLigado() pode retornar true, que imprime "Ligado".
4. Ou pode retornar false, que imprime "Desligado".
Figura 9 – Exercício com métodos getter e setter

public class Carro {	private String  marca;  // atributo oculto (encapsulado / privado)	private boolean ligado; // atributo oculto (encapsulado / privado)		public Carro(String marca, boolean ligado) { // Método construtor		this.marca = marca;		this.ligado = ligado;	}	public String getMarca() { // Retorna valor do atributo privado “marca”;		return marca;	}	public void setMarca(String marca) {  // Altera valor de “marca”;		this.marca = marca;	}	public boolean isLigado() {  // Retorna valor do atributo privado “ligado”;		return ligado;	}	public void setLigado(boolean ligado) { //  Altera valor de “ligado”;		this.ligado = ligado;	}	public static void main(String[] args) {		Carro meuCarro = new Carro("Ford",false); //instancia Carro		System.out.println("Marca:  " + meuCarro.getMarca()); //Retorna valor 		System.out.println("Ligado: " +                              (meuCarro.isLigado()==true?"Ligado":"Desligado"));				meuCarro.setMarca("Renault"); //Altera valor de atributo privado		meuCarro.setLigado(true);     //Altera valor de atributo privado				System.out.println("Marca: " + meuCarro.getMarca()); // Retorna valor 		System.out.println("Ligado: " +                             (meuCarro.isLigado()==true?"Ligado":"Desligado"));	}}

Fonte: Autores (2021).
EXERCÍCIO
Interface criada com métodos getter e setter
Verifique o acesso controlado ao estado dos objetos de uma classe, conforme indicado na Figura 10.
1. Crie um projeto com as classes banco e conta, como indicado.
2. Complete o código da classe banco com métodos padrão getter e setter para obter a saída no console, conforme indicado.
Figura 10 – Interface com métodos getter e setter

public class Conta {   private double saldo;    private String dono;    public String getDono() {      return dono;    }   public void setDono(String dono) {      this.dono = dono;    }   public double getSaldo() {      return saldo;    }   public void setSaldo(double saldo) {      this.saldo = saldo;    }




Fonte: Autores (2021).
EXERCÍCIO
Fixação do conceito de encapsulamento
1. Crie um projeto com as classes arquiteto e circulo, no mesmo pacote default, como indicado.
2. Execute o projeto a partir da classe Arquiteto.
3. Observe o uso dos modificadores public e private.
4. Observe as diferentes formas de instanciar a classe circulo.
5. Remova os modificadores public dos membros da classe circulo e repita o teste. Por que ainda funciona?
6. Crie um projeto com dois pacotes, denominados especialista e matemática, contendo, respectivamente, as classes arquiteto e circulo.
   1. Será necessário incluir os comandos package e import.
   2. Quais métodos e/ou atributos de que classe precisam mudar para visibilidade public?
Figura 11 – Exercício fixação de encapsulamento: classes arquiteto e circulo

public class Arquiteto {	private String nome;	private int idade;	// Método construtor (tem o mesmo nome da classe)	public Arquiteto(String nome, int idade) {	this.nome = nome;   // "this" = referência ao atual objeto  	this.idade = idade; 	}	public void exibirDadosPessoais(){		System.out.println( nome);		System.out.println( idade+ " anos");	}	public void trabalhe (double r1, double r2, double r3) {		Circulo a= new Circulo(r1); // define e instancia o objeto "a"		double x = a.area();		double y = a.perimetro();		imprima(r1,x,y);				Circulo b= new Circulo(r2); //define e instancia o objeto "b"		x = b.area();		y = b.perimetro();		imprima(r2,x,y);				b = new Circulo(r3);        // instancia novamente o objeto "b" 		x = b.area();		y = b.perimetro();		imprima(r3,x,y);	}	private void imprima(double raio, double area, double perimetro) {		// %.2f = imprime float com 2 casas decimais		// \n   = salto de linha		System.out.printf("raio: %.2f cm\n", raio);  		System.out.printf("area: %.2f cm\n", area);		System.out.printf("perimetro: %.2f cm\n", perimetro);		System.out.println();	}	public static void main (String[] args) {		Arquiteto a1 = new Arquiteto ("Oscar Niemeyer", 104);		a1.trabalhe(5, 7, 10);	}}

public class Circulo {	private static double PI = 3.141516;	private double raio;			public Circulo(double raio) { 		this.raio = raio;	}	public double area(){ 		return PI * raio * raio ;	}	public double perimetro (){ 		return 2 * PI * raio;	}}

Fonte: Autores (2021).
• Resolução do exercício
Classe string
As strings, muito utilizadas na programação Java, são uma sequência de caracteres. Todos os tipos de dados utilizados no Java, com exceção dos tipos primitivos (int, double, char e boolean), são objetos. Logo, uma string, contida na biblioteca padrão java.lang, também é um objeto e deve ser declarada e instanciada.
Pratique a criação e manipulação de strings nos exercícios a seguir.
EXERCÍCIO
Criação de strings
1. Crie um projeto com a classe StringDemo, como indicado.
2. Observe as diferentes formas de criar uma string.
3. Execute o projeto e verifique o resultado.
Figura 12 – Exemplos de criação de strings

public class StringDemo {		public static void main(String[] args) {		String ola = "Olá"; // Declara e instancia diretamente				String nome1 = new String("Maria"); // Instancia com new		String nome2 = new String("João");  // Instancia com new				// Declara e instancia com a concatenação de strings 		String saudacao = ola + ", " + nome1 + "!\n\n"; 		System.out.println(saudacao);				// Altera o valor de saudacao pela atribuição do valor de ola		// Não é preciso declarar saudacao novamente 		saudacao = ola;				// Altera o calor de saudacao, que recebe 		// o resultado da concatenacao de mais strings		// É uma alternativa que utiliza o método              // String.concat(String s):		saudacao = saudacao.concat(", " + nome2);		saudacao = saudacao.concat("!\n\n");				//Mais uma alternativa de concatenação		System.out.println(saudacao + "fim");	}}

Fonte: Autores (2021).
EXERCÍCIO
Utilizando métodos da classe string
1. Crie um projeto com a classe StringExemples, como indicado.
2. Observe os exemplos de utilização dos métodos da classe string.
3. Execute o projeto e verifique o resultado.
Figura 13 – Exemplos de utilização de métodos da classe string

public class StringExemples {	public static void main(String[] args) {	   String txt;			   txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	   System.out.println("Comprimeto de [" + txt + "] = " + txt.length());			   txt = "Olá Mundo!";	   System.out.println(txt.toUpperCase());   // Saída = "OLÁ MUNDO!"	   System.out.println(txt.toLowerCase());   // Saída = "olá mundo"			   txt = "Localize a posição da palavra 'eureka' neste texto!";	   System.out.println(txt.indexOf("eureka")); // Saída = 31	}}

Fonte: Autores (2021).
Métodos de string
A Figura 14 apresenta alguns dos métodos da classe string. A lista completa, com exemplos de utilização, pode ser encontrada em ORACLE, 2021 e em W3SCHOOLS, 2021.
Figura 14 – Os métodos da classe java.lang.String.

Fonte: Autores (2021).
Referências
GODOY, V. Programação Orientada a Objetos I. Curitiba: IESDE, 2019.
HORSTMANN, C. S.; CORNELL, G. Core Java – Volume I. 8. ed. São Paulo: Pearson, 2010. 
ORACLE, 2021. Class String. Disponível em:  https://docs.oracle.com/javase/7/docs/api/java/lang/String.html. Acesso em: 20 jan. 2021.
SCHILDT, H. Java para Iniciantes. Porto Alegre: Bookman, 2015.
W3SCHOOLS, 2021. Java String Methods. Disponível em:  https://www.w3schools.com/java/java_ref_string.asp. Acesso em: 20 jan. 2021.
© PUCPR - Todos os direitos reservados.
Créditos | Privacidade e Proteção de Dados

De <https://materiaisonline.pucpr.br/v3/> 

