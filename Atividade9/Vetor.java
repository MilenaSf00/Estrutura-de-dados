package Atividade9;

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

    
    public int[] getElementos() {
        return elementoVetor;
    }

    //metodo bolha
    public void bubble_sort(){
        for(int i =0; i< this.tamanho;i++){
            for(int j=0;j<this.tamanho-1;j++){
                if(this.elementoVetor[j]>this.elementoVetor[j+1]){
                    int aux = this.elementoVetor[j];
                    this.elementoVetor[j] = this.elementoVetor[j+1];
                    this.elementoVetor[j+1] = aux;
                }
            }
        }

    }


    public void selection_sort(){
        for(int i = 0;i<this.tamanho;i++){
            int menor =1;
            for(int j = i+ 1;j<this.tamanho;j++){
                if (this.elementoVetor[j] < this.elementoVetor[menor]){
                    menor = j;
                    int aux = elementoVetor[i];
                    this.elementoVetor[i] = this.elementoVetor[menor];
                    this.elementoVetor[menor] = aux; 
                }
            }
        }
    }

    public void insertion_sort() {
        for (int i = 1; i < this.tamanho; i++) {
        int chave = this.elementoVetor[i];
        int j = i - 1;
        while (j >= 0 && chave < this.elementoVetor[j]) {
        this.elementoVetor[j + 1] = this.elementoVetor[j];
        j--;
        }
        this.elementoVetor[j + 1] = chave;
        }
        }

}