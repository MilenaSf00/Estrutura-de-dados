package Atividade9;

import java.util.Random;


/*
 * Atividade 9 ordenação básica
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

      
        long tempoInicioBubble = System.nanoTime();
        v.bubble_sort();
        long tempoFimBubble = System.nanoTime();
        long tempoExecucaoBubble = tempoFimBubble - tempoInicioBubble;

      
        System.out.println("Tempo de execução do bubble_sort: " + tempoExecucaoBubble + " ns");

      
        long tempoInicioSelection = System.nanoTime();
        v.selection_sort();
        long tempoFimSelection = System.nanoTime();
        long tempoExecucaoSelection = tempoFimSelection - tempoInicioSelection;

        System.out.println("Tempo de execução do selection_sort: " + tempoExecucaoSelection + " ns");
       
        long tempoInicioInsertion = System.nanoTime();
        v.insertion_sort();
        long tempoFimInsertion = System.nanoTime();
        long tempoExecucaoInsertion = tempoFimInsertion - tempoInicioInsertion;

        System.out.println("Tempo de execução do insertion_sort: " + tempoExecucaoInsertion + " ns");
        
         int[] elementos = v.getElementos();
         System.out.println("Elementos do vetor:");
         for (int elemento : elementos) {
             System.out.println(elemento);
         }
        
    }
}

