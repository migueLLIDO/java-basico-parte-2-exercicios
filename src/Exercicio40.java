public class Exercicio40 {
    static double total(double[] v){double s=0;for(double x:v)s+=x;return s;} static double media(double[] v){return total(v)/v.length;}
    static void acimaMedia(String[] nomes,double[] vendas){double m=media(vendas);for(int i=0;i<vendas.length;i++)if(vendas[i]>m)System.out.printf("%s: %.2f%n",nomes[i],vendas[i]);}
    public static void main(String[] args){String[] nomes={"Ana","Beto","Caio","Duda"};double[] vendas={1200,900,1800,1100};System.out.printf("Total %.2f | média %.2f%n",total(vendas),media(vendas));acimaMedia(nomes,vendas);}
}
