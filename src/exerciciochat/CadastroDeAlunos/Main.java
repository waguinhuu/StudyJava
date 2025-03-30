package exerciciochat.CadastroDeAlunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escola escola = new Escola();

        while (true) {
            System.out.println("===== MENU ====");
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - LISTAR ALUNOS");
            System.out.println("3 - MOSTRAR MEDIA DO ALUNO");
            System.out.println("4 - SAIR");
            System.out.println("DIGITE UMA OPÇÃO");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    escola.cadastrarAluno();
                    break;
                case 2:
                    escola.listarAlunos();
                    break;
                case 3:
                    escola.calcularMediaDoAluno();
                    break;
                case 4:
                    System.out.println("SAINDO...");
                    return;
                default:
                    System.out.println("Opçao invalida");
            }
        }


    }
}
