public class Exercicio43 {
    static double calcularMedia(double[] n){double s=0;for(double x:n)s+=x;return s/n.length;} static double maiorNota(double[] n){double m=n[0];for(double x:n)if(x>m)m=x;return m;} static void exibirAprovados(String[] a,double[] n){for(int i=0;i<n.length;i++)if(n[i]>=7)System.out.println(a[i]);}
    public static void main(String[] args) {
        String[] alunos={"Ana","Beto","Caio"};double[] notas={8,6.5,9};System.out.printf("Média %.2f; maior %.1f%n",calcularMedia(notas),maiorNota(notas));exibirAprovados(alunos,notas);
    }
}
