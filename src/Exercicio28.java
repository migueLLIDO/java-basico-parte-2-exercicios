public class Exercicio28 {
    static int maiorValor(int[] v){int m=v[0];for(int n:v)if(n>m)m=n;return m;}
    public static void main(String[] args){
        System.out.println(maiorValor(new int[]{5,18,2,11}));
    }
}
