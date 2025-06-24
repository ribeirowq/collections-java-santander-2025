package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Date;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private double nota;


    public Aluno(String nome, Long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public String toString() {
        return String.format("Aluno (%s," +
                " matricula: %d," +
                " media = %.2f)",
                nome, matricula, nota);
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
