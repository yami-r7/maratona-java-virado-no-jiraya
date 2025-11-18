package regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Rafael, Érick, Lara, 5714";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
