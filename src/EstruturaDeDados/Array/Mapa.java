package EstruturaDeDados.Array;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>(Map.of(
                "chave1", "valor1",
                "chave2", "valor2"

        ));
        map.put("chave1", "biscoito");

        System.out.println(map.get("chave1"));

    }
}
