package Atividade3_prova;
/*
 * Questão 3 prova
 */
 public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println("Resultado Fibonacci Recursivo:" + f.fiboRec(5));
        System.out.println("Resultado Fibonacci Iterativo:" + f.fiboIterativo(10));
    }
}