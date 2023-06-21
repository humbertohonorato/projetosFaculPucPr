package controleDeEstoque;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.UUID;

public class ControleEstoque {
    private ArrayList<Pessoa> pessoas;

    public ControleEstoque() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public String[] leValores (String [] dadosIn){
        String [] dadosOut = new String [dadosIn.length];

        for (int i = 0; i < dadosIn.length; i++)
            dadosOut[i] = JOptionPane.showInputDialog("Entre com "+ dadosIn[i] +": ");

        return dadosOut;
    }
    public Cliente leCliente(){

        String [] valores = new String [3];
        String [] nomeVal = {"Nome", "Documento", "telefone"};
        valores = leValores (nomeVal);

        UUID codigo = UUID.randomUUID();

        Cliente cliente = new Cliente(codigo, valores[0], valores[1], valores[2]);
        return cliente;
    }

    public void salvaPessoas (ArrayList<Pessoa>  pessoas){
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream
                    (new FileOutputStream( "C:\\Users\\humbe\\Documents\\Projetos\\projetosFaculPucPr\\1Semestre\\Fundamentos-POO\\semana8\\controleEstoque.txt"));

            for (int i=0; i < pessoas.size(); i++)
                outputStream.writeObject(pessoas.get(i));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Impossível criar arquivo!");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {  // Fecha arquivo ObjectOutputStream
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private boolean intValido(String s) {
        try {
            Integer.parseInt(s); // Tenta transformar uma string em inteiro
            return true;
        } catch (NumberFormatException e) { // Se não consegue transformar, erro
            return false;
        }
    }

    public int retornaInteiro(String entrada) { // retorna um valor inteiro
        int numInt;

        //Tenta converter o valor de entrada para inteiro, senão permanece no loop
        while (!this.intValido(entrada)) {
            entrada = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um número inteiro.");
        }
        return Integer.parseInt(entrada);
    }

    public void menuControleEstoque (){
        String menu = "";
        String entrada;
        int    opc1, opc2;
        do {
            menu = "Controle Estoque\n" +
                    "Opções:\n" +
                    "1. Adicionar Pessoas\n" +
                    "4. Gravar Pessoas\n" +
                    "9. Sair";

            entrada = JOptionPane.showInputDialog (menu + "\n\n");
            opc1 = this.retornaInteiro(entrada);

            switch (opc1) {
                case 1:// Entrar dados
                    menu = "Entrada de Animais Mamíferos\n" +
                            "Opções:\n" +
                            "1. Cão\n" +
                            "2. Gato\n";

                    entrada = JOptionPane.showInputDialog (menu + "\n\n");
                    opc2 = this.retornaInteiro(entrada);

                    switch (opc2){
                        case 1: pessoas.add((Pessoa) leCliente());
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Entrada NÃO válida!");
                    }

                    break;

                case 4: // Grava Dados
                    if (pessoas.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Entre com mamíferos ... ");
                        break;
                    }
                    salvaPessoas(pessoas);
                    JOptionPane.showMessageDialog(null, "Dados SALVOS com sucesso!");
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Fim do aplicativo PETSTORE");
                    break;
            }
        } while (opc1 != 9);
    }

    public static void main (String [] args){
        ControleEstoque controleEstoque = new ControleEstoque ();
        controleEstoque.menuControleEstoque();
    }
}
