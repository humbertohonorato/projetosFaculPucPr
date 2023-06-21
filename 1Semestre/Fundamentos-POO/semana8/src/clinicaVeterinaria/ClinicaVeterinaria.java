package clinicaVeterinaria;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class ClinicaVeterinaria {
    private static final String FILE_PATH = "C:\\Users\\humbe\\Documents\\Projetos\\projetosFaculPucPr\\1Semestre\\Fundamentos-POO\\semana8\\ClinicaVeterinaria.dados";
    private ArrayList<Animal> animais;

    public ClinicaVeterinaria() {
        this.animais = new ArrayList<Animal>();
    }

    private String[] leValores(String[] dadosIn) {
        String[] dadosOut = new String[dadosIn.length];

        for (int i = 0; i < dadosIn.length; i++) {
            dadosOut[i] = JOptionPane.showInputDialog("Entre com " + dadosIn[i] + ": ");
        }

        return dadosOut;
    }

    public Cavalo leCavalo() {
        String[] valores = leValores(new String[]{"Nome", "Dono", "Adestrado"});

        boolean adestrado = retornaBoolean(valores[2]);

        Cavalo cavalo = new Cavalo(valores[0], valores[1], adestrado);
        return cavalo;
    }

    public Cachorro leCachorro() {
        String[] valores = leValores(new String[]{"Nome", "Dono", "Bravo", "Raça"});

        boolean bravo = retornaBoolean(valores[2]);

        Cachorro cachorro = new Cachorro(valores[0], valores[1], bravo, valores[3]);
        return cachorro;
    }

    public Passaro lePassaro() {
        String[] valores = leValores(new String[]{"Nome", "Dono","Canta", "Cor"});

        boolean canta = retornaBoolean(valores[2]);

        Passaro passaro = new Passaro(valores[0], valores[1], canta, valores[3]);
        return passaro;
    }

    private boolean retornaBoolean(String entrada) {
        return entrada.equalsIgnoreCase("sim") || entrada.equalsIgnoreCase("s");
    }


    private boolean intValido(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int retornaInteiro(String entrada) {
        int numInt;

        while (!intValido(entrada)) {
            entrada = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um número inteiro.");
        }
        return Integer.parseInt(entrada);
    }

    public void salvaAnimais(ArrayList<Animal> animais) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (int i = 0; i < animais.size(); i++) {
                outputStream.writeObject(animais.get(i));
            }
            JOptionPane.showMessageDialog(null, "Dados SALVOS com sucesso!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados.");
            ex.printStackTrace();
        }
    }

    public ArrayList<Animal> recuperaAnimais() {
        ArrayList<Animal> animaisTemp = new ArrayList<Animal>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object obj;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Animal) {
                    animaisTemp.add((Animal) obj);
                }
            }
            JOptionPane.showMessageDialog(null, "Dados RECUPERADOS com sucesso!");
        } catch (EOFException ex) {
            System.out.println("Fim de arquivo.");
        } catch (ClassNotFoundException | FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo com animais NÃO existe!");
            ex.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar os dados.");
            ex.printStackTrace();
        }

        return animaisTemp;
    }

    public void menuClinicaVeterinaria() {
        String menu = "";
        String entrada;
        int opc1, opc2;
        do {
            menu = "Controle Clinica Veterinaria\n" +
                    "Opções:\n" +
                    "1. Entrar Animais\n" +
                    "2. Exibir Animais\n" +
                    "3. Limpar Animais\n" +
                    "4. Gravar Animais\n" +
                    "5. Recuperar Animais\n" +
                    "9. Sair";

            entrada = JOptionPane.showInputDialog(menu + "\n\n");
            opc1 = retornaInteiro(entrada);

            switch (opc1) {
                case 1: // Entrar dados
                    menu = "Entrada de Animais \n" +
                            "Opções:\n" +
                            "1. Cavalo\n" +
                            "2. Cachorro\n" +
                            "3. Passaro\n";

                    entrada = JOptionPane.showInputDialog(menu + "\n\n");
                    opc2 = retornaInteiro(entrada);

                    switch (opc2) {
                        case 1:
                            animais.add(leCavalo());
                            break;
                        case 2:
                            animais.add(leCachorro());
                            break;
                        case 3:
                            animais.add(lePassaro());
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Entrada NÃO válida!");
                    }
                    break;
                case 2: // Exibir dados
                    if (animais.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Entre com animais ...");
                    } else {
                        StringBuilder dados = new StringBuilder();
                        for (Animal animal : animais) {
                            dados.append(animal.toString()).append("---------------\n");
                        }
                        JOptionPane.showMessageDialog(null, dados.toString());
                    }
                    break;
                case 3: // Limpar Dados
                    if (animais.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Entre com animais ...");
                    } else {
                        animais.clear();
                        JOptionPane.showMessageDialog(null, "Dados LIMPOS com sucesso!");
                    }
                    break;
                case 4: // Grava Dados
                    if (animais.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Entre com animais ... ");
                    } else {
                        salvaAnimais(animais);
                    }
                    break;
                case 5: // Recupera Dados
                    animais = recuperaAnimais();
                    if (animais.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Sem dados para apresentar.");
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim do aplicativo Clinica veterinaria");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opc1 != 9);
    }

    public static void main(String[] args) {
        ClinicaVeterinaria clinicaVeterinaria = new ClinicaVeterinaria();
        clinicaVeterinaria.menuClinicaVeterinaria();
    }
}
