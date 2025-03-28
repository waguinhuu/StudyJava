package teste_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Usuario {
    private String nome;
    private int idade;


    public void mostrarUsuario(){
        System.out.println("Nome: "+ getNome());
    }
}
