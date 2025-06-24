package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemMap.isEmpty()){
            if (contagemMap.containsKey(palavra)){
                contagemMap.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if (!contagemMap.isEmpty()){
            for (int contagem : contagemMap.values()){
                contagemTotal += contagem;
            }
            return contagemTotal;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrenquente = null;
        int maiorContagem = 0;
        if (!contagemMap.isEmpty()){
            for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrenquente = entry.getKey();
                }
            }
            return palavraMaisFrenquente;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
}
