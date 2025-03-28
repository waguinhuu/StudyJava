package exerciciosjava.ExerciciosSenaiRf.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.println("Nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Email: ");
        String emailCliente = sc.nextLine();

        System.out.println("Telefone: ");
        String telefoneCliente = sc.nextLine();

        clientes.add(new Cliente(nomeCliente,emailCliente,telefoneCliente));

        for (Cliente s: clientes){
            System.out.println(s);
        }

    }
}
