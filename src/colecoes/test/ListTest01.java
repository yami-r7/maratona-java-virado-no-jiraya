package colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(16);
        nomes.add("Rafael");
        nomes.add("DevDojo Academy");

        for (Object nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Yamí");

        System.out.println("-------------");
        for (int i=0; i<nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
