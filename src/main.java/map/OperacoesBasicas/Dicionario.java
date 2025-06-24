package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
   private Map<String, String> map;

    public Dicionario() {
        this.map = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        map.put(palavra, definicao);
    }


    public void removerPalavra(String palavra){
        if(!map.isEmpty()) {
            map.remove(palavra);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirPalavras(){
        if(!map.isEmpty()) {
            System.out.println(map);
        } else {
        System.out.println("O conjunto está vazio!");
    }
    }

    public void pesquisarPorPalavra(String palavra){
        if(!map.isEmpty()){
            if (map.containsKey(palavra)){
                System.out.println(map.get(palavra));
            } else {
                System.out.println("A palavra não está no dicionário");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }

    }
}
