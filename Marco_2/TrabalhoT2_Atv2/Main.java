package Marco_2.TrabalhoT2_Atv2;
/*
 * Trabalho T2. Palíndromo
 */
public class Main {
    public static void main(String[] args) {
        PilhaVet pilha = new PilhaVet(5);
        
        pilha.printResultado("ADA");
        pilha.printResultado("ABCD");
        pilha.printResultado("ABCCBA");
        pilha.printResultado("ARARA");
        pilha.printResultado("ana");

        System.out.println("Tamanho do vetor: " + pilha.getTamanhoVetor());
    }
}