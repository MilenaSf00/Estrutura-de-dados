package Atividade4;

public class Noh <Object> {
    private Object informacao; 
    private Noh <Object>proximo;

    public Noh(Object informacao){
        this.informacao = informacao;
        this.proximo = null;
    }

    public Object getInformacao() {
        return informacao;
    }

    public Noh<Object> getProximo() {
        return proximo;
    }
    
    public void setProximo(Noh<Object> proximo) {
        this.proximo = proximo;
    }
}
