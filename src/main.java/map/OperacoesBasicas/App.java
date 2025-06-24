package main.java.map.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
        dicionario.exibirPalavras();
        System.out.println();

        // Pesquisar palavras
        dicionario.pesquisarPorPalavra("java");
        System.out.println();


        dicionario.pesquisarPorPalavra("csharp");
        System.out.println();


        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
