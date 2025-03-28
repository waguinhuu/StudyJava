package exerciciosjava.ExerciciosSenaiRf;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> numeros = new ArrayList<>();

        while (true){
            System.out.println("==== MENU ====");
            System.out.println("1 - CADASTRAR CONTATO");
            System.out.println("2 - LISTAR CONTATO");
            System.out.println("3 - EXCLUIR CONTATO");
            System.out.println("4 - SAIR DO PROGRAMA");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    nomes.add(nome);

                    System.out.print("Número: ");
                    String numero = sc.nextLine();
                    numeros.add(numero);
                    break;

                case 2:
                    System.out.println("LISTA DOS CONTATOS");
                    if(nomes.isEmpty()){
                        System.out.println("Lista Vazia.");
                    }else {
                        for(int i = 0; i < nomes.size(); i++){
                            System.out.println("Nome: " + nomes.get(i)+ "\n Número: " + numeros.get(i) + "\n");
                        }

                    }
                    break;
                case 3:

                    System.out.print("Digite o número do contato a ser excluído: ");
                    String numeroExcluido = sc.nextLine();

                    int index = numeros.indexOf(numeroExcluido);
                    if (index != -1) { // o indice tem que ser a partir de 0
                        System.out.println("Contato " + nomes.get(index) + " removido com sucesso!");
                        nomes.remove(index);
                        numeros.remove(index);
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Digite a opçao correta");
            }

        }
    }
}
