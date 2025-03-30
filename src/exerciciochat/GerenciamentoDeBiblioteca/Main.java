package exerciciochat.GerenciamentoDeBiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true){
            System.out.println("==== MENU ====");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Exibir Livros");
            System.out.println("3 - Excluir Livro");
            System.out.println("4 - Buscar Livro");
            System.out.println("5 - Sair");
            System.out.println("Digite a opcao desejada: ");
            int op = sc.nextInt();

            switch (op){
                case 1:
                    biblioteca.adicionarLivro();
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    biblioteca.removerLivro();
                    break;

                case 4:
                    biblioteca.buscarLivro();
                    break;
                case 5:
                    System.out.println("SAINDO...");
                    return;
                default:
                    System.out.println("Opcao invalida");

            }


        }

    }
}
