package Senai.poo.atividades27_02.atividade7;


public class Tarefa {
    private String descricao;
    private boolean concluida; // true = Concluído, false = Pendente

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }


    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }
}

