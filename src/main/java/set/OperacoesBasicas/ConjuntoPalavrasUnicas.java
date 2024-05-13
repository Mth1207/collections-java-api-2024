package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavraSet.isEmpty()){
            if(palavraSet.contains(palavra)){
                palavraSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada!");
            }
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavraSet.isEmpty()){
            System.out.println(palavraSet);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Java");
        palavrasUnicas.adicionarPalavra("Python");
        palavrasUnicas.adicionarPalavra("JavaScript");
        palavrasUnicas.adicionarPalavra("Python");
        palavrasUnicas.adicionarPalavra("C++");
        palavrasUnicas.adicionarPalavra("Ruby");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("Python");
        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("Swift");

        System.out.println("A linguagem 'Java' está no conjunto? " + palavrasUnicas.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + palavrasUnicas.verificarPalavra("Python"));

        palavrasUnicas.exibirPalavrasUnicas();

    }
}


















