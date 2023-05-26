package Atividade6_prova;

public class Noh {
    private int informacao;
    private Noh anterior;
    private Noh proximo;


    public Noh(int informacao){
        this.informacao = informacao;
        this.anterior = null;
        this.proximo = null;
    }
    public Noh getAnterior() {
        return anterior;
    }
    public int getInformacao() {
        return informacao;
    }
    public Noh getProximo() {
        return proximo;
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
