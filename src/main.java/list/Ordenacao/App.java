package main.java.list.Ordenacao;

public class App {

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(11);
        numeros.adicionarNumero(542);
        numeros.adicionarNumero(21);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(29);

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordernarDescendente());







    }
}
