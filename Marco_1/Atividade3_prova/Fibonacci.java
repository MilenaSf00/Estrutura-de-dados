package Atividade3_prova;

public class Fibonacci {
    public int fiboRec(int n) {
        if (n < 2) {
            return n;
        } else {
            return fiboRec(n - 1) + fiboRec(n - 2);
        }
    }
    // Fibonacci iterativa
    public int fiboIterativo(int n) {
        int i = 1;
        int f = 0;
        for (int k = 1; k <= n; k++) {
            int temp = f;
            f = i + f;
            i = temp;
        }
        return f;
    }
}
