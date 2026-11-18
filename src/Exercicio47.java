public class Exercicio47 {
    static double calcularFrete(double km){return 10+km*1.5;}
    public static void main(String[] args) {
        String[] bairros={"Centro","Norte","Sul"};double[] km={5,18,12};double maior=-1;String rota="";for(int i=0;i<bairros.length;i++){if(km[i]<=0)continue;System.out.printf("%s: R$ %.2f%n",bairros[i],calcularFrete(km[i]));if(km[i]>maior){maior=km[i];rota=bairros[i];}}System.out.println("Rota mais distante: "+rota);
    }
}
