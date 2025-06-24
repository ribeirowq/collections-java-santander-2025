package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefas> setTarefas;

    public ListaTarefas() {
        this.setTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        setTarefas.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!setTarefas.isEmpty()) {
            for (Tarefas t : setTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    setTarefas.remove(t);
                    break;
                }
            }
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirTarefas() {
        if(!setTarefas.isEmpty()) {
            System.out.println(setTarefas);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void contarTarefas() {
        System.out.println(setTarefas.size());
    }

    public Set<Tarefas> obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        if (!setTarefas.isEmpty()) {
            for (Tarefas t : setTarefas) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Set<Tarefas> obterTarefasPendentes() {
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        if (!setTarefas.isEmpty()) {
            for (Tarefas t : setTarefas) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!setTarefas.isEmpty()) {
            for (Tarefas t : setTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!setTarefas.isEmpty()) {
            for (Tarefas t : setTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void limparListaTarefas() {
        Set<Tarefas> limparTarefas = new HashSet<>(this.setTarefas);
        if (!setTarefas.isEmpty()) {
            setTarefas.removeAll(limparTarefas);
            System.out.println("Sua lista foi limpa!");
        }else {
            System.out.println("A lista ja está vazia!");
        }
    }
}