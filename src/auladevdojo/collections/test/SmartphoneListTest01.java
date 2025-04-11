package auladevdojo.collections.test;

import auladevdojo.collections.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("11111", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s3);
        smartphones.add(s2);


        for(Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "Pixel");
        int indexSmartphone4 = smartphones.indexOf(s4);
        smartphones.indexOf(indexSmartphone4);

    }
}
