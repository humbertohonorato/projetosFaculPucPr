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