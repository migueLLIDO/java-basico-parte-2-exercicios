public class Exercicio49 {
    static int buscaBinaria(int[] v,int alvo,int ini,int fim){if(ini>fim)return -1;int m=ini+(fim-ini)/2;if(v[m]==alvo)return m;return v[m]>alvo?buscaBinaria(v,alvo,ini,m-1):buscaBinaria(v,alvo,m+1,fim);}
    public static void main(String[] args) {
        int[] v={2,5,8,12,16,23,38,56};System.out.println(buscaBinaria(v,23,0,v.length-1));System.out.println(buscaBinaria(v,9,0,v.length-1));
    }
}
