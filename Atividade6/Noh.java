package Atividade6;

public class Noh<Object> {
    private Object informacao;
    private Noh<Object> anterior;
    private Noh <Object>proximo;


    public Noh ( Object info){
        this.informacao = info;
        this.anterior = null;
        this.proximo = null;
    }

    public Object getInformacao() {
        return informacao;
    }

    public Noh <Object>getProximo() {
        return proximo;
    }
    public Noh <Object>getAnterior() {
        return anterior;
    }
    public void setAnterior(Noh <Object> anterior) {
        this.anterior = anterior;
    }
    
    public void setInformacao(Object informacao) {
        this.informacao = informacao;
    }
    
    
    public void setProximo(Noh <Object> proximo) {
        this.proximo = proximo;
    }
}

