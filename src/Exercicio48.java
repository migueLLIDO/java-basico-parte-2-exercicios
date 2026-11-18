public class Exercicio48 {
    static int potencia(int b,int e){if(e<0)throw new IllegalArgumentException("expoente deve ser >= 0");return e==0?1:b*potencia(b,e-1);}
    public static void main(String[] args) {
        System.out.println("3^5 = "+potencia(3,5));System.out.println("7^0 = "+potencia(7,0));
    }
}
