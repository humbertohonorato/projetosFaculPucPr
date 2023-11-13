package funcionario;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Concursado(4000, 5)); //João
        funcionarios.add(new Temporario(2000, 12)); //José
        funcionarios.add(new Concursado(2400, 34)); //Maria
        funcionarios.add(new Temporario(1200, 10)); //Pedro

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Salario: " + funcionario.getSalario());
        }
    }
}