package exerciciosjava.ExerciciosSenaiRf;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.print("Número "+ (i+1)+ " - ");
            //int numeros = sc.nextInt();
            list.add(sc.nextInt());


        }


        for (int num: list){
            if (num == 10 || num == 100|| num == 1000) {
                System.out.println("Parabens! Você foi sorteado. Ganhou um Bonûs de R$50,00 por digitar o numero: "+ num);
            }
        }
    }
}
