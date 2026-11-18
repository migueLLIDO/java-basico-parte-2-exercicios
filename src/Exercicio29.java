public class Exercicio29 {
    static double taxa=0.10; static double calcularComTaxa(double v){return v*(1+taxa);}
    public static void main(String[] args){
        System.out.printf("Total com taxa: %.2f%n",calcularComTaxa(100));
    }
}
