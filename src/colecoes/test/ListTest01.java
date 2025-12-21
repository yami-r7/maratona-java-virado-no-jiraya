package colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Rafael");
        nomes.add("DevDojo");
        nomes2.add("Yamí");
        nomes2.add("Academy");

        nomes.addAll(nomes2);

        for (Object nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------");
        for (int i=0; i<nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
