package Senai.TratamentoDeExcecoes.Atividades.CadastroDeContas;

import Senai.TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.ContaExistenteException;
import Senai.TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.ContaInexistenteException;
import Senai.TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.DadoInvalidoException;
import Senai.TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.RepositoriosFullException;

public class MainTeste {
    public static void main(String[] args) {

        try {
            CadastroDeConta c1 = new CadastroDeConta();
            // Cadastrando contas
            c1.inserirConta(new Conta("11","Wagner", 3900));
            c1.inserirConta(new Conta("33","Fernanda", 39500));


            // Cadastrando conta já cadastrada
            c1.inserirConta(new Conta("33","Fernanda", 39500));

            // Buscando conta cadastrada
            c1.buscarConta("33");

            // Buscando conta não cadastrada
            c1.buscarConta("88");

            c1.removerConta("11");

            // Buscando conta removida
            c1.buscarConta("11");



        }catch (ContaExistenteException e){
            System.out.println(e.getMessage());

        }catch (ContaInexistenteException e){
            System.out.println(e.getMessage());

        }catch (RepositoriosFullException e){
            System.out.println(e.getMessage());

        }catch (DadoInvalidoException e){
            System.out.println(e.getMessage());

        }
    }
}
