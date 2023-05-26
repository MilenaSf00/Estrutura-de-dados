package Atividade8;

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

    // busca binária em um vetor ordenado.
    public int buscaBinariaIterativa(int valor) {
        long tempoDeExecucaoInicio = System.nanoTime();
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (elementoVetor[meio] == valor) {
                long tempoDeExecucaoFim = System.nanoTime();
                tempoDeExecucao = tempoDeExecucaoFim - tempoDeExecucaoInicio;
                return meio;
            } else if (elementoVetor[meio] > valor) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        long tempoDeExecucaoFim = System.nanoTime();
        tempoDeExecucao = tempoDeExecucaoFim - tempoDeExecucaoInicio;
        return -1;
    }


   public int buscaBinariaRecursiva(int valor, int inicio, int fim) {
        long tempoDeExecucaoInicio = System.nanoTime();
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (elementoVetor[meio] == valor) {
            long tempoDeExecucaoFim = System.nanoTime();
            tempoDeExecucao = tempoDeExecucaoFim - tempoDeExecucaoInicio;
            return meio;
        } else if (elementoVetor[meio] > valor) {
            return buscaBinariaRecursiva(valor, inicio, meio - 1);
        } else {
            return buscaBinariaRecursiva(valor, meio + 1, fim);
        }
    }
}
        
