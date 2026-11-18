public class Exercicio44 {
    public static void main(String[] args) {
        int[] ids={101,102,103,104};int[] minutos={80,310,-3,180};for(int i=0;i<ids.length;i++){if(minutos[i]<0)continue;if(minutos[i]>240){System.out.printf("Chamado %d excedeu SLA: %d minutos%n",ids[i],minutos[i]);break;}}
    }
}
