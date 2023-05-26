package Atividade1_prova;
/*
 * Questão 1 
 */
public class Main {
    public static void main(String[] args) {
        Vetor vetor1 = new Vetor(5);
        vetor1.adicionar(1);
        vetor1.adicionar(2);
        vetor1.adicionar(3);
        vetor1.adicionar(4);
        vetor1.adicionar(5);

        Vetor vetor2 = new Vetor(5);
        vetor2.adicionar(4);
        vetor2.adicionar(5);
        vetor2.adicionar(6);
        vetor2.adicionar(7);
        vetor2.adicionar(2);
        
        vetor1.imprimeLista();
        vetor2.imprimeLista();
        
        Vetor intersecao = vetor1.EncontrarIntersecao(vetor1, vetor2);
        intersecao.imprimeLista();
    }
}