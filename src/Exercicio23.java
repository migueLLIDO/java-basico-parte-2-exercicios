public class Exercicio23 {
    static double calcularSubtotal(double preco,int quantidade){return preco*quantidade;}
    public static void main(String[] args){
        System.out.printf("Subtotal: R$ %.2f%n",calcularSubtotal(29.9,3));
    }
}
