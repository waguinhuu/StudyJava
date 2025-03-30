package exerciciochat.GerenciamentoDeBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner sc = new Scanner(System.in);
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(){
        System.out.println("Titulo: ");
        String tituloLivro = sc.nextLine();

        System.out.println("Autor: ");
        String autorLivro = sc.nextLine();

        System.out.println("Ano do publicação: ");
        int anoPublicacaoLivro = sc.nextInt();
        sc.nextLine();

        livros.add(new Livro(tituloLivro,autorLivro,anoPublicacaoLivro));
    }

    public void listarLivros(){
        if(livros.isEmpty()){
            System.out.println("Lista vazia.");
        }else {

        }
        for(Livro livro: livros){
            System.out.println(livro);
        }
    }

    public void buscarLivro(){
        if(livros.isEmpty()){
            System.out.println("Lista vazia.");
        }else {
            System.out.println("Digite o titulo do livro");
            String tituloDoLivro = sc.nextLine();

            for (Livro livro: livros){
                if (livro.getTitulo().equalsIgnoreCase(tituloDoLivro)){
                    System.out.println(livro);
                }else {
                    System.out.println("Livro não existe na lista");
                }
            }
        }

    }

    public void removerLivro(){
        System.out.println("Digite o titulo do livro");
        String livroRemovido = sc.nextLine();

        boolean removido = livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(livroRemovido));

        if (removido){
            System.out.println("Livro removido com sucesso!");
        }else {
            System.out.println("Livro nao existe na lista");
        }

//        for (int i = 0; i < livros.size(); i++){
//            Livro livro = livros.get(i);
//            if (livro.getTitulo().equalsIgnoreCase(livroRemovido)){
//                livros.remove(i);
//                System.out.println("Livro removido com sucesso!");
//            }else {
//                System.out.println("Livro nao existe na lista");
//            }
//        }
    }
}
