package fluxoDeBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte {
    public static void EscreverDados()  // escreve bytes para um arquivo
    {
        FileOutputStream arq; // referência para arquivo de saída
        try {
            arq = new FileOutputStream("arq1.txt"); // arquivo na pasta local
            //Do caractere A (código 65) ao Z (código 90)
            for(int cont = 65; cont < 91; cont++) {
                arq.write(cont); // Escreve Byte (8bits) em arquivo
                System.out.print((char)cont); // imprime o código como char
            }
            arq.close();         // fecha arquivo de escrita
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void LerDados(){  // lê bytes de um arquivo
        FileInputStream arq; // referência para arquivo de entrada
        int letra = 0;
        try {
            arq = new FileInputStream ("arq1.txt"); // arquivo na pasta local
            while(letra != -1){     // -1 é o  código para fim de arquivo
                letra = arq.read(); // Lê Byte (8bits) de arquivo
                if (letra != -1)    // Se não fim de arquivo,
                    System.out.print((char)letra); // imprime como char
            }
            arq.close();            // fecha arquivo de leitura
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void CopiarDados() { //copia um arq para outro, byte a byte
        FileInputStream  in  = null;
        FileOutputStream out = null;

        try {
            in  = new FileInputStream("arq1.txt");
            out = new FileOutputStream("arq2.txt");
            int c;
            while ((c = in.read()) != -1) { // lê byte de arq1.txt
                out.write(c);               // escreve byte para arq2.txt
                System.out.print((char)c);  // imprime como char
            }
            in.close();    // fecha arquivo de leitura
            out.close();   // fecha arquivo de escrita
        }catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado.");
        }catch(IOException e) {
            System.out.println("Arquivo nao encontrado.");
        }
    }
    public static void main(String[] args) 	{
        System.out.println("\n\nEscrita---------------");
        EscreverDados();
        System.out.println("\n\nLeitura---------------");
        LerDados();
        System.out.println("\n\nCopia---------------");
        CopiarDados();
    }
}