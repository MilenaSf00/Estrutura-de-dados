package Marco_2.TrabalhoT2_Atv2;
/*
 * Trabalho T2. Palíndromo
 */
public class Main {
    public static void main(String[] args) {
        PilhaVet pilha = new PilhaVet(5);
        
        pilha.imprimeResultado("ADA");
        pilha.imprimeResultado("ABCD");
        pilha.imprimeResultado("ABCCBA");
        pilha.imprimeResultado("ARARA");
        pilha.imprimeResultado("ana");

        System.out.println("Tamanho do vetor: " + pilha.getTamanhoVetor());
    }
}