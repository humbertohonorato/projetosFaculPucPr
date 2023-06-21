package interfaceGrafica;

import javax.swing.JOptionPane;  // Biblioteca da classe JOptionPane

public class MinhaInterface {
    private boolean numeroInteiroValido(String s) {
        boolean resultado;
        try {
            Integer.parseInt(s); // Tenta transformar uma string em inteiro
            resultado = true;
        } catch (NumberFormatException e) { // Gera erro se não consegue
            resultado = false;
        }
        return resultado;
    }
    public int inteiroValido(String nomeVar) { // retorna um valor inteiro
        int numInt;
        String entrada;

        entrada = JOptionPane.showInputDialog (null, "Entre com um número inteiro " + nomeVar + ":\n\n");

        // Loop para garantir um inteiro válido
        while (!this.numeroInteiroValido(entrada)) {
            entrada = JOptionPane.showInputDialog(null, "Valor de " + nomeVar + "incorreto!\n\nDigite um número inteiro.");
        }
        return new Integer(entrada);
    }
    public static void main(String[] args) {
        MinhaInterface painel = new MinhaInterface();
        String nome, entrada;
        int x, y;

        nome = JOptionPane.showInputDialog ("Entre com o seu nome: ");
        JOptionPane.showMessageDialog(null,"Olá " + nome + "! Bem-vindo(a)!");
        JOptionPane.showMessageDialog(null,"Vamos fazer uma soma rápida, ok?");
        x = painel.inteiroValido("x");
        y = painel.inteiroValido("y");
        JOptionPane.showMessageDialog(null," x + y = " + x+" + "+ y+ " = " + (x+y));
        JOptionPane.showMessageDialog(null,"Até mais " + nome + "! \n\nFIM");
    }
}