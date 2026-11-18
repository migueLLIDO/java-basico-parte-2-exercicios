public class Exercicio46 {
    public static void main(String[] args) {
        String[] tentativas={"","teste","segredo","outra"};for(int i=0;i<Math.min(5,tentativas.length);i++){if(tentativas[i].isBlank())continue;if(tentativas[i].equals("segredo")){System.out.println("Senha correta na tentativa "+(i+1));break;}}
    }
}
