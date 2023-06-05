package Marco_2.Atividade11;

public class FilaVet implements IFila{ 
    private int numeroElementoFila;
    private int inicio;
    private Object[] vetorFila;

    public FilaVet(int tamanhoFila){
        this.numeroElementoFila = 0;
        this.inicio = 0;
        this.vetorFila = new Object[tamanhoFila];
    }

    @Override
    public boolean adicionar(Object info) {
        if(this.numeroElementoFila == vetorFila.length){
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.numeroElementoFila)% this.vetorFila.length;
        this.vetorFila[fim] = info;
        this.numeroElementoFila++;
        return true;
    }

    @Override
    public boolean remover() {
        if (this.isEmpty()){ 
            System.out.println("Fila estah vazia");
            return false;
        }
            this.inicio = (this.inicio + 1) % this.vetorFila.length;
            this.numeroElementoFila--;
            return true;
    }
    @Override
    public boolean isEmpty() {
        if(numeroElementoFila == 0){
            return true;    
        }
        return false;
    }    

    @Override
    public int size() {
       return numeroElementoFila;
    }

    @Override
    public void imprimirLista() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        for (int i = 0; i < numeroElementoFila; i++) {
            int indice = (inicio + i) % vetorFila.length;
            System.out.println(vetorFila[indice]);
        }
    
    }
}

