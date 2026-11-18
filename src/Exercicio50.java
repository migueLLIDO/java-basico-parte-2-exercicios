public class Exercicio50 {
    static int buscarProduto(String[] n,String x){for(int i=0;i<n.length;i++)if(n[i].equalsIgnoreCase(x))return i;return -1;} static double calcularSubtotal(double p,int q){return p*q;} static double aplicarDesconto(double t){return t>=100?t*0.9:t;}
    public static void main(String[] args) {
        String[] nomes={"Café","Arroz","Leite"};double[] precos={18,30,7.5};int[] estoque={5,0,20};String[] pedido={"Café","Arroz","Leite"};int[] qtd={2,1,3};double total=0;for(int i=0;i<pedido.length;i++){int p=buscarProduto(nomes,pedido[i]);if(p<0||estoque[p]<=0)continue;total+=calcularSubtotal(precos[p],Math.min(qtd[i],estoque[p]));}System.out.printf("Total antes do desconto: %.2f | final: %.2f%n",total,aplicarDesconto(total));
    }
}
