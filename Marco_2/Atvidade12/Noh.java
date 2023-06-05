package Marco_2.Atvidade12;

public class Noh {
    private Object informacao;
    private Noh proximo;
    
    public Noh (Object info){
        this.informacao = info;
        this.proximo = null;
    }

    public Object getInformacao() {
        return informacao;
    }
    public Noh getProximo() {
        return proximo;
    }
    public void setInformacao(Object informacao) {
        this.informacao = informacao;
    }
    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
}

