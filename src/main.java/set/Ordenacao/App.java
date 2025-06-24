package main.java.set.Ordenacao;

public class App {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("João", 123456L, 7.5);
        gerenciador.adicionarAluno("Maria", 123457L, 9.0);
        gerenciador.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciador.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Alunos no gerenciador:");
        gerenciador.exibirAlunos();
        System.out.println();

        gerenciador.removerAluno(000L);
        gerenciador.removerAluno(123457L);
        gerenciador.exibirAlunos();
        System.out.println();

        gerenciador.exibirAlunosPorNome();
        System.out.println();

        gerenciador.exibirAlunosPorNota();


    }
}
