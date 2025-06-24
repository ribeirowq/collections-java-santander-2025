package main.java.set.Pesquisa;

public class Tarefas {
    private String descricao;
    private boolean concluida;

    public Tarefas(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefas: " + "(" + descricao + ")" +
                " - [" + concluida +  "]";
    }
}
