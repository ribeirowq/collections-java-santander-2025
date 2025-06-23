package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> list;
    private static final List<Integer> ascendente = new ArrayList<>();

    public OrdenacaoNumeros() {
        this.list = new ArrayList<>();
    }


    public void adicionarNumero(int numero){
        list.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ascendente = new ArrayList<>(this.list);
        if (!list.isEmpty()) {
            Collections.sort(ascendente);
            return ascendente;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordernarDescendente() {
        List<Integer> ascendente = new ArrayList<>(this.list);
        if (!list.isEmpty()) {
            ascendente.sort(Collections.reverseOrder());
            return ascendente;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
