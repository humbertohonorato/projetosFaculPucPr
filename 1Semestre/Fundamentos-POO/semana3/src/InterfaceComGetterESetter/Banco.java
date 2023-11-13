package InterfaceComGetterESetter;

public class Banco {

    public static void main(String[] args){
        // Cria objetos da classe conta
        Conta cta1 = new Conta();
        Conta cta2 = new Conta();

        cta1.setDono("Humberto");
        cta1.setSaldo(100);

        cta2.setDono("Karina");
        cta2.setSaldo(200);

        System.out.println("Cta1 - Correntista: " + cta1.getDono());
        System.out.println("Cta1 - Saldo: " + cta1.getSaldo());

        System.out.println("Cta2 - Correntista: " + cta2.getDono());
        System.out.println("Cta2 - Saldo: " + cta2.getSaldo());
    }
}
