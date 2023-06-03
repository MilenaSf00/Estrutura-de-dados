package Atividade12_prova;







public class Recursivo {
    public int metodoRecursivo(int m, int n){
        if (m == n) {
            return m;
        } else {
            if (m > n) {
                int temp = m;
                m = n;
                n = temp;
            }
            return m + metodoRecursivo(m + 1, n);
        }
    }
}