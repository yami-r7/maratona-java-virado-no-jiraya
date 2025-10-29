package string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Rafael";
        nome.concat(" Yamí");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Rafael Yamí");
        sb.append(" Souza").append(" da Costa");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
