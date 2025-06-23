package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaDeRemovidos = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    listaDeRemovidos.add(i);
                }
            }
            itemList.removeAll(listaDeRemovidos);
        } else{
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        if (!itemList.isEmpty()){
            for (Item i : itemList){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirItens(){
        System.out.println("Items da lista: " + itemList.size());
    }

}
