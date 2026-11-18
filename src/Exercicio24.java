public class Exercicio24 {
    static double calcularDesconto(double total,double percentual){return total*percentual/100;}
    public static void main(String[] args){
        System.out.printf("Desconto: R$ %.2f%n",calcularDesconto(500,10));
    }
}
