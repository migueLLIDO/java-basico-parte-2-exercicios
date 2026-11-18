public class Exercicio45 {
    static double calcularTaxa(double valor){return valor*0.02;} static double calcularTaxa(double valor,boolean internacional){return calcularTaxa(valor)+(internacional?15:0);}
    public static void main(String[] args) {
        System.out.printf("Taxa local: %.2f | internacional: %.2f%n",calcularTaxa(200),calcularTaxa(200,true));
    }
}
