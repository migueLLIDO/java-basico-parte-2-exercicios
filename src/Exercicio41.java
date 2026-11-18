public class Exercicio41 {
    public static void main(String[] args) {
        double[] vendas={1200,0,5400,-5,2200,800};double total=0,primeira=-1;int n=0;for(double v:vendas){if(v<=0)continue;total+=v;n++;if(v>=5000&&primeira<0)primeira=v;}System.out.println("Primeira >= 5000: "+primeira);System.out.printf("Total %.2f, média %.2f%n",total,total/n);
    }
}
