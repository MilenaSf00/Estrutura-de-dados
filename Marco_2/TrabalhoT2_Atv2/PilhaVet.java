package Marco_2.TrabalhoT2_Atv2;

public class PilhaVet implements IPilha {
    private Object[] pilha;
    private int numElem= 0;

    public PilhaVet (int tamanhoVetor){
        this.pilha = new Object[tamanhoVetor];
        
    }
    @Override
    public boolean Push(Object info) {
        if(this.numElem == pilha.length){
            System.out.println("pilha estorou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    @Override
    public Object Pop() {
        Object o = null;
        if(this.isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem --;
        return o;
    }

    @Override
    public Object top() {
        if (this.isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        return this.pilha[numElem - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.numElem == 0;
    }

    @Override
    public int size() {
        return this.numElem;  
    }
    
    public int getTamanhoVetor() {
        return pilha.length;
    }

    @Override
    public boolean palindromo(String palavra){ 
        PilhaVet pilhaLocal = new PilhaVet(palavra.length());
        for (int i = 0; i < palavra.length(); i++) {
            pilhaLocal.Push(palavra.charAt(i));
        }
        String palavraInversa = "";
        while (!pilhaLocal.isEmpty()) {
            palavraInversa += pilhaLocal.Pop();
        }

            if(palavraInversa.equals(palavra)){
                return true;
            }
        return false;
    }
    @Override
    public void printResultado(String palavra) {
        System.out.println("Palavra: " + palavra);
        System.out.println("É palíndromo? " + palindromo(palavra));
        System.out.println();
    }
}