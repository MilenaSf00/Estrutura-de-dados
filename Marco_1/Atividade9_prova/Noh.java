package Atividade9_prova;

public class Noh {
    private int informacao;
    private Noh anterior;
    private Noh proximo;


    public Noh (int info){
        this.informacao = info;
        this.anterior = null;
        this.proximo = null;
    }

    public int getInformacao() {
        return informacao;
    }

    public Noh getProximo() {
        return proximo;
    }
    public Noh getAnterior() {
        return anterior;
    }
    public void setAnterior(Noh anterior) {
        this.anterior = anterior;
    }
    public void setInformacao(int informacao) {
        this.informacao = informacao;
    }
    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
}

