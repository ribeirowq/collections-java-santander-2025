package main.java.set.Pesquisa;

public class App {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();
        System.out.println();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.removerTarefa("Estudar Java");
        listaTarefas.removerTarefa("Preparar apresentação");
        listaTarefas.exibirTarefas();
        System.out.println();

        // Contando o número de tarefas na lista
        System.out.print("Numero de tarefas: ");
        listaTarefas.contarTarefas();
        System.out.println();

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println();

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println();

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Ler livro");
        listaTarefas.exibirTarefas();
        System.out.println();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
