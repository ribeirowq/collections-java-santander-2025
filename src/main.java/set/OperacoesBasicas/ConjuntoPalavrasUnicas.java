package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;


    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
       return palavrasUnicas.contains(palavra.trim().toLowerCase());
    }


    public void exibirPalavrasUnicas() {
        System.out.println(this.palavrasUnicas);
    }
}
