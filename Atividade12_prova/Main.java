package Atividade12_prova;
/*
 * Questão 12 prova
 */
public class Main {
    public static void main(String[] args) {
        Recursivo recursivo = new Recursivo();

        int m = 33;
        int n = 54;
        
        /*
        testei com numeros aleatorios
        Random random = new Random();
        int m = random.nextInt(100) + 1;
        int n = random.nextInt(100) + 1;
        */
        int resultado = recursivo.metodoRecursivo(m, n);
        System.out.println("O somatório de " + m + " até " + n + " é: " + resultado);



    }
}
