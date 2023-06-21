package BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopiarCaracter {
    public static void EscreverCaracteres(){
        FileWriter out = null;
        int contLetra = 0;
        String texto = "Texto para gravar no arq.\nOutro texto para gravar no arq.";
        try {
            out = new FileWriter("C:\\Users\\humbe\\Documents\\Projetos\\projetosFaculPucPr\\1Semestre\\Fundamentos-POO\\semana8\\arqChar1.txt"); //caminho absoluto arq
            while (contLetra < texto.length()){
                out.write(texto.charAt(contLetra));// escreve caractere a caractere
                contLetra++;
            }
            out.close(); // fecha arquivo de saída
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void LerCaracteres() {
        FileReader in = null;
        try {
            in = new FileReader("C:\\Users\\humbe\\Documents\\Projetos\\projetosFaculPucPr\\1Semestre\\Fundamentos-POO\\semana8\\arqChar1.txt");
            int c;
            while ((c = in.read()) != -1) // escreve caractere a caractere; -1 = EOF
                System.out.print((char)c);// imprime como caractere
            in.close(); // fecha arquivo de entrada
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void CopiarLinha(){
        BufferedReader in  = null; // bufferiza (acumula) para leitura cjto de chars
        PrintWriter    out = null; // bufferiza (acumula) para escrita cjto de chars
        String linha;
        try {// BufferedReader / PrintWriter  são usados em conjunto com
            //  FileReader e FileWriter, respectivamente (acumulam caracteres lidos)
            in   = new BufferedReader(new FileReader("C:\\Users\\humbe\\Documents\\Projetos\\projetosFaculPucPr\\1Semestre\\Fundamentos-POO\\semana8\\arqChar1.txt"));
            out  = new PrintWriter   (new FileWriter("C:\\Users\\humbe\\Documents\\Projetos\\projetosFaculPucPr\\1Semestre\\Fundamentos-POO\\semana8\\arqCharLinha2.txt"));
            while ((linha = in.readLine()) != null) {
                out.println(linha);
                System.out.println(linha);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("\nEscrita---------------");
        EscreverCaracteres();
        System.out.println("\nLeitura---------------");
        LerCaracteres();
        System.out.println("\nCopia---------------");
        CopiarLinha();
    }
}