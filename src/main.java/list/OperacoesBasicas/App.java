package main.java.list.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();

        cc.adicionarItem("Pão", 2.50, 4);
        cc.adicionarItem("Lápis", 2.00, 3);
        cc.adicionarItem("Lápis", 2.00, 3);
        cc.adicionarItem("Caderno", 30.00, 1);
        cc.adicionarItem("Borracha", 2.00, 2);
        cc.exibirItens();

        // Removendo um item do carrinho
        cc.removerItem("Lápis");

        // Exibir todos os itens
        cc.exibirItens();

        System.out.println("O valor total da compra é = " + cc.calcularValorTotal());
    }
}