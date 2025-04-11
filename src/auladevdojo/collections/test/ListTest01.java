package auladevdojo.collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Wagner");
        nomes.add("Silva");
        nomes2.add("Suane");
        nomes2.add("Maria");
        nomes.addAll(nomes2);

        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-----------");
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
