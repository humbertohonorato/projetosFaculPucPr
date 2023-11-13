package atividadeSomativa1PraticandoInteracaoEntreObjetos;

public class A {
//    public  int a;
//    protected int b;
//    protected int c;
//
//    protected void calcula(){
//        c=a+b;
//    }
//
//    public void imprime(){
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }

    private int exp1;
    private int exp2;
    protected void calcular1(int x){
        this.exp1  = x+8*3+2-18/3+3*2;
    }
    protected void calcular2(int x){
        this.exp2 = x+8*(3+2)-18/(3+3)*2;
    }
    public static void main (String[]args){
        A a = new A();
        a.calcular1(0);
        a.calcular2(4);
        System.out.println(a.exp1);
        System.out.println(a.exp2);
    }
}
