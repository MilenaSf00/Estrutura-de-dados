package Atividade8;

import java.util.Random;


/*
 * Atividade 8 busca binária
 */
public class Main {
    public static void main(String[] args) {
        int tamanhoVetor = 1000;
        Vetor v = new Vetor(tamanhoVetor);
        Random r = new Random();

       for (int i = 0; i < tamanhoVetor; i++) {
            int numero = r.nextInt(1000); 
            v.adicionar(numero);
        }

        int valor = v.getElementoVetor()[tamanhoVetor - 1];

        
        int indiceIterativo = v.buscaBinariaIterativa(valor);
        long tempoPesquisaIterativa = v.getTempoDeExecucao();

     
        int indiceRecursivo = v.buscaBinariaRecursiva(valor, 0, tamanhoVetor - 1);
        long tempoPesquisaRecursiva = v.getTempoDeExecucao();

        System.out.println("Valor pesquisado: " + valor);
        System.out.println("Tempo de execução da pesquisa iterativa: " + tempoPesquisaIterativa + " ns");

        System.out.println("Valor pesquisado: " + valor);
        System.out.println("Tempo de execução da pesquisa recursiva: " + tempoPesquisaRecursiva + " ns");

    }
}

