public class Exercicio38 {
    static long fatorial(int n){if(n<0)throw new IllegalArgumentException("n deve ser >= 0");return n<=1?1:n*fatorial(n-1);}
    public static void main(String[] args){for(int n:new int[]{0,1,5})System.out.println(n+"! = "+fatorial(n));}
}
