package Atividade10_prova;

/*
 * Questão 10 prova
 */
public class Main {
    public static void main(String[] args) {
    
        Vetor vetor = new Vetor(6);
        vetor.adicionar(3);
        vetor.adicionar(7);
        vetor.adicionar(1);
        vetor.adicionar(4);
        vetor.adicionar(9);
        vetor.adicionar(2);

        System.out.println("Ordenação Bubble Sort:");
        vetor.bubble_sort();
        vetor.imprimeLista();

        System.out.println("OrdenaçãoSelection Sort:");
        vetor.selection_sort();
        vetor.imprimeLista();

        System.out.println("Ordenação Insertion Sort:");
        vetor.insertion_sort();
        vetor.imprimeLista();
    
    }
}