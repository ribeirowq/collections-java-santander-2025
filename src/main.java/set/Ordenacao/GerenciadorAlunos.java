package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;


    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }


    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        if (!alunoSet.isEmpty()){
            for (Aluno a : alunoSet){
                if(a.getMatricula() == matricula){
                    alunoSet.remove(a);
                    break;
                }
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()){
            System.out.println(alunosPorNota);
        }  else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunos(){
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
