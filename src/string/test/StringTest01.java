package string.test;

import java.sql.SQLOutput;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; //String constant pool
        String nome2 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); //1. Variável de referência, 2. Objeto do tipo String, 3. Uma String no pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
