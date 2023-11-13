Encapsulamento
Verifique a sua compreensão em relação à criação e utilização de objetos que utilizam encapsulamento – detalhes apresentados na Figura 7 a seguir.

Crie um projeto com as classes A e B no pacote P1, conforme indicado.
Observe que não são declarados modificadores de acesso. Logo, o modificador é default (padrão vazio).
Observe que o atributo A.k não tem valor declarado e, nesse caso, seu valor default é zero.
Observe que o método A.g() apenas apresenta o valor de A.k na tela.
Observe que a classe B tem acesso aos membros da classe A, pois o modificador dos seus membros é o default e ambas as classes estão no mesmo pacote P1.
Observe que o método B.f() consegue alterar o atributo A.k – tem permissão de acesso, pois o modificador de A.k é o default.
Verifique as questões a seguir no seu ambiente de desenvolvimento (IDE) e responda:
É possível usar o modificador private antes da palavra-chave class, tanto na classe A quanto na classe B? O que acontece?
É possível usar o modificador private nos métodos A.g () e B.f ()? Justifique.
É possível usar o modificador protected nos métodos A.g () e B.f ()? Justifique.

RESOLUÇÃO

Não é possível. Gera erro de compilação, pois a classe precisa ser pública ou default (vazio).
O método A.g () não pode ter modificador private porque ele é utilizado nos objetos da classe B . O método B.f () poderia ter modificador private porque apenas é utilizado dentro da própria classe B.
Poderíamos utilizar o modificador protected em ambos os métodos A.g () e B.f (), pois são classes que estão no mesmo pacote e, com esse modificador, os métodos estariam acessíveis entre as classes.



Fixação do conceito de encapsulamento
Crie um projeto com as classes arquiteto e circulo, no mesmo pacote default, como indicado.
Execute o projeto a partir da classe Arquiteto.
Observe o uso dos modificadores public e private.
Observe as diferentes formas de instanciar a classe circulo.
Remova os modificadores public dos membros da classe circulo e repita o teste. Por que ainda funciona?
Crie um projeto com dois pacotes, denominados especialista e matemática, contendo, respectivamente, as classes arquiteto e circulo.
Será necessário incluir os comandos package e import.
Quais métodos e/ou atributos de que classe precisam mudar para visibilidade public?

RESOLUÇÃO

5. Porque um atributo ou método default (identificados pela ausência de modificador) pode ser acessado por objetos de todas as classes que estiverem no mesmo pacote que a classe que possui o atributo ou o método. Nesse exemplo, arquiteto e circulo estão no mesmo pacote.

6.Respostas

a. Classe arquiteto:

                package Especialista;

                import Matematica.Circulo;

Classe circulo:

                package Matematica;

b. Métodos da classe círculo, que está no package Matematica, devem todos ser públicos, para serem acessados pelo objeto de Arquiteto, que está no package Especialista.