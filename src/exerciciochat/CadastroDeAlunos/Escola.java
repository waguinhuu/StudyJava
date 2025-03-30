package exerciciochat.CadastroDeAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    Scanner sc = new Scanner(System.in);
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno() {
        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = sc.nextInt();

        System.out.println("Digite a nota final do aluno:");
        double notaFinal = sc.nextDouble();

        alunos.add(new Aluno(nome, idade, notaFinal));
    }

    public void listarAlunos() {
        if(alunos.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Lista de alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void calcularMediaDoAluno(){
        if(alunos.isEmpty()){
            System.out.println("Lista vazia");
        }else {
            sc.nextLine();
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            for (Aluno aluno : alunos) {
                if (aluno.getNome().equalsIgnoreCase(nome)){
                    double media = aluno.getNotaFinal() / 3;
                    System.out.println("Media do aluno " + aluno.getNome() + ": " + media);
                }else {
                    System.out.println("Aluno não existe na lista.");
                }
            }
        }

    }
}
