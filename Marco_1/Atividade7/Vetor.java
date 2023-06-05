package Atividade7;

public class Vetor {
    private int[] elementoVetor;
    private int tamanho;
    private int posicao = 0;
    private long tempoDeExecucao;

    public Vetor(int tamanho) {
        this.elementoVetor = new int[tamanho];
        this.tamanho = 0;
    }

    public int[] getElementoVetor() {
        return elementoVetor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setElementoVetor(int[] elementoVetor) {
        this.elementoVetor = elementoVetor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public long getTempoDeExecucao() {
        return tempoDeExecucao;
    }

    public void adicionar(int numero){
        this.elementoVetor[posicao] = numero;
        posicao ++; 
    }
    public int tamanho(){
        return this.posicao;
    }

    public boolean ExisteNumero(int numero){
        for(int i = 0; i< this.posicao;i++){
            if (this.elementoVetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    /*
     * Encontra o maior elemento de forma recursiva no vetor
     */
    public int encontrarMaiorElementoRecursivo(int inicio, int fim) {
        long tempoDeExecucaoInicio = System.nanoTime(); 
    
        if (inicio == fim) {
            long tempoDexecucaoFim = System.nanoTime();
            tempoDeExecucao = tempoDexecucaoFim - tempoDeExecucaoInicio; 
            return elementoVetor[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            int max1 = encontrarMaiorElementoRecursivo(inicio, meio);
            int max2 = encontrarMaiorElementoRecursivo(meio + 1, fim);
            if (max1 > max2) {
                long tempoDexecucaoFim = System.nanoTime(); 
                tempoDeExecucao = tempoDexecucaoFim - tempoDeExecucaoInicio; 
                return max1;
            } else {
                long tempoDexecucaoFim = System.nanoTime(); 
                tempoDeExecucao = tempoDexecucaoFim - tempoDeExecucaoInicio; 
                return max2;
            }
        }
    }
    /*
     *  Encontra o maior elemento de forma iterativa no vetor
     */
    public int encontrarMaiorElementoIterativo(int inicio, int fim) {
        long tempoDeExecucaoInicio = System.nanoTime(); 
        int maior = elementoVetor[inicio];

        for (int i = inicio + 1; i <= fim; i++) {
            if (elementoVetor[i] > maior) {
                maior = elementoVetor[i];
            }
        }
    
        long tempoDexecucaoFim = System.nanoTime(); 
        tempoDeExecucao = tempoDexecucaoFim - tempoDeExecucaoInicio; 
        return maior;
    }
}
        
