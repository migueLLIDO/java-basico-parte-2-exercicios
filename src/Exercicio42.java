public class Exercicio42 {
    static int buscarProduto(String[] p,String nome){for(int i=0;i<p.length;i++)if(p[i].equalsIgnoreCase(nome))return i;return -1;} static void exibirRelatorio(String[] p,int[] e){for(int i=0;i<p.length;i++)System.out.println(p[i]+": "+(e[i]<5?"REPOR":"OK"));}
    public static void main(String[] args) {
        String[] produtos={"Arroz","Feijão","Café"};int[] estoque={3,12,0};System.out.println("Feijão no índice "+buscarProduto(produtos,"Feijão"));exibirRelatorio(produtos,estoque);
    }
}
