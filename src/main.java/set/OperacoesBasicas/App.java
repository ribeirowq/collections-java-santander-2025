package main.java.set.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();

        cpu.adicionarPalavra("sabor");
        cpu.adicionarPalavra("bolo");
        cpu.adicionarPalavra("pão");
        cpu.adicionarPalavra("leite");
        cpu.adicionarPalavra("mel");

        cpu.exibirPalavrasUnicas();


        cpu.removerPalavra("pão");
        cpu.exibirPalavrasUnicas();
        cpu.verificarPalavra("leite");
    }
}
