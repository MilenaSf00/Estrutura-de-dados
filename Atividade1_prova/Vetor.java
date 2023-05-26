package Atividade1_prova;

public class Vetor {
    private int[] elementoVetor;
    private int tamanho;
    private int posicao = 0;

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
    public int[] getElementos() {
        return elementoVetor;
    }
    /*
     * Adiona um número no vetor. 
     * Verifica se o vetor está cheio. Caso estiver, o tamanho do vetor é dobrado.
     */
    public void adicionar(int numero){
        if (posicao >= elementoVetor.length) {
            int[] novoVetor = new int[elementoVetor.length * 2];
            System.arraycopy(elementoVetor, 0, novoVetor, 0, elementoVetor.length);
            elementoVetor = novoVetor;
        }
        elementoVetor[posicao] = numero;
        posicao++;
        tamanho = posicao; 
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

    public Vetor EncontrarIntersecao(Vetor vetor1, Vetor vetor2) {
        Vetor intersecao = new Vetor(tamanho); // Cria a interseção com tamanho inicial zero
        for (int i = 0; i < tamanho; i++) {
            int elementoAtual = elementoVetor[i];
    
            if (vetor1.ExisteNumero(elementoAtual) && vetor2.ExisteNumero(elementoAtual)) {
                intersecao.adicionar(elementoAtual);
            }
        }
        return intersecao;
    }

   public boolean contemElemento(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementoVetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }
    public void imprimeLista() {
        System.out.println("Lista: ");
        for (int i = 0; i < posicao; i++) {
            System.out.println(" - " + elementoVetor[i]);
        }
    }
}




       





    




