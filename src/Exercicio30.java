public class Exercicio30 {
    static void contar(int n){if(n==0)return;System.out.println(n);contar(n-1);}
    public static void main(String[] args){
        System.out.println("Contagem recursiva:");contar(5);System.out.println("Fim");
    }
}
