package Atividade7;

import java.util.Random;


/*
 * Atividade 7 recursividade
 */
public class Main {
    public static void main(String[] args) {
        int tamanhoVetor = 1000;
        Vetor v = new Vetor(tamanhoVetor);
        Random r = new Random();
        
        for(int i = 0; i < tamanhoVetor; i++){

           v.adicionar(r.nextInt(1000));
        }

        int maiorRecursivo = v.encontrarMaiorElementoRecursivo(0, v.tamanho() - 1);
        long tempoExecucaoRecursivo = v.getTempoDeExecucao();

        int maiorIterativo = v.encontrarMaiorElementoIterativo(0, v.tamanho() - 1);
        long tempoExecucaoIterativo = v.getTempoDeExecucao();

        System.out.println("Encontrando o maior elemento recursivo:" + maiorRecursivo);
        System.out.println("Tempo de execução do método recursivo: " + tempoExecucaoRecursivo + "ns");

        System.out.println("Encontrando o maior elemento iteartivo:" + maiorIterativo);
        System.out.println("Tempo de execução do método iterativo: " + tempoExecucaoIterativo + "ns");
    }

}
