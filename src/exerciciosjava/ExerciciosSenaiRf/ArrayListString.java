package exerciciosjava.ExerciciosSenaiRf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            System.out.print("Palavra "+ (i + 1)+ " - ");
            list.add(sc.nextLine());
        }

        // Lista antes da ordenaçao
        for (String s : list){
            System.out.println(s);

        }

        Collections.sort(list);
        // Lista depois da ordenaçao
        for (String s : list){
            System.out.println(s);
        }
        sc.close();
    }
}
